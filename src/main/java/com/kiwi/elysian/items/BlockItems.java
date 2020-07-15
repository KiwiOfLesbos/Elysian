package com.kiwi.elysian.items;

import com.kiwi.elysian.Elysian;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.ResourceLocation;

public class BlockItems extends BlockItem {

    public BlockItems(Block blockIn) {
        super(blockIn, new Properties().group(Elysian.TAB));
        setRegistryName(blockIn.getRegistryName());
    }

}
