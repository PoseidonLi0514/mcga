package net.adehcby.mcga.registry;

import net.adehcby.mcga.McgaMain;
import net.adehcby.mcga.common.armor.CopperArmorMaterial;
import net.adehcby.mcga.common.itemgroup.CopperGroup;
import net.adehcby.mcga.common.tools.CopperToolsMaterial;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, McgaMain.MODID);
    //Tools

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

    //Armor

    public static final RegistryObject<Item> COPPER_HELMET =
            ITEMS.register("copper_helmet", () -> new ArmorItem(CopperArmorMaterial.COPPER, EquipmentSlot.HEAD, (new Item.Properties()).tab(CopperGroup.COPPER_GROUP)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE =
            ITEMS.register("copper_chestplate", () -> new ArmorItem(CopperArmorMaterial.COPPER, EquipmentSlot.CHEST, (new Item.Properties()).tab(CopperGroup.COPPER_GROUP)));
    public static final RegistryObject<Item> COPPER_LEGGINGS =
            ITEMS.register("copper_leggings", () -> new ArmorItem(CopperArmorMaterial.COPPER, EquipmentSlot.LEGS, (new Item.Properties()).tab(CopperGroup.COPPER_GROUP)));
    public static final RegistryObject<Item> COPPER_BOOTS =
            ITEMS.register("copper_boots", () -> new ArmorItem(CopperArmorMaterial.COPPER, EquipmentSlot.FEET, (new Item.Properties()).tab(CopperGroup.COPPER_GROUP)));

    //the others

    public static final RegistryObject<Item> POWERED_COPPER_BLOCK =
            ITEMS.register("powered_copper_block", () -> new BlockItem(BlockInit.POWERED_COPPER_BLOCK.get(), new Item.Properties().tab(CopperGroup.COPPER_GROUP)));
    public static final RegistryObject<Item> POWERED_OXIDIZED_COPPER =
            ITEMS.register("powered_oxidized_copper", () -> new BlockItem(BlockInit.POWERED_OXIDIZED_COPPER.get(), new Item.Properties().tab(CopperGroup.COPPER_GROUP)));
    public static final RegistryObject<Item> POWERED_WEATHERED_COPPER =
            ITEMS.register("powered_weathered_copper", () -> new BlockItem(BlockInit.POWERED_WEATHERED_COPPER.get(), new Item.Properties().tab(CopperGroup.COPPER_GROUP)));
    public static final RegistryObject<Item> POWERED_EXPOSED_COPPER =
            ITEMS.register("powered_exposed_copper", () -> new BlockItem(BlockInit.POWERED_EXPOSED_COPPER.get(), new Item.Properties().tab(CopperGroup.COPPER_GROUP)));
    public static final RegistryObject<Item> COPPER_BUTTON =
            ITEMS.register("copper_button", () -> new BlockItem(BlockInit.COPPER_BUTTON.get(), new Item.Properties().tab(CopperGroup.COPPER_GROUP)));

}