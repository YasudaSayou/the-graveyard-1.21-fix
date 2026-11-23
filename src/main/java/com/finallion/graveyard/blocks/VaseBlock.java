package com.finallion.graveyard.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;


public class VaseBlock extends Block implements SimpleWaterloggedBlock {
    public static final IntegerProperty VASES;
    public static final BooleanProperty WATERLOGGED;
    private static final VoxelShape VASE_SHAPE_ONE;
    private static final VoxelShape VASE_SHAPE_TWO;
    private static final VoxelShape VASE_SHAPE_THREE;
    private static final VoxelShape VASE_SHAPE_FOUR;



    public VaseBlock() {
        super(BlockBehaviour.Properties.of().instabreak().noCollission().noOcclusion().sound(SoundType.GLASS));
        this.registerDefaultState(this.getStateDefinition().any().setValue(VASES, 1).setValue(WATERLOGGED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(VASES, WATERLOGGED);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        BlockState blockstate = ctx.getLevel().getBlockState(ctx.getClickedPos());
        if (blockstate.is(this)) {
            return blockstate.setValue(VASES, Integer.valueOf(Math.min(4, blockstate.getValue(VASES) + 1)));
        } else {
            FluidState fluidstate = ctx.getLevel().getFluidState(ctx.getClickedPos());
            boolean flag = fluidstate.getType() == Fluids.WATER;
            return super.getStateForPlacement(ctx).setValue(WATERLOGGED, Boolean.valueOf(flag));
        }
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext ctx) {
        return !ctx.isSecondaryUseActive() && ctx.getItemInHand().getItem() == this.asItem() && state.getValue(VASES) < 4 ? true : super.canBeReplaced(state, ctx);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return switch(state.getValue(VASES)) {
            case 2 -> VASE_SHAPE_TWO;
            case 3 -> VASE_SHAPE_THREE;
            case 4 -> VASE_SHAPE_FOUR;
            default -> VASE_SHAPE_ONE;
        };
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        return Block.canSupportCenter(level, pos.below(), Direction.UP);
    }

    static {
        VASES = BlockStateProperties.CANDLES;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
        VASE_SHAPE_ONE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 12.0D, 12.0D);
        VASE_SHAPE_TWO = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 15.0D, 13.0D);
        VASE_SHAPE_THREE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
        VASE_SHAPE_FOUR = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    }
}
