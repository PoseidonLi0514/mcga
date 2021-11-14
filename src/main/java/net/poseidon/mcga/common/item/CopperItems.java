package net.poseidon.mcga.common.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.poseidon.mcga.common.aromr.CopperArmorMaterial;
import net.poseidon.mcga.common.block.CopperBlocks;
import net.poseidon.mcga.common.itemgroup.CopperGroup;
import net.poseidon.mcga.common.tool.CopperAxeItem;
import net.poseidon.mcga.common.tool.CopperHoeItem;
import net.poseidon.mcga.common.tool.CopperPickaxeItem;
import net.poseidon.mcga.common.tool.CopperToolMaterial;

public class CopperItems
{
    /**
     * Tools
     */
    public static final Item COPPER_SWORD =
            new SwordItem(CopperToolMaterial.COPPER, 2, -1.3f, new Item.Settings().group(CopperGroup.COPPER_GROUP));
    public static final Item COPPER_SHOVEL =
            new ShovelItem(CopperToolMaterial.COPPER, 1.0f, 2.6f, new Item.Settings().group(CopperGroup.COPPER_GROUP));
    public static final Item COPPER_PICKAXE =
            new CopperPickaxeItem(CopperToolMaterial.COPPER, 1, -1.5f, new Item.Settings().group(CopperGroup.COPPER_GROUP));
    public static final Item COPPER_AXE =
            new CopperAxeItem(CopperToolMaterial.COPPER, 3.5f, -3.0f, new Item.Settings().group(CopperGroup.COPPER_GROUP));
    public static final Item COPPER_HOE =
            new CopperHoeItem(CopperToolMaterial.COPPER, 0, 3.1f, new Item.Settings().group(CopperGroup.COPPER_GROUP));

    /**
     * Armor
     */
    public static final Item COPPER_HELMET =
            new ArmorItem(CopperArmorMaterial.COPPER, EquipmentSlot.HEAD, new Item.Settings().group(CopperGroup.COPPER_GROUP));
    public static final Item COPPER_CHESTPLATE =
            new ArmorItem(CopperArmorMaterial.COPPER, EquipmentSlot.CHEST, new Item.Settings().group(CopperGroup.COPPER_GROUP));
    public static final Item COPPER_LEGGINGS =
            new ArmorItem(CopperArmorMaterial.COPPER, EquipmentSlot.LEGS, new Item.Settings().group(CopperGroup.COPPER_GROUP));
    public static final Item COPPER_BOOTS =
            new ArmorItem(CopperArmorMaterial.COPPER, EquipmentSlot.FEET, new Item.Settings().group(CopperGroup.COPPER_GROUP));

    /**
     * others
     */
    public static final Item POWERED_COPPER_BLOCK =
            new BlockItem(CopperBlocks.POWERED_COPPER_BLOCK, new Item.Settings().group(CopperGroup.COPPER_GROUP));
    public static final Item POWERED_OXIDIZED_COPPER =
            new BlockItem(CopperBlocks.POWERED_OXIDIZED_COPPER, new Item.Settings().group(CopperGroup.COPPER_GROUP));
    public static final Item POWERED_WEATHERED_COPPER =
            new BlockItem(CopperBlocks.POWERED_WEATHERED_COPPER, new Item.Settings().group(CopperGroup.COPPER_GROUP));
    public static final Item POWERED_EXPOSED_COPPER =
            new BlockItem(CopperBlocks.POWERED_EXPOSED_COPPER, new Item.Settings().group(CopperGroup.COPPER_GROUP));
    public static final Item COPPER_BUTTON =
            new BlockItem(CopperBlocks.COPPER_BUTTON, new Item.Settings().group(CopperGroup.COPPER_GROUP));

}
