package com.kiwi.elysian.util;

import com.kiwi.elysian.Elysian;
import com.kiwi.elysian.data.DataGenerators;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class SideProxy {

    SideProxy() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::imcEnqueue);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::imcProcess);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(DataGenerators::gatherData);

        MinecraftForge.EVENT_BUS.addListener(SideProxy::serverStarting);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        Elysian.LOGGER.debug("Common Setup");
    }

    private static void serverStarting(FMLServerStartingEvent event) {

    }

    private void imcEnqueue(InterModEnqueueEvent event) {
    }

    private void imcProcess(InterModProcessEvent event) {
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
