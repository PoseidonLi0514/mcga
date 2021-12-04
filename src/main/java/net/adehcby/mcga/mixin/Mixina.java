package net.adehcby.mcga.mixin;

import net.minecraft.world.item.enchantment.DigDurabilityEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DigDurabilityEnchantment.class)
public class Mixina
{
    /**
     * @author abc
     */
    @Inject(at = @At("TAIL"), method = "getMaxLevel", remap = false)
    public void getMaxLevel(CallbackInfoReturnable<Integer> cir)
    {
        System.out.println("FuckFuckFuckFuckFUCKFUCKFUCK");
    }
}
