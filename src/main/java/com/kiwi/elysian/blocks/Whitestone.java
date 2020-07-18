package com.kiwi.elysian.blocks;

import com.google.common.collect.Lists;
import com.kiwi.elysian.Elysian;
import com.kiwi.elysian.util.CustomStairs;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;

import java.util.List;

public class Whitestone {

    public static List<Block> BLOCKS = Lists.newArrayList();
    public static List<Item> BLOCK_ITEMS = Lists.newArrayList();

    public static Block WHITESTONE = register("whitestone", new Block(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).func_235861_h_().harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static Block COBBLED_WHITESTONE = register("cobbled_whitestone", new Block(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).func_235861_h_().harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static Block POLISHED_WHITESTONE = register("polished_whitestone", new Block(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).func_235861_h_().harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static Block WHITESTONE_BRICK = register("whitestone_brick", new Block(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5f, 6.0f).sound(SoundType.STONE).func_235861_h_().harvestTool(ToolType.PICKAXE).harvestLevel(0)));

    public static final Block WHITESTONE_SLAB = register("whitestone_slab", new SlabBlock(Block.Properties.from(WHITESTONE)));

    public static final Block WHITESTONE_WALL = register("whitestone_wall", new WallBlock(Block.Properties.from(WHITESTONE)));

    public static final Block WHITESTONE_STAIRS = register("whitestone_stairs", new CustomStairs(WHITESTONE.getDefaultState(), Block.Properties.from(WHITESTONE)));


    private static Block register(String registryName, Block thisBlock) {
        thisBlock.setRegistryName(registryName);
        BLOCKS.add(thisBlock);

        Item.Properties properties = new Item.Properties().group(Elysian.TAB);
        BlockItem thisBlockItem = new BlockItem(thisBlock, properties);
        BLOCK_ITEMS.add(thisBlockItem.setRegistryName(registryName));

        return thisBlock;
    }

    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        for(Block thisBlock : BLOCKS){
            event.getRegistry().register(thisBlock);
        }
    }

    public static void registerBlockItems(final RegistryEvent.Register<Item> event){
        for(Item thisBlockItem : BLOCK_ITEMS){
            event.getRegistry().register(thisBlockItem);
        }
    }

}
