package net.adehcby.mcga.registry;

import net.adehcby.mcga.McgaMain;
import net.adehcby.mcga.common.itemgroup.CopperGroup;
import net.adehcby.mcga.common.tools.CopperToolsMaterial;
import net.minecraft.world.item.*;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.rmi.registry.Registry;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, McgaMain.MODID);
    public static final RegistryObject<Item> COPPER_SWORD =
            ITEMS.register("copper_sword", () -> new SwordItem(CopperToolsMaterial.COPPER, 2, -1.3f, new Item.Properties().tab(CopperGroup.COPPER_GROUP)));
    public static final RegistryObject<Item> COPPER_SHOVEL =
            ITEMS.register("copper_shovel",() -> new ShovelItem(CopperToolsMaterial.COPPER, 1.0f, 2.6f, new Item.Properties().tab(CopperGroup.COPPER_GROUP)));
    public static final RegistryObject<Item> COPPER_PICKAXE =
            ITEMS.register("copper_pickaxe", () -> new PickaxeItem(CopperToolsMaterial.COPPER, 1, -1.5f, new Item.Properties().tab(CopperGroup.COPPER_GROUP)));
    public static final RegistryObject<Item> COPPER_AXE =
            ITEMS.register("copper_axe", () -> new AxeItem(CopperToolsMaterial.COPPER, 3.5f, -3.0f, new Item.Properties().tab(CopperGroup.COPPER_GROUP)));
    public static final RegistryObject<Item> COPPER_HOE =
            ITEMS.register("copper_hoe", () -> new HoeItem(CopperToolsMaterial.COPPER, 0, 3.1f, new Item.Properties().tab(CopperGroup.COPPER_GROUP)));
}