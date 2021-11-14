package net.poseidon.mcga.common.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class CopperGroup
{
    public static final ItemGroup COPPER_GROUP = FabricItemGroupBuilder.create(new Identifier("mcga", "copper"))
            .icon(() -> new ItemStack(Items.COPPER_INGOT))
            .build();
}
