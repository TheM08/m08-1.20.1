package net.m08.m08mod.datagen;

import net.m08.m08mod.M08Mod;
import net.m08.m08mod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public static final List<ItemConvertible> CREDIT_SMELTABLES = List.of(Items.GOLD_INGOT);
    public ModRecipeProvider(FabricDataOutput output) {

        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerBlasting(exporter, CREDIT_SMELTABLES, RecipeCategory.MISC, ModItems.CREDIT, 1.0f, 100, "credit");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE, 1)
                .group("prestige")
                .pattern("QQQ")
                .pattern("GNG")
                .pattern("QQQ")
                .input('Q', Items.QUARTZ_BLOCK)
                .input('G', Items.GOLD_BLOCK)
                .input('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier(M08Mod.MOD_ID,getRecipeName(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE, 2)
                .group("prestige")
                .pattern("QPQ")
                .pattern("QGQ")
                .pattern("QQQ")
                .input('Q', Items.QUARTZ_BLOCK)
                .input('G', Items.GOLD_BLOCK)
                .input('P', ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE)
                .criterion(hasItem(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier(M08Mod.MOD_ID,getRecipeName(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE) + "_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CONDUIT_UPGRADE_SMITHING_TEMPLATE, 1)
                .group("conduit")
                .pattern("SSS")
                .pattern("SNS")
                .pattern("SSS")
                .input('S', Items.SCUTE)
                .input('N', Items.NAUTILUS_SHELL)
                .criterion(hasItem(Items.SCUTE), conditionsFromItem(Items.SCUTE))
                .offerTo(exporter, new Identifier(M08Mod.MOD_ID,getRecipeName(ModItems.CONDUIT_UPGRADE_SMITHING_TEMPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CONDUIT_UPGRADE_SMITHING_TEMPLATE, 2)
                .group("conduit")
                .pattern("SCS")
                .pattern("SNS")
                .pattern("SSS")
                .input('S', Items.SCUTE)
                .input('N', Items.NAUTILUS_SHELL)
                .input('C', ModItems.CONDUIT_UPGRADE_SMITHING_TEMPLATE)
                .criterion(hasItem(ModItems.CONDUIT_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.CONDUIT_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier(M08Mod.MOD_ID,getRecipeName(ModItems.CONDUIT_UPGRADE_SMITHING_TEMPLATE) + "_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE, 1)
                .pattern("NTN")
                .pattern("TPT")
                .pattern("NTN")
                .input('P', ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE)
                .input('T', Items.NETHERITE_INGOT)
                .input('N', Items.NETHER_WART_BLOCK)
                .criterion(hasItem(Items.NETHER_STAR), conditionsFromItem(Items.NETHER_STAR))
                .offerTo(exporter, new Identifier(M08Mod.MOD_ID,getRecipeName(Items.NETHER_STAR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_HELMET, 1)
                .pattern("CCC")
                .pattern("C C")
                .pattern("   ")
                .input('C', Items.CHAIN)
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(M08Mod.MOD_ID,getRecipeName(Items.CHAINMAIL_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_CHESTPLATE, 1)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', Items.CHAIN)
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(M08Mod.MOD_ID,getRecipeName(Items.CHAINMAIL_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_LEGGINGS, 1)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.CHAIN)
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(M08Mod.MOD_ID,getRecipeName(Items.CHAINMAIL_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_BOOTS, 1)
                .pattern("   ")
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.CHAIN)
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(M08Mod.MOD_ID,getRecipeName(Items.CHAINMAIL_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ENCHANTED_GOLDEN_APPLE, 1)
                .pattern("GGG")
                .pattern("GAG")
                .pattern("GGG")
                .input('A', Items.APPLE)
                .input('G', Items.GOLD_BLOCK)
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier(M08Mod.MOD_ID,getRecipeName(Items.ENCHANTED_GOLDEN_APPLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.HAMMER, 1)
                .pattern("III")
                .pattern("ISI")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(M08Mod.MOD_ID,getRecipeName(ModItems.HAMMER)));

        offerSmithingTrimRecipe(exporter, ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE, new Identifier(M08Mod.MOD_ID, "prestige_upgrade_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_HELMET), Ingredient.ofItems(Items.NETHER_STAR), RecipeCategory.COMBAT, ModItems.PRESTIGE_HELMET)
                .criterion(hasItem(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHER_STAR)).offerTo(exporter, new Identifier(M08Mod.MOD_ID, "prestige_helmet_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_CHESTPLATE), Ingredient.ofItems(Items.NETHER_STAR), RecipeCategory.COMBAT, ModItems.PRESTIGE_CHESTPLATE)
                .criterion(hasItem(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHER_STAR)).offerTo(exporter, new Identifier(M08Mod.MOD_ID, "prestige_chestplate_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_LEGGINGS), Ingredient.ofItems(Items.NETHER_STAR), RecipeCategory.COMBAT, ModItems.PRESTIGE_LEGGINGS)
                .criterion(hasItem(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHER_STAR)).offerTo(exporter, new Identifier(M08Mod.MOD_ID, "prestige_leggings_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_BOOTS), Ingredient.ofItems(Items.NETHER_STAR), RecipeCategory.COMBAT, ModItems.PRESTIGE_BOOTS)
                .criterion(hasItem(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHER_STAR)).offerTo(exporter, new Identifier(M08Mod.MOD_ID, "prestige_boots_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_SWORD), Ingredient.ofItems(Items.NETHER_STAR), RecipeCategory.COMBAT, Items.NETHERITE_SWORD)
                .criterion(hasItem(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHER_STAR)).offerTo(exporter, new Identifier(M08Mod.MOD_ID, "prestige_sword_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_PICKAXE), Ingredient.ofItems(Items.NETHER_STAR), RecipeCategory.COMBAT, Items.NETHERITE_PICKAXE)
                .criterion(hasItem(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHER_STAR)).offerTo(exporter, new Identifier(M08Mod.MOD_ID, "prestige_pickaxe_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_AXE), Ingredient.ofItems(Items.NETHER_STAR), RecipeCategory.COMBAT, Items.NETHERITE_AXE)
                .criterion(hasItem(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHER_STAR)).offerTo(exporter, new Identifier(M08Mod.MOD_ID, "prestige_axe_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_SHOVEL), Ingredient.ofItems(Items.NETHER_STAR), RecipeCategory.COMBAT, Items.NETHERITE_SHOVEL)
                .criterion(hasItem(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHER_STAR)).offerTo(exporter, new Identifier(M08Mod.MOD_ID, "prestige_shovel_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_HOE), Ingredient.ofItems(Items.NETHER_STAR), RecipeCategory.COMBAT, Items.NETHERITE_HOE)
                .criterion(hasItem(ModItems.PRESTIGE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHER_STAR)).offerTo(exporter, new Identifier(M08Mod.MOD_ID, "prestige_hoe_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.CONDUIT_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.TURTLE_HELMET), Ingredient.ofItems(Items.CONDUIT), RecipeCategory.COMBAT, ModItems.CONDUIT_HELMET)
                .criterion(hasItem(ModItems.CONDUIT_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.CONDUIT)).offerTo(exporter, new Identifier(M08Mod.MOD_ID, "conduit_helmet_smithing"));
    }
}
