package com.finallion.graveyard.blocks;

import com.finallion.graveyard.config.GraveyardConfig;
import com.finallion.graveyard.init.TGParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MossBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.HitResult;

public class TGMossBlock extends MossBlock {


    public TGMossBlock(Properties settings) {
        super(settings);
    }

    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, LevelReader level, BlockPos pos, Player player) {
        return new ItemStack(Blocks.MOSS_BLOCK);
    }

    // graveyard fog
    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        if (GraveyardConfig.COMMON.enableMossParticle.get()) {
            if (random.nextInt(GraveyardConfig.COMMON.particleFrequency.get()) == 0) {
                if (world.isClientSide) {
                    world.addParticle(TGParticles.GRAVEYARD_FOG_PARTICLE.get(), (double) pos.getX() + random.nextDouble(), (double) pos.getY() + random.nextDouble(), (double) pos.getZ() + random.nextDouble(), 0.0D, 0.0D, 0.0D);
                }

            }

            if (random.nextInt(250) == 0) {
                world.addParticle(TGParticles.GRAVEYARD_HAND_PARTICLE.get(), (double)pos.getX() + random.nextDouble(), (double)pos.getY() + 1.2D, (double)pos.getZ() + random.nextDouble(), 0.0D, 0.0D, 0.0D);
            }
        }


    }


}
