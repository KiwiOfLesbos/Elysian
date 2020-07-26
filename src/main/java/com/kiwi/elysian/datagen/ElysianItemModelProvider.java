package com.kiwi.elysian.datagen;

import com.kiwi.elysian.Elysian;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;
public class ElysianItemModelProvider extends ItemModelProvider {
    public ElysianItemModelProvider(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, Elysian.MODID, fileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
