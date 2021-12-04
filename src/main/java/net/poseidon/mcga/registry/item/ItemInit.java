package net.poseidon.mcga.registry.item;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.poseidon.mcga.common.item.CopperItems;

/**
 * @author poseidonLi
 * @created 2021/12/4(周六) 4:06
 * @description register items
 */
public class ItemInit
{
    public static void registryItems()
    {
        Registry.register(Registry.ITEM, new Identifier("mcga", "copper_sword"), CopperItems.COPPER_SWORD);
        Registry.register(Registry.ITEM, new Identifier("mcga", "copper_shovel"), CopperItems.COPPER_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("mcga", "copper_pickaxe"), CopperItems.COPPER_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("mcga", "copper_axe"), CopperItems.COPPER_AXE);
        Registry.register(Registry.ITEM, new Identifier("mcga", "copper_hoe"), CopperItems.COPPER_HOE);
        Registry.register(Registry.ITEM, new Identifier("mcga", "copper_helmet"), CopperItems.COPPER_HELMET);
        Registry.register(Registry.ITEM, new Identifier("mcga", "copper_chestplate"), CopperItems.COPPER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("mcga", "copper_leggings"), CopperItems.COPPER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("mcga", "copper_boots"), CopperItems.COPPER_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("mcga", "powered_copper_block"), CopperItems.POWERED_COPPER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("mcga", "powered_oxidized_copper"), CopperItems.POWERED_OXIDIZED_COPPER);
        Registry.register(Registry.ITEM, new Identifier("mcga", "powered_weathered_copper"), CopperItems.POWERED_WEATHERED_COPPER);
        Registry.register(Registry.ITEM, new Identifier("mcga", "powered_exposed_copper"), CopperItems.POWERED_EXPOSED_COPPER);
        Registry.register(Registry.ITEM, new Identifier("mcga", "copper_button"), CopperItems.COPPER_BUTTON);
    }
}
