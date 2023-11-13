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
                            new ItemStack(ModItems.CREDIT, 32),
                            new ItemStack(Blocks.CHEST, 2),
                            new ItemStack(ModBlocks.CREDIT_CHEST, 1),
                            1, 12, 0.05f));
                });

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CREDIT, 3),
                            new ItemStack(Items.SPYGLASS, 1),
                            1, 12, 0.075f));
                });
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CREDIT, 2),
                            new ItemStack(Items.WRITABLE_BOOK, 1),
                            1, 12, 0.075f));
                });
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CREDIT, 5),
                            new ItemStack(Items.IRON_CHESTPLATE, 1),
                            1, 12, 0.075f));
                });
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CREDIT, 3),
                            new ItemStack(Items.IRON_HELMET, 1),
                            1, 12, 0.075f));
                });
    }
}
