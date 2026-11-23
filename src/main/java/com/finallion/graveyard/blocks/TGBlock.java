package com.finallion.graveyard.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.HitResult;

public class TGBlock extends Block {

    private final Block clickedBlock;

    public TGBlock(Block clickedBlock, Properties settings) {
        super(settings);
        this.clickedBlock = clickedBlock;
    }

    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, LevelReader level, BlockPos pos, Player player) {
        return new ItemStack(clickedBlock);
    }


}
