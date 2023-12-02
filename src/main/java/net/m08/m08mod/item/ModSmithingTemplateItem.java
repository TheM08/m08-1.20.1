package net.m08.m08mod.item;
import net.m08.m08mod.M08Mod;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;

public class ModSmithingTemplateItem extends SmithingTemplateItem {

    private static final Formatting TITLE_FORMATTING = Formatting.GRAY;
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;

    private static final String TRANSLATION_KEY = Util.createTranslationKey("item", new Identifier("smithing_template"));

    private static final Identifier EMPTY_SLOT_HELMET_TEXTURE;
    private static final Identifier EMPTY_SLOT_CHESTPLATE_TEXTURE;
    private static final Identifier EMPTY_SLOT_LEGGINGS_TEXTURE;
    private static final Identifier EMPTY_SLOT_BOOTS_TEXTURE;
    private static final Identifier EMPTY_SLOT_SWORD_TEXTURE;
    private static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE;
    private static final Identifier EMPTY_SLOT_AXE_TEXTURE;
    private static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE;
    private static final Identifier EMPTY_SLOT_HOE_TEXTURE;
    private static final Identifier EMPTY_SLOT_INGOT_TEXTURE;
    private static final Identifier EMPTY_SLOT_NETHER_STAR_TEXTURE;
    private static final Identifier EMPTY_SLOT_NETHERITE_HELMET_TEXTURE;
    private static final Identifier EMPTY_SLOT_NETHERITE_BOOTS_TEXTURE;
    private static final Identifier EMPTY_SLOT_TURTLE_HELMET;

    public static final Text PRESTIGE_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.prestige_upgrade_smithing_template.title"))).formatted(TITLE_FORMATTING);
    public static final Text PRESTIGE_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.prestige_upgrade_smithing_template.applies_to"))).formatted(DESCRIPTION_FORMATTING);
    public static final Text PRESTIGE_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.prestige_upgrade_smithing_template.ingredients"))).formatted(DESCRIPTION_FORMATTING);
    public static final Text PRESTIGE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.prestige_upgrade_smithing_template.base_slot_description")));
    public static final Text PRESTIGE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.prestige_upgrade_smithing_template.additions_slot_description")));
    public static final Text CONDUIT_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.conduit_upgrade_smithing_template.title"))).formatted(TITLE_FORMATTING);
    public static final Text CONDUIT_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.conduit_upgrade_smithing_template.applies_to"))).formatted(DESCRIPTION_FORMATTING);
    public static final Text CONDUIT_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.conduit_upgrade_smithing_template.ingredients"))).formatted(DESCRIPTION_FORMATTING);
    public static final Text CONDUIT_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.conduit_upgrade_smithing_template.base_slot_description")));
    public static final Text CONDUIT_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.conduit_upgrade_smithing_template.additions_slot_description")));

    public ModSmithingTemplateItem(Text appliesToText, Text ingredientsText, Text titleText, Text baseSlotDescriptionText, Text additionsSlotDescriptionText, List<Identifier> emptyBaseSlotTextures, List<Identifier> emptyAdditionsSlotTextures) {
        super(appliesToText, ingredientsText, titleText, baseSlotDescriptionText, additionsSlotDescriptionText, emptyBaseSlotTextures, emptyAdditionsSlotTextures);
    }

    public static List<Identifier> getPrestigeUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_SLOT_NETHERITE_HELMET_TEXTURE, EMPTY_SLOT_CHESTPLATE_TEXTURE, EMPTY_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_NETHERITE_BOOTS_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE, EMPTY_SLOT_HOE_TEXTURE);
    }

    public static List<Identifier> getPrestigeUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_NETHER_STAR_TEXTURE);
    }

    public static List<Identifier> getConduitUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_SLOT_TURTLE_HELMET);
    }

    public static List<Identifier> getConduitUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    static {
        EMPTY_SLOT_HELMET_TEXTURE = new Identifier("item/empty_armor_slot_helmet");
        EMPTY_SLOT_CHESTPLATE_TEXTURE = new Identifier("item/empty_armor_slot_chestplate");
        EMPTY_SLOT_LEGGINGS_TEXTURE = new Identifier("item/empty_armor_slot_leggings");
        EMPTY_SLOT_BOOTS_TEXTURE = new Identifier("item/empty_armor_slot_boots");
        EMPTY_SLOT_SWORD_TEXTURE = new Identifier("item/empty_slot_sword");
        EMPTY_SLOT_PICKAXE_TEXTURE = new Identifier("item/empty_slot_pickaxe");
        EMPTY_SLOT_AXE_TEXTURE = new Identifier("item/empty_slot_axe");
        EMPTY_SLOT_SHOVEL_TEXTURE = new Identifier("item/empty_slot_shovel");
        EMPTY_SLOT_HOE_TEXTURE = new Identifier("item/empty_slot_hoe");
        EMPTY_SLOT_INGOT_TEXTURE = new Identifier("item/empty_slot_ingot");
        EMPTY_SLOT_NETHER_STAR_TEXTURE = new Identifier(M08Mod.MOD_ID, "item/empty_slot_nether_star");
        EMPTY_SLOT_NETHERITE_HELMET_TEXTURE = new Identifier(M08Mod.MOD_ID, "item/empty_armor_slot_netherite_helmet");
        EMPTY_SLOT_NETHERITE_BOOTS_TEXTURE = new Identifier(M08Mod.MOD_ID, "item/empty_armor_slot_netherite_boots");
        EMPTY_SLOT_TURTLE_HELMET = new Identifier(M08Mod.MOD_ID,"item/empty_armor_slot_turtle_helmet");
    }

    @Override
    public String getTranslationKey() {
        return TRANSLATION_KEY;
    }
}