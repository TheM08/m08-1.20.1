package net.m08.m08mod;

import net.m08.m08mod.block.ModBlocks;
import net.m08.m08mod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.m08.m08mod.item.ModItemsGroups;
import net.m08.m08mod.util.ModCustomTrades;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class M08Mod implements ModInitializer {
	public static final String MOD_ID = "m08mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerBlockS();
		ModItems.registerModItems();
		ModItemsGroups.registerItemGroups();

		ModCustomTrades.registerCustomTrades();
	}
}