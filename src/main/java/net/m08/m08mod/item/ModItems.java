package net.m08.m08mod.item;

import net.m08.m08mod.M08Mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.m08.m08mod.item.ModSmithingTemplateItem.*;

public class ModItems {
    public static final Item SHADOW_SHARD = registerItem("shadow_shard", new Item(new FabricItemSettings()));
    public static final Item BRIGHT_SHARD = registerItem("bright_shard", new Item(new FabricItemSettings()));
    public static final Item CREDIT = registerItem("credit", new Item(new FabricItemSettings()));
    public static final Item CREDIT_KEY = registerItem("credit_key", new Item(new FabricItemSettings()));

    public static final Item PRESTIGE_UPGRADE_SMITHING_TEMPLATE = registerItem("prestige_upgrade_smithing_template", new ModSmithingTemplateItem(
            PRESTIGE_UPGRADE_APPLIES_TO_TEXT, PRESTIGE_UPGRADE_INGREDIENTS_TEXT, PRESTIGE_UPGRADE_TEXT, PRESTIGE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, PRESTIGE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT,
            ModSmithingTemplateItem.getPrestigeUpgradeEmptyBaseSlotTextures(), ModSmithingTemplateItem.getPrestigeUpgradeEmptyAdditionsSlotTextures()));
    public static final Item CONDUIT_UPGRADE_SMITHING_TEMPLATE = registerItem("conduit_upgrade_smithing_template", new ModSmithingTemplateItem(
            CONDUIT_UPGRADE_APPLIES_TO_TEXT, CONDUIT_UPGRADE_INGREDIENTS_TEXT, CONDUIT_UPGRADE_TEXT, CONDUIT_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, CONDUIT_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT,
            ModSmithingTemplateItem.getConduitUpgradeEmptyBaseSlotTextures(), ModSmithingTemplateItem.getConduitUpgradeEmptyAdditionsSlotTextures()));

    public static final Item HAMMER = registerItem("hammer", new HammerItem(ModToolMaterial.HAMMER, 8, -3.5f, new FabricItemSettings()));

    private static void addItemToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(PRESTIGE_UPGRADE_SMITHING_TEMPLATE);
        entries.add(CONDUIT_UPGRADE_SMITHING_TEMPLATE);
    }

    private static void addItemToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(HAMMER);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(M08Mod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        M08Mod.LOGGER.info("Registering Mod Items for " + M08Mod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemToCombatItemGroup);
    }
}
