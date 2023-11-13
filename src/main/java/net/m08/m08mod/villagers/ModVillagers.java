package net.m08.m08mod.villagers;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.m08.m08mod.M08Mod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
    public static final RegistryKey<PointOfInterestType> CREDIT_POI_KEY = poiKey("creditpoi");
    public static final PointOfInterestType CREDIT_POI = registerPoi("creditpoi", Blocks.IRON_BLOCK);

    public static final VillagerProfession CREDIT_TRADER = registerProfession("credit_trader", CREDIT_POI_KEY);

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(M08Mod.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_ARMORER));
    }

    public static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(M08Mod.MOD_ID, name), 1, 1, block);
    }

    public static RegistryKey<PointOfInterestType> poiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(M08Mod.MOD_ID, name));
    }

    public static void registerVillagers() {
        M08Mod.LOGGER.info("Registering Villagers " + M08Mod.MOD_ID);
    }
}
