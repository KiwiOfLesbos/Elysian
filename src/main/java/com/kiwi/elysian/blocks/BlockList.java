package com.kiwi.elysian.blocks;

import com.kiwi.elysian.blocks.whitestone.CobbledWhitestone;
import com.kiwi.elysian.blocks.whitestone.PolishedWhitestone;
import com.kiwi.elysian.blocks.whitestone.WhitestoneBlock;
import com.kiwi.elysian.blocks.whitestone.WhitestoneBrick;
import net.minecraft.block.Block;

public class BlockList {

    public static Block WHITESTONE = new WhitestoneBlock("whitestone");
    public static Block COBBLED_WHITESTONE = new CobbledWhitestone("cobbled_whitestone");
    public static Block POLISHED_WHITESTONE = new PolishedWhitestone("polished_whitestone");
    public static Block WHITESTONE_BRICK = new WhitestoneBrick("whitestone_brick");

}
