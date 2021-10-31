package net.adehcby.mcga.common.itemgroup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class CopperGroup extends CreativeModeTab
{
    public CopperGroup()
    {
        super("copper_group");
    }

    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(Items.COPPER_INGOT);
    }

    public static final CopperGroup COPPER_GROUP = new CopperGroup();
}
