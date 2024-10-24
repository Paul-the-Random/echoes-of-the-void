package org.paultherandom.voidechoes.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.paultherandom.voidechoes.EchoesOfTheVoid;

public class ModItemGroups {
    public static final ItemGroup VOID_INGREDIENTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EchoesOfTheVoid.MOD_ID, "void_ingredients"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.voidIngredients"))
                    .icon(() -> new ItemStack(ModItems.SHADOW_FABRIC)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SHADOW_FABRIC);
                        entries.add(ModItems.SHADOW_SEAL);
                        entries.add(ModItems.SHADOW_EXTRACTOR);
                    })
                    .build()
    );

    public static void initialize() {
        EchoesOfTheVoid.LOGGER.info("Registering Item Groups for " + EchoesOfTheVoid.MOD_ID);


    }
}
