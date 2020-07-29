package com.kiwi.elysian.data.client;

import com.kiwi.elysian.Elysian;
import com.kiwi.elysian.blocks.Whitestone;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.*;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {

        super(generator, Elysian.MODID, existingFileHelper);

    }

    public ExistingFileHelper getExistingHelper() {

        return models().existingFileHelper;
    }

    @Override
    public String getName() {

        return "Elysian Blockstates/Block Models";
    }

    @Override
    protected void registerStatesAndModels() {

        // Whitestone
        simpleBlock(Whitestone.WHITESTONE);
        simpleBlock(Whitestone.WHITESTONE_BRICK);
        simpleBlock(Whitestone.WHITESTONE_COBBLED);
        simpleBlock(Whitestone.WHITESTONE_POLISHED);

    }

    private String name(Block block) {

        return block.getRegistryName().getPath();
    }

    public ResourceLocation blockTexture(Block block) {
        ResourceLocation base = block.getRegistryName();
        return new ResourceLocation(base.getNamespace(), ModelProvider.BLOCK_FOLDER + "/" + base.getPath());
    }

    private ResourceLocation modBlockLoc(String texture) {

        return modLoc("block/" + texture);
    }

}
