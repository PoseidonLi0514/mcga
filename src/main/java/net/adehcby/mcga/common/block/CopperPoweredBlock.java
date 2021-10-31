package net.adehcby.mcga.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.WeatheringCopperFullBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class CopperPoweredBlock extends WeatheringCopperFullBlock
{
    public CopperPoweredBlock(WeatheringCopper.WeatherState p_154925_, BlockBehaviour.Properties p_154926_) {
        super(p_154925_, p_154926_);
    }
    @Override
    public boolean isSignalSource(BlockState p_55213_) {
        return true;
    }

    @Override
    public int getSignal(BlockState p_55208_, BlockGetter p_55209_, BlockPos p_55210_, Direction p_55211_) {
        return 15;
    }
}
