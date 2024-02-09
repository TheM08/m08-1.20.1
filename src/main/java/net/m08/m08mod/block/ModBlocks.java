package net.m08.m08mod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.m08.m08mod.M08Mod;
import net.minecraft.block.Block;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.EnderChestBlock;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CREDIT_CHEST = registerBlock("credit_chest",
            new EnderChestBlock(FabricBlockSettings.create()));

    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(M08Mod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(M08Mod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlockS() {
        M08Mod.LOGGER.info("Registering ModBlocks for " + M08Mod.MOD_ID);
    }
}