package net.poseidon.mcga.common.tool;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

/**
 * @author poseidonLi
 * @created 2021/12/4(周六) 4:04
 * @description
 */
public class CopperAxeItem extends AxeItem
{
    public CopperAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
