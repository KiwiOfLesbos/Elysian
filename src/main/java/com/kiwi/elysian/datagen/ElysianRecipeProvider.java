package com.kiwi.elysian.datagen;

import java.io.IOException;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.RecipeProvider;
public class ElysianRecipeProvider extends RecipeProvider {
    public ElysianRecipeProvider(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void act(DirectoryCache cache) throws IOException {

    }

    @Override
    public String getName() {
        return null;
    }
}
