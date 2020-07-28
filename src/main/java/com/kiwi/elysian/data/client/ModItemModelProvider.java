package com.kiwi.elysian.data.client;

import com.kiwi.elysian.Elysian;
import com.kiwi.elysian.blocks.Whitestone;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {

        super(generator, Elysian.MODID, existingFileHelper);

    }

    @Override
    public String getName() {
        return "Elysian Item Models";
    }

    @Override
    protected void registerModels() {

        blockItem(Whitestone.WHITESTONE);

    }

    private String name(IItemProvider item) {
        return item.asItem().getRegistryName().getPath();
    }

    private ItemModelBuilder blockItem(Block block) {
        return blockItem(block, "");
    }

    private ItemModelBuilder blockItem(Block block, String suffix) {
        return withExistingParent(name(block), modLoc("block/" + name(block) + suffix));
    }
}
