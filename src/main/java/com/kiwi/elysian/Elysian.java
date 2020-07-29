package com.kiwi.elysian;

import com.kiwi.elysian.blocks.Whitestone;
import com.kiwi.elysian.data.client.ModBlockStateProvider;
import com.kiwi.elysian.data.client.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
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

    public Elysian() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        // General Setup
        modBus.addListener(this::commonSetup);
        modBus.addListener(this::gatherData);

        modBus.addListener(this::imcEnqueue);
        modBus.addListener(this::imcProcess);

        MinecraftForge.EVENT_BUS.addListener(this::onServerStarting);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

        Elysian.LOGGER.debug("Common Setup");
    }

    private void imcEnqueue(InterModEnqueueEvent event) {
    }

    private void imcProcess(InterModProcessEvent event) {
    }

    private void onServerStarting(FMLServerStartingEvent event) {

    }

    public void gatherData(GatherDataEvent event) {

        DataGenerator gen = event.getGenerator();

        if (event.includeClient()) {
            ModBlockStateProvider blockstates = new ModBlockStateProvider(gen, event.getExistingFileHelper());
            gen.addProvider(blockstates);
            gen.addProvider(new ModItemModelProvider(gen, blockstates.getExistingHelper()));
        }

    }


}