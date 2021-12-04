package net.poseidon.mcga.common.tool;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

/**
 * @author poseidonLi
 * @created 2021/12/4(周六) 4:05
 * @description
 */
public class CopperHoeItem extends HoeItem
{
    public CopperHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
