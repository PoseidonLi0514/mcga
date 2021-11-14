package net.poseidon.mcga.common.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.UnbreakingEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class UnbreakingPEnchantment extends UnbreakingEnchantment
{
    protected UnbreakingPEnchantment(Enchantment.Rarity weight, EquipmentSlot... slotTypes)
    {
        super(weight, slotTypes);
    }

    @Override
    public int getMinPower(int level)
    {
        return 0;
    }

    @Override
    public int getMaxPower(int level)
    {
        return 0;
    }

    @Override
    public int getMaxLevel()
    {
        return 5;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack)
    {
        return stack.isDamageable() || super.isAcceptableItem(stack);
    }

    public static boolean shouldPreventDamage(ItemStack item, int level, Random random)
    {
        if (item.getItem() instanceof ArmorItem && random.nextFloat() < 0.6F)
        {
            return false;
        } else
        {
            return random.nextInt(level + 1) > 0;
        }
    }
}
