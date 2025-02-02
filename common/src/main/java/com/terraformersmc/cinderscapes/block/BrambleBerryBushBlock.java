package com.terraformersmc.cinderscapes.block;

import com.terraformersmc.cinderscapes.init.CinderscapesItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;

public class BrambleBerryBushBlock extends SweetBerryBushBlock {
    private static final VoxelShape SMALL_SHAPE = Block.createCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 8.0D, 13.0D);
    private static final VoxelShape MEDIUM_SHAPE = Block.createCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 13.0D, 13.0D);
    private static final VoxelShape LARGE_SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 14.0D, 14.0D);

    public BrambleBerryBushBlock(Settings settings) {
        super(settings);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state, boolean includeData) {
        return new ItemStack(CinderscapesItems.BRAMBLE_BERRIES);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (entity instanceof LivingEntity && entity.getType() != EntityType.HOGLIN && entity.getType() != EntityType.ZOGLIN) {
            entity.slowMovement(state, new Vec3d(0.800000011920929D, 0.75D, 0.800000011920929D));
            if (!world.isClient && state.get(AGE) > 0 && (entity.lastRenderX != entity.getX() || entity.lastRenderZ != entity.getZ())) {
                double d = Math.abs(entity.getX() - entity.lastRenderX);
                double e = Math.abs(entity.getZ() - entity.lastRenderZ);
                if (world instanceof ServerWorld serverWorld && (d >= 0.003000000026077032D || e >= 0.003000000026077032D)) {
                    entity.damage(serverWorld, world.getDamageSources().sweetBerryBush(), 1.0f);
                }
            }
        }
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(AGE)) {
            case 0 -> SMALL_SHAPE;
            case 1 -> MEDIUM_SHAPE;
            default -> LARGE_SHAPE;
        };
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        int age = state.get(AGE);

        if (age > 1) {
            int count = age - 1 + world.random.nextInt(2);
            dropStack(world, pos, new ItemStack(CinderscapesItems.BRAMBLE_BERRIES, count));
            world.playSound(null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0f, 0.8f + world.random.nextFloat() * 0.4f);
            BlockState newState = state.with(AGE, 1);
            world.setBlockState(pos, newState, 2);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, newState));

            return ActionResult.SUCCESS;
        }

        return super.onUse(state, world, pos, player, hit);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.NETHERRACK) || floor.isOf(Blocks.SOUL_SOIL) || floor.isOf(Blocks.SOUL_SAND) || floor.isOf(Blocks.GRAVEL);
    }

    public BlockState getGenerationState() {
        return this.getDefaultState().with(AGE, AGE.getValues().stream().max(Integer::compare).orElse(0));
    }
}
