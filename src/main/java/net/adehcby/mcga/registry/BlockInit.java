package net.adehcby.mcga.registry;

import net.adehcby.mcga.McgaMain;
import net.adehcby.mcga.common.block.CopperPoweredBlock;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.WeatheringCopperFullBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, McgaMain.MODID);
    public static final RegistryObject<Block> POWERED_COPPER_BLOCK =
            BLOCKS.register("powered_copper_block", () -> new CopperPoweredBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(4.0F, 6.0F).sound(SoundType.COPPER).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POWERED_OXIDIZED_COPPER =
            BLOCKS.register("powered_oxidized_copper", () -> new CopperPoweredBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).strength(4.0F, 6.0F).sound(SoundType.COPPER).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POWERED_WEATHERED_COPPER =
            BLOCKS.register("powered_weathered_copper", () -> new CopperPoweredBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).strength(4.0F, 6.0F).sound(SoundType.COPPER).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POWERED_EXPOSED_COPPER =
            BLOCKS.register("powered_exposed_copper", () -> new CopperPoweredBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).strength(4.0F, 6.0F).sound(SoundType.COPPER).requiresCorrectToolForDrops()));
}
