package com.github.hummel.legendarium.handler;

import com.github.hummel.legendarium.model.EpicBakedModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ModEventHandler {
	private static final Map<ResourceLocation, ResourceLocation> COMPLIANCES = new HashMap<>();

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void onModelRegistry(ModelRegistryEvent event) {
		Collection<ResourceLocation> resourceLocations = Minecraft.getInstance().getResourceManager().listResources("models", loc -> loc.endsWith("_large.json"));
		for (ResourceLocation resourceLocation : resourceLocations) {
			String itemName = resourceLocation.getPath().replace("models/item/", "").replace("_large.json", "");
			ResourceLocation smallResourceLocation = new ResourceLocation("legendarium", itemName);
			ResourceLocation largeResourceLocation = new ResourceLocation("legendarium", "item/" + itemName + "_large");
			COMPLIANCES.put(smallResourceLocation, largeResourceLocation);
			ModelLoader.addSpecialModel(largeResourceLocation);
		}
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void onModelBake(ModelBakeEvent event) {
		Map<ResourceLocation, IBakedModel> modelRegistry = event.getModelRegistry();
		for (Map.Entry<ResourceLocation, ResourceLocation> compliance : COMPLIANCES.entrySet()) {
			ModelResourceLocation smallResourceLocation = new ModelResourceLocation(compliance.getKey(), "inventory");
			IBakedModel smallBakedModel = modelRegistry.get(smallResourceLocation);
			if (smallBakedModel != null) {
				ResourceLocation largeResourceLocation = compliance.getValue();
				IBakedModel largeBakedModel = modelRegistry.get(largeResourceLocation);
				if (largeBakedModel != null) {
					IBakedModel epicBakedModel = new EpicBakedModel(smallBakedModel, largeBakedModel);
					modelRegistry.put(smallResourceLocation, epicBakedModel);
				}
			}
		}
	}
}