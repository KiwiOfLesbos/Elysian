package com.kiwi.elysian.datagen;

import com.kiwi.elysian.Elysian;
import net.minecraft.block.SlabBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.state.properties.SlabType;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
public class ElysianBlockStateProvider extends BlockStateProvider {
    public ElysianBlockStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Elysian.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // TODO first, try making a cobblestone panel!
        //slabBlock();

        getVariantBuilder(block)
                .partialState().with(SlabBlock.TYPE, SlabType.BOTTOM).addModels(new ConfiguredModel(bottom))
                .partialState().with(SlabBlock.TYPE, SlabType.TOP).addModels(new ConfiguredModel(top))
                .partialState().with(SlabBlock.TYPE, SlabType.DOUBLE).addModels(new ConfiguredModel(doubleslab));
    }
}
