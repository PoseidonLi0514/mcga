package net.adehcby.mcga;

import net.adehcby.mcga.registry.BlockInit;
import net.adehcby.mcga.registry.ItemInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(McgaMain.MODID)
public class McgaMain {
    public static final String MODID = "mcga";

    public McgaMain()
    {
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
