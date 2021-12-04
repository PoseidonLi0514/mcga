package net.adehcby.mcga.common.tools;

import java.util.function.Supplier;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

/**
 * @author PoseidonLi
 */

public enum CopperToolsMaterial implements Tier {
    //铜材质
    COPPER(3, 372, 5.1f, 1.7F, 23, () -> {
        return Ingredient.of(new ItemStack(Items.COPPER_INGOT).getItem());
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    CopperToolsMaterial(int mineLevel, int maxUses, float efficiency, float attackDamage, int enchantValue, Supplier<Ingredient> repairItem) {
        this.level = mineLevel;
        this.uses =maxUses;
        this.speed = efficiency;
        this.damage =attackDamage;
        this.enchantmentValue = enchantValue;
        this.repairIngredient = new LazyLoadedValue<>(repairItem);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
