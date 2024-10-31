package org.paultherandom.voidechoes;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.paultherandom.voidechoes.datagen.ModLootTableProvider;
import org.paultherandom.voidechoes.datagen.ModModelProvider;
import org.paultherandom.voidechoes.datagen.ModRecipeProvider;

public class EchoesOfTheVoidDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
