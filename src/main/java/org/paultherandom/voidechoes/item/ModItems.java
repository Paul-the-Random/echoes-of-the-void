package org.paultherandom.voidechoes.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.paultherandom.voidechoes.EchoesOfTheVoid;

public class ModItems {
    public static final Item SHADOW_FABRIC = itemRegister("shadow_fabric", new Item(new FabricItemSettings()));
    public static final Item SHADOW_SEAL = itemRegister("shadow_seal", new Item(new FabricItemSettings()));
    public static final Item SHADOW_EXTRACTOR = itemRegister("shadow_extractor", new Item(new FabricItemSettings()));

    private static void addItemToIngredientTab(FabricItemGroupEntries entries) {
        //entries.add(SHADOW_FABRIC);
    }

    private static Item itemRegister(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EchoesOfTheVoid.MOD_ID, id), item);
    }

    public static void initialize() {
        EchoesOfTheVoid.LOGGER.info("Registering Mod Items for " + EchoesOfTheVoid.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientTab);
    }
}
