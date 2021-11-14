package net.poseidon.mcga.registry;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.poseidon.mcga.common.block.CopperBlocks;

public class BlockInit
{
    public static void registryBlocks()
    {
        Registry.register(Registry.BLOCK, new Identifier("mcga", "powered_copper_block"), CopperBlocks.POWERED_COPPER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("mcga", "powered_oxidized_copper"), CopperBlocks.POWERED_OXIDIZED_COPPER);
        Registry.register(Registry.BLOCK, new Identifier("mcga", "powered_weathered_copper"), CopperBlocks.POWERED_WEATHERED_COPPER);
        Registry.register(Registry.BLOCK, new Identifier("mcga", "powered_exposed_copper"), CopperBlocks.POWERED_EXPOSED_COPPER);
        Registry.register(Registry.BLOCK, new Identifier("mcga", "copper_button"), CopperBlocks.COPPER_BUTTON);
    }
}
