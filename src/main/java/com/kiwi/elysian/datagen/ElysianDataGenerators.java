package com.kiwi.elysian.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IDataProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElysianDataGenerators {

    @SubscribeEvent
    public void gatherData(GatherDataEvent event) {
        final DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(elysianRecipeProvider(generator));
            generator.addProvider(elysianLootTableProvider(generator));
        }
        if (event.includeClient()) {
            generator.addProvider(elysianBlockStateProvider(generator, event.getExistingFileHelper()));
            generator.addProvider(elysianItemModelProvider(generator, event.getExistingFileHelper()));
        }
    }

    private static IDataProvider elysianItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        return new ElysianItemModelProvider(generator, existingFileHelper);
    }

    private static IDataProvider elysianBlockStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        return new ElysianBlockStateProvider(generator, existingFileHelper);
    }

    private static IDataProvider elysianLootTableProvider(DataGenerator generator) {
        return new ElysianLootTableProvider(generator);
    }

    private static IDataProvider elysianRecipeProvider(DataGenerator generator) {
        return new ElysianRecipeProvider(generator);
    }
}
