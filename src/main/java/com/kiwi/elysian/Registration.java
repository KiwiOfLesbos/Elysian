package com.kiwi.elysian;

import com.kiwi.elysian.blocks.BlockList;
import com.kiwi.elysian.items.ItemList;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Elysian.MODID)
@Mod.EventBusSubscriber(modid = Elysian.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Registration {

    @SubscribeEvent
    public static void onBlockRegistry(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(BlockList.WHITESTONE);
        event.getRegistry().register(BlockList.COBBLED_WHITESTONE);
        event.getRegistry().register(BlockList.POLISHED_WHITESTONE);
    }

    @SubscribeEvent
    public static void onItemRegistry(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(ItemList.WHITESTONE);
        event.getRegistry().register(ItemList.COBBLED_WHITESTONE);
        event.getRegistry().register(ItemList.POLISHED_WHITESTONE);
    }

}
