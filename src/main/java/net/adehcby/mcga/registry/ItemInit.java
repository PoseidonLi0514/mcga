package net.adehcby.mcga.registry;

import net.adehcby.mcga.McgaMain;
import net.adehcby.mcga.common.itemgroup.CopperGroup;
import net.adehcby.mcga.common.tools.CopperToolsMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, McgaMain.MODID);
    public static final RegistryObject<Item> COPPER_PICKAXE =
            ITEMS.register("copper_pickaxe", () -> new PickaxeItem(CopperToolsMaterial.COPPER, 1, -2.3f, new Item.Properties().tab(CopperGroup.COPPER_GROUP));
    public static final RegistryObject<Item> COPPER_PICKAXE =
            ITEMS.register("copper_pickaxe", () -> new PickaxeItem(CopperToolsMaterial.COPPER, 1, -2.3f, new Item.Properties().tab(CopperGroup.COPPER_GROUP)));
    public static final RegistryObject<Item> COPPER_AXE =
            ITEMS.register("copper_axe", () -> new AxeItem(CopperToolsMaterial.COPPER, 1.0f, 1.0f, new Item.Properties().tab(CopperGroup.COPPER_GROUP)));
}
