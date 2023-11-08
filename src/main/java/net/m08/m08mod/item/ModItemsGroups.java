package net.m08.m08mod.item;

import net.m08.m08mod.M08Mod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroups {
    public static final ItemGroup PRESTIGE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(M08Mod.MOD_ID, "prestige_upgrade_smithing_template"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.prestige_upgrade_smithing_template"))
                    .icon(() -> new ItemStack(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModItems.CONDUIT_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModItems.HAMMER);

                        entries.add(Items.TURTLE_HELMET);

                    }).build());
    public static final ItemGroup ECLIPSE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(M08Mod.MOD_ID, "bright_shard"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bright_shard"))
                    .icon(() -> new ItemStack(ModItems.BRIGHT_SHARD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SHADOW_SHARD);
                        entries.add(ModItems.BRIGHT_SHARD);

                    }).build());
    public static final ItemGroup CREDIT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(M08Mod.MOD_ID, "credit"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.credit"))
                    .icon(() -> new ItemStack(ModItems.CREDIT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CREDIT);

                    }).build());
    public static final ItemGroup MINECRAFT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(M08Mod.MOD_ID, "grass_block"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.grass_block"))
                    .icon(() -> new ItemStack(Items.GRASS_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(Items.GRASS_BLOCK);
                        entries.add(Items.DIRT);
                        entries.add(Items.OAK_LOG);
                        entries.add(Items.OAK_PLANKS);
                        entries.add(Items.STICK);
                        entries.add(Items.CRAFTING_TABLE);
                        entries.add(Items.CHEST);
                        entries.add(Items.STONE);
                        entries.add(Items.GOLD_ORE);
                        entries.add(Items.GOLD_NUGGET);
                        entries.add(Items.GOLD_INGOT);
                        entries.add(Items.GOLD_BLOCK);
                        entries.add(Items.IRON_ORE);
                        entries.add(Items.IRON_INGOT);
                        entries.add(Items.IRON_BLOCK);
                        entries.add(Items.DIAMOND_ORE);
                        entries.add(Items.DIAMOND);
                        entries.add(Items.DIAMOND_BLOCK);
                        entries.add(Items.APPLE);
                        entries.add(Items.GOLDEN_APPLE);
                        entries.add(Items.ENCHANTED_GOLDEN_APPLE);
                        entries.add(Items.BEEF);
                        entries.add(Items.COOKED_BEEF);
                        entries.add(Items.LEATHER);
                        entries.add(Items.BUCKET);
                        entries.add(Items.WATER_BUCKET);
                        entries.add(Items.LAVA_BUCKET);
                        entries.add(Items.OBSIDIAN);
                        entries.add(Items.BLAZE_ROD);
                        entries.add(Items.BLAZE_POWDER);
                        entries.add(Items.ENDER_PEARL);
                        entries.add(Items.ENDER_EYE);
                        entries.add(Items.ENDER_CHEST);
                        entries.add(Items.WOODEN_PICKAXE);
                        entries.add(Items.STONE_PICKAXE);
                        entries.add(Items.IRON_PICKAXE);
                        entries.add(Items.DIAMOND_PICKAXE);
                        entries.add(Items.WOODEN_SWORD);
                        entries.add(Items.STONE_SWORD);
                        entries.add(Items.IRON_SWORD);
                        entries.add(Items.LEATHER_HELMET);
                        entries.add(Items.LEATHER_CHESTPLATE);
                        entries.add(Items.LEATHER_LEGGINGS);
                        entries.add(Items.LEATHER_BOOTS);
                        entries.add(Items.IRON_HELMET);
                        entries.add(Items.IRON_CHESTPLATE);
                        entries.add(Items.IRON_LEGGINGS);
                        entries.add(Items.IRON_BOOTS);

                        entries.add(ModItems.HAMMER);

                    }).build());

    public static void registerItemGroups() {
        M08Mod.LOGGER.info("Registering Item Groups for " + M08Mod.MOD_ID);
    }
}
