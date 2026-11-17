package com.jennymod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("jenny_mod_official")
public class JennyModMain {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "jenny_mod_official";

    public JennyModMain() {
        LOGGER.info("Initializing Jenny Mod Official...");
    }

    @SubscribeEvent
    public void onCommonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Registering NPC entities and dialogue trees...");
        registerEntities();
        loadAnimations();
    }

    private void registerEntities() {
        String[] characters = {"Jenny", "Ellie", "Bia", "SlimeGirl"};
        for (String c : characters) {
            LOGGER.debug("Registered entity: " + c);
        }
    }

    private void loadAnimations() {
        // Load custom animation files for NPCs
        LOGGER.info("Loading blocky character animations...");
    }
}
