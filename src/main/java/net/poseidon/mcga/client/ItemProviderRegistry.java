package net.poseidon.mcga.client;

import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;
import net.poseidon.mcga.common.item.CopperItems;

/**
 * @author poseidonLi
 * @created 2021/12/4(周六) 4:13
 * @description
 */
public class ItemProviderRegistry
{
    public static void providerRegistry()
    {
        FabricModelPredicateProviderRegistry.register(CopperItems.COPPER_PICKAXE, new Identifier("damage"),
                (itemStack, clientWorld, livingEntity, i) ->
                        ((itemStack.getDamage() >= 279) ? 0.75F :
                                ((itemStack.getDamage() >= 186) ? 0.5F :
                                        ((itemStack.getDamage() >= 93) ? 0.25F : 0.0F)))
        );

        FabricModelPredicateProviderRegistry.register(CopperItems.COPPER_AXE, new Identifier("damage"),
                (itemStack, clientWorld, livingEntity, i) ->
                        (itemStack.getDamage() >= 279) ? 0.75F :
                                ((itemStack.getDamage() >= 186) ? 0.5F :
                                        ((itemStack.getDamage() >= 93) ? 0.25F : 0.0F))
        );

        FabricModelPredicateProviderRegistry.register(CopperItems.COPPER_SWORD, new Identifier("damage"),
                (itemStack, clientWorld, livingEntity, i) ->
                        (itemStack.getDamage() >= 279) ? 0.75F :
                                ((itemStack.getDamage() >= 186) ? 0.5F :
                                        ((itemStack.getDamage() >= 93) ? 0.25F : 0.0F)));

        FabricModelPredicateProviderRegistry.register(CopperItems.COPPER_HOE, new Identifier("damage"),
                (itemStack, clientWorld, livingEntity, i) ->
                        (itemStack.getDamage() >= 279) ? 0.75F :
                                ((itemStack.getDamage() >= 186) ? 0.5F :
                                        ((itemStack.getDamage() >= 93) ? 0.25F : 0.0F)));

        FabricModelPredicateProviderRegistry.register(CopperItems.COPPER_SHOVEL, new Identifier("damage"),
                (itemStack, clientWorld, livingEntity, i) ->
                        (itemStack.getDamage() >= 279) ? 0.75F :
                                ((itemStack.getDamage() >= 186) ? 0.5F :
                                        ((itemStack.getDamage() >= 93) ? 0.25F : 0.0F)));
        FabricModelPredicateProviderRegistry.register(CopperItems.COPPER_HELMET, new Identifier("damage"),
                (itemStack, clientWorld, livingEntity, i) ->
                        (itemStack.getDamage() >= 74) ? 0.75F :
                                ((itemStack.getDamage() >= 50) ? 0.5F :
                                        ((itemStack.getDamage() >= 25) ? 0.25F : 0.0F)));

        FabricModelPredicateProviderRegistry.register(CopperItems.COPPER_CHESTPLATE, new Identifier("damage"),
                (itemStack, clientWorld, livingEntity, i) ->
                        (itemStack.getDamage() >= 108) ? 0.75F :
                                ((itemStack.getDamage() >= 72) ? 0.5F :
                                        ((itemStack.getDamage() >= 36) ? 0.25F : 0.0F)));

        FabricModelPredicateProviderRegistry.register(CopperItems.COPPER_LEGGINGS, new Identifier("damage"),
                (itemStack, clientWorld, livingEntity, i) ->
                        (itemStack.getDamage() >= 101) ? 0.75F :
                                ((itemStack.getDamage() >= 68) ? 0.5F :
                                        ((itemStack.getDamage() >= 34) ? 0.25F : 0.0F)));

        FabricModelPredicateProviderRegistry.register(CopperItems.COPPER_BOOTS, new Identifier("damage"),
                (itemStack, clientWorld, livingEntity, i) ->
                        (itemStack.getDamage() >= 88) ? 0.75F :
                                ((itemStack.getDamage() >= 58) ? 0.5F :
                                        ((itemStack.getDamage() >= 29) ? 0.25F : 0.0F)));
    }
}
