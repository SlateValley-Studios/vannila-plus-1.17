package com.tomsipsoncurry.vanillaplus.registry;

import com.tomsipsoncurry.vanillaplus.Vanillaplus;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item WITHER_BONE = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Vanillaplus.MOD_ID, "wither_bone"), WITHER_BONE);
        Registry.register(Registry.ITEM, new Identifier(Vanillaplus.MOD_ID, "eucalyptus_log"), new BlockItem(ModBlocks.EUCALYPTUS_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Vanillaplus.MOD_ID, "eucalyptus_plank"), new BlockItem(ModBlocks.EUCALYPTUS_PLANK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Vanillaplus.MOD_ID, "purpur_wall"), new BlockItem(ModBlocks.PURPUR_WALL, new FabricItemSettings().group((ItemGroup.BUILDING_BLOCKS))));
    }
}
