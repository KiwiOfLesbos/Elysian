package com.kiwi.elysian;

import com.kiwi.elysian.blocks.Whitestone;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Registry {
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        Whitestone.registerBlocks(event);
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        Whitestone.registerBlockItems(event);
    }
}
