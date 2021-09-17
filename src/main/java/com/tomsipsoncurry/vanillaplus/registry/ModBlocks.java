    package com.tomsipsoncurry.vanillaplus.registry;

    import com.tomsipsoncurry.vanillaplus.Vanillaplus;
    import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
    import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
    import net.minecraft.block.*;
    import net.minecraft.sound.BlockSoundGroup;
    import net.minecraft.util.Identifier;
    import net.minecraft.util.registry.Registry;

    public class ModBlocks {
        public static final Block EUCALYPTUS_LOG = new PillarBlock(FabricBlockSettings
                .copyOf(Blocks.OAK_LOG)
        );
        public static final Block EUCALYPTUS_PLANKS = new Block(FabricBlockSettings
                .copyOf(Blocks.OAK_PLANKS)
        );
        public static final Block PURPUR_WALL = new WallBlock(FabricBlockSettings
                .copyOf(Blocks.PURPUR_BLOCK)
        );
        public static void RegisterBlocks() {
            Registry.register(Registry.BLOCK, new Identifier(Vanillaplus.MOD_ID, "eucalyptus_log"), EUCALYPTUS_LOG);
            Registry.register(Registry.BLOCK, new Identifier(Vanillaplus.MOD_ID, "eucalyptus_plank"), EUCALYPTUS_PLANKS);
            Registry.register(Registry.BLOCK, new Identifier(Vanillaplus.MOD_ID, "purpur_wall"), PURPUR_WALL);
    }
    }
