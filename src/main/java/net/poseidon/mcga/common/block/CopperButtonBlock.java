package net.poseidon.mcga.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

/**
 * @author poseidonLi
 * @created 2021/12/4(周六) 4:03
 * @description CopperButtonBlock
 */
public class CopperButtonBlock extends AbstractButtonBlock
{
    protected CopperButtonBlock(AbstractBlock.Settings settings)
    {
        super(false, settings);
    }

    @Override
    protected SoundEvent getClickSound(boolean powered)
    {
        return powered ? SoundEvents.BLOCK_METAL_PRESSURE_PLATE_CLICK_ON : SoundEvents.BLOCK_METAL_PRESSURE_PLATE_CLICK_OFF;
    }
}
