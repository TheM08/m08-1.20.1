package net.m08.m08mod.datagen;

import net.m08.m08mod.block.ModBlocks;
import net.m08.m08mod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CONDUIT_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRIGHT_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHADOW_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CREDIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CREDIT_KEY, Models.GENERATED);

        itemModelGenerator.register(ModItems.HAMMER, Models.HANDHELD);
    }
}
