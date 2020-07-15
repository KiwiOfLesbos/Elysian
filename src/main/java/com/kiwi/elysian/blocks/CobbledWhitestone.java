package com.kiwi.elysian.blocks;

import com.kiwi.elysian.Elysian;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;

public class CobbledWhitestone extends Block {

    public CobbledWhitestone(String name) {
        super(Properties.create(Material.ROCK, MaterialColor.QUARTZ)
                .hardnessAndResistance(2.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)

        );

        this.setRegistryName(new ResourceLocation(Elysian.MODID, name));
    }

}
