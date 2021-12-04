package net.poseidon.mcga.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/**
 * @author poseidonLi
 * @created 2021/12/4(周六) 3:46
 * @description
 */
@Environment(EnvType.CLIENT)
public class ClientMain implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        ItemProviderRegistry.providerRegistry();
    }
}
