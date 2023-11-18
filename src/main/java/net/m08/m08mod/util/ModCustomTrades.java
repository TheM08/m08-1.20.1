package net.m08.m08mod.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.m08.m08mod.block.ModBlocks;
import net.m08.m08mod.item.ModItems;
import net.m08.m08mod.villagers.ModVillagers;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(ModVillagers.CREDIT_TRADER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CREDIT, 5),
                            new ItemStack(Items.GILDED_BLACKSTONE, 1),
                            5, 3, 0.5f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.CREDIT_TRADER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CREDIT, 3),
                            new ItemStack(Items.BOOKSHELF, 1),
                            new ItemStack(Items.CHISELED_BOOKSHELF, 1),
                            10, 3, 0.5f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.CREDIT_TRADER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CREDIT, 2),
                            new ItemStack(Items.SHEARS, 1),
                            5, 6, 0.5f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.CREDIT_TRADER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CREDIT, 20),
                            new ItemStack(Items.DIAMOND_AXE, 1),
                            2, 12, 0.5f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.CREDIT_TRADER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CREDIT, 25),
                            new ItemStack(ModItems.CREDIT_KEY, 1),
                            1, 12, 0.5f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.CREDIT_TRADER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CREDIT, 32),
                            new ItemStack(Items.CHEST, 2),
                            new ItemStack(ModBlocks.CREDIT_CHEST, 1),
                            2, 12, 0.5f));
                });


        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CREDIT, 3),
                            new ItemStack(Items.SPYGLASS, 1),
                            1, 12, 0.5f));
                });
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CREDIT, 2),
                            new ItemStack(Items.WRITABLE_BOOK, 1),
                            1, 12, 0.5f));
                });
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CREDIT, 5),
                            new ItemStack(Items.IRON_CHESTPLATE, 1),
                            1, 12, 0.5f));
                });
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CREDIT, 3),
                            new ItemStack(Items.IRON_HELMET, 1),
                            1, 12, 0.5f));
                });
    }
}
