package net.adehcby.mcga.common.tools.item;

import net.adehcby.mcga.McgaMain;
import net.adehcby.mcga.registry.ItemInit;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ItemPropertyFunction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PropertyRegistry
{
    @SubscribeEvent
    public static void copperPickaxeOverrideRegistry(FMLClientSetupEvent event)
    {
        event.enqueueWork(() ->
                ItemProperties.register(ItemInit.COPPER_PICKAXE.get(),
                        new ResourceLocation(McgaMain.MODID, "damage"),
                        (itemStack, clientLevel, livingEntity, idk) -> itemStack.getDamageValue()
                )
        );
    }
    @SubscribeEvent
    public static void copperSwordOverrideRegistry(FMLClientSetupEvent event)
    {
        event.enqueueWork(() ->
                ItemProperties.register(ItemInit.COPPER_SWORD.get(),
                        new ResourceLocation(McgaMain.MODID, "damage"),
                        (itemStack, clientLevel, livingEntity, idk) -> itemStack.getDamageValue()
                )
        );
    }

    @SubscribeEvent
    public static void copperHoeOverrideRegistry(FMLClientSetupEvent event)
    {
        event.enqueueWork(() ->
                ItemProperties.register(ItemInit.COPPER_HOE.get(),
                        new ResourceLocation(McgaMain.MODID, "damage"),
                        (itemStack, clientLevel, livingEntity, idk) -> itemStack.getDamageValue()
                )
        );
    }

    @SubscribeEvent
    public static void copperShovelOverrideRegistry(FMLClientSetupEvent event)
    {
        event.enqueueWork(() ->
                ItemProperties.register(ItemInit.COPPER_SHOVEL.get(),
                        new ResourceLocation(McgaMain.MODID, "damage"),
                        (itemStack, clientLevel, livingEntity, idk) -> itemStack.getDamageValue()
                )
        );
    }

    @SubscribeEvent
    public static void copperAxeOverrideRegistry(FMLClientSetupEvent event)
    {
        event.enqueueWork(() ->
                ItemProperties.register(ItemInit.COPPER_AXE.get(),
                        new ResourceLocation(McgaMain.MODID, "damage"),
                        (itemStack, clientLevel, livingEntity, idk) -> itemStack.getDamageValue()
                )
        );
    }

    @SubscribeEvent
    public static void copperHelmetOverrideRegistry(FMLClientSetupEvent event)
    {
        event.enqueueWork(() ->
                ItemProperties.register(ItemInit.COPPER_HELMET.get(),
                        new ResourceLocation(McgaMain.MODID, "damage"),
                        (itemStack, clientLevel, livingEntity, idk) -> itemStack.getDamageValue()
                )
        );
    }

    @SubscribeEvent
    public static void copperChestplateOverrideRegistry(FMLClientSetupEvent event)
    {
        event.enqueueWork(() ->
                ItemProperties.register(ItemInit.COPPER_CHESTPLATE.get(),
                        new ResourceLocation(McgaMain.MODID, "damage"),
                        (itemStack, clientLevel, livingEntity, idk) -> itemStack.getDamageValue()
                )
        );
    }

    @SubscribeEvent
    public static void copperLeggingsOverrideRegistry(FMLClientSetupEvent event)
    {
        event.enqueueWork(() ->
                ItemProperties.register(ItemInit.COPPER_LEGGINGS.get(),
                        new ResourceLocation(McgaMain.MODID, "damage"),
                        (itemStack, clientLevel, livingEntity, idk) -> itemStack.getDamageValue()
                )
        );
    }

    @SubscribeEvent
    public static void copperBootsOverrideRegistry(FMLClientSetupEvent event)
    {
        event.enqueueWork(() ->
                ItemProperties.register(ItemInit.COPPER_BOOTS.get(),
                        new ResourceLocation(McgaMain.MODID, "damage"),
                        (itemStack, clientLevel, livingEntity, idk) -> itemStack.getDamageValue()
                )
        );
    }
}
