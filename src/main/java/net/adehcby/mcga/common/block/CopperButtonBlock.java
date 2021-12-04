package net.adehcby.mcga.common.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CopperButtonBlock extends ButtonBlock
{
    public CopperButtonBlock(BlockBehaviour.Properties p_57060_) {
        super(false, p_57060_);
    }

    @Override
    protected SoundEvent getSound(boolean p_57062_) {
        return p_57062_ ? SoundEvents.METAL_PRESSURE_PLATE_CLICK_ON : SoundEvents.METAL_PRESSURE_PLATE_CLICK_OFF;
    }
}
