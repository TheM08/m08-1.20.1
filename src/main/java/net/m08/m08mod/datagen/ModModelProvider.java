package net.m08.m08mod.datagen;

import net.m08.m08mod.block.ModBlocks;
import net.m08.m08mod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CREDIT_CHEST);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CONDUIT_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHARD_OF_LIGHT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHARD_OF_DARKNESS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CREDIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CREDIT_KEY, Models.GENERATED);

        itemModelGenerator.register(ModItems.HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.M08_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRESTIGE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRESTIGE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRESTIGE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRESTIGE_BOOTS, Models.GENERATED);
    }
}
