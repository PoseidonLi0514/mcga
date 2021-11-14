package net.poseidon.mcga.common.block;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

public class CopperBlocks
{
    public static final Block POWERED_COPPER_BLOCK =
            new PoweredCopperBlock(Oxidizable.OxidizationLevel.UNAFFECTED, AbstractBlock.Settings.of(Material.METAL, MapColor.ORANGE).strength(4.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block POWERED_OXIDIZED_COPPER =
            new PoweredCopperBlock(Oxidizable.OxidizationLevel.OXIDIZED, AbstractBlock.Settings.of(Material.METAL, MapColor.TEAL).strength(4.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block POWERED_WEATHERED_COPPER =
            new PoweredCopperBlock(Oxidizable.OxidizationLevel.WEATHERED, AbstractBlock.Settings.of(Material.METAL, MapColor.DARK_AQUA).strength(4.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block POWERED_EXPOSED_COPPER =
            new PoweredCopperBlock(Oxidizable.OxidizationLevel.EXPOSED, AbstractBlock.Settings.of(Material.METAL, MapColor.TERRACOTTA_LIGHT_GRAY).strength(4.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block COPPER_BUTTON =
            new CopperButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5F));
}
