package com.kiwi.elysian.blocks.whitestone;

import com.kiwi.elysian.Elysian;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;

public class PolishedWhitestone extends Block {

    public PolishedWhitestone(String name) {
        super(Properties.create(Material.ROCK, MaterialColor.QUARTZ)
                .hardnessAndResistance(2.0f)
                .sound(SoundType.STONE)
                .func_235861_h_().harvestTool(ToolType.PICKAXE).harvestLevel(0)

        );

        this.setRegistryName(new ResourceLocation(Elysian.MODID, name));
    }

}
