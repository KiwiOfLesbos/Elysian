package com.kiwi.elysian;

import com.kiwi.elysian.blocks.Whitestone;
import com.kiwi.elysian.data.DataGenerators;
import com.kiwi.elysian.util.SideProxy;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Elysian.MODID)
public class Elysian {

    public static final String MODID = "elysian";
    public static final Logger LOGGER = LogManager.getLogger();


    public static final ItemGroup TAB = new ItemGroup("elysianTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Whitestone.WHITESTONE_BRICK);
        }
    };

    Elysian() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::imcEnqueue);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::imcProcess);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(DataGenerators::gatherData);

        MinecraftForge.EVENT_BUS.addListener(this::onServerStarting);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        Elysian.LOGGER.debug("Common Setup");
    }

    private void onServerStarting(FMLServerStartingEvent event) {

    }

    private void imcEnqueue(InterModEnqueueEvent event) {
    }

    private void imcProcess(InterModProcessEvent event) {
    }



}