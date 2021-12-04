package net.poseidon.mcga.common.tool;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

/**
 * @author poseidonLi
 * @created 2021/12/4(周六) 4:05
 * @description
 */
public class CopperPickaxeItem extends PickaxeItem
{
    public CopperPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
