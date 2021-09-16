    package com.tomsipsoncurry.vanillaplus.registry;

    import com.tomsipsoncurry.vanillaplus.Vanillaplus;
    import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
    import net.minecraft.block.Block;
    import net.minecraft.block.Material;
    import net.minecraft.block.PillarBlock;
    import net.minecraft.block.WallBlock;
    import net.minecraft.util.Identifier;
    import net.minecraft.util.registry.Registry;

    public class ModBlocks {
        public static final Block EUCALYPTUS_LOG = new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f));
        public static final Block PURPUR_WALL = new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2.0F));
        public static void RegisterBlocks() {
            Registry.register(Registry.BLOCK, new Identifier(Vanillaplus.MOD_ID, "eucalyptus_log"), EUCALYPTUS_LOG);
            Registry.register(Registry.BLOCK, new Identifier(Vanillaplus.MOD_ID, "purpur_wall"), PURPUR_WALL);
    }
    }
