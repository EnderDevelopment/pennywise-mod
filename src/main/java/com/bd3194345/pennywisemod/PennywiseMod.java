package com.bd3194345.pennywisemod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("pennywisemod")
public
class PennywiseMod {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "pennywisemod";

    public PennywiseMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register items, blocks, and entities
        ModItems.register(modEventBus);
        ModEntities.register(modEventBus);

        // Register ourselves for server and other game events
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}
