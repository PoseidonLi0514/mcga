package net.poseidon.mcga;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.poseidon.mcga.client.ItemProviderRegistry;
import net.poseidon.mcga.registry.BlockInit;
import net.poseidon.mcga.registry.ItemInit;

public class Main implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        ItemInit.registryItems();
        BlockInit.registryBlocks();
    }
}
