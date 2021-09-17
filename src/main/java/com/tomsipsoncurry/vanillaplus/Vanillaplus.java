package com.tomsipsoncurry.vanillaplus;

import com.tomsipsoncurry.vanillaplus.registry.ModBlocks;
import com.tomsipsoncurry.vanillaplus.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Vanillaplus implements ModInitializer{

    public static final String MOD_ID = "vanilla-plus";

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        System.out.println("Hello World!");
        ModItems.registerItems();
        ModBlocks.RegisterBlocks();
    }
}
