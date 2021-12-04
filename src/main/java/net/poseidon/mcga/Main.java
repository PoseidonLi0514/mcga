package net.poseidon.mcga;

import net.fabricmc.api.ModInitializer;
import net.poseidon.mcga.registry.block.BlockInit;
import net.poseidon.mcga.registry.item.ItemInit;

/**
 * @author poseidonLi
 * @created 2021/12/4(周六) 3:43
 * @description
 */
public class Main implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        ItemInit.registryItems();
        BlockInit.registryBlocks();
    }
}
