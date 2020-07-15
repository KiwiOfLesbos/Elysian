package com.kiwi.elysian;

import com.kiwi.elysian.config.Config;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class SideProxy {

    SideProxy() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::commonSetup);

        MinecraftForge.EVENT_BUS.addListener(SideProxy::serverStarting);
    }

    private static void commonSetup(FMLCommonSetupEvent event) {
        Elysian.LOGGER.debug("Common Setup");
    }

    private static void serverStarting(FMLServerStartingEvent event) {

    }

    static class Client extends SideProxy {
        Client() {
            FMLJavaModLoadingContext.get().getModEventBus().addListener(Client::clientSetup);
        }

        private static void clientSetup(FMLClientSetupEvent event) {
        }
    }

    static class Server extends SideProxy {
        Server() {
            FMLJavaModLoadingContext.get().getModEventBus().addListener(Server::serverSetup);
        }

        private static void serverSetup(FMLDedicatedServerSetupEvent event) {

        }
    }



}
