package net.m08.m08mod.item;

import net.m08.m08mod.M08Mod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    M08("m08", -1, new int[] {20, 0, 0, 0}, 0,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 100f, 1f, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    PRESTIGE("prestige", 42, new int[] {5, 10, 8, 5}, 20,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4f, 0.2f, () -> Ingredient.ofItems(Items.NETHER_STAR)),
    CONDUIT("conduit", 26, new int[] {3, 0, 0, 0}, 10,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0f, 0f, () -> Ingredient.ofItems(Items.NAUTILUS_SHELL)),
    TAINTED_PRESTIGE("tainted_prestige", 48, new int[] {5, 10, 8, 5}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5f, 0.3f, () -> Ingredient.ofItems(Items.NETHER_STAR));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return M08Mod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
