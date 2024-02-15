package com.github.hummel.legendarium.model;

import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.model.BakedQuad;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.model.ItemOverrideList;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.Direction;
import org.apache.commons.lang3.tuple.Pair;

import javax.vecmath.Matrix4f;
import java.util.List;
import java.util.Random;

@SuppressWarnings("deprecation")
public class EpicBakedModel implements IBakedModel {
	private final IBakedModel smallBakedModel;
	private final IBakedModel largeBakedModel;

	public EpicBakedModel(IBakedModel smallBakedModel, IBakedModel largeBakedModel) {
		this.smallBakedModel = smallBakedModel;
		this.largeBakedModel = largeBakedModel;
	}

	@Override
	public Pair<? extends IBakedModel, Matrix4f> handlePerspective(ItemCameraTransforms.TransformType transformType) {
		IBakedModel bakedModel;
		if (transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_LEFT_HAND || transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND || transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_LEFT_HAND || transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND) {
			bakedModel = largeBakedModel;
		} else {
			bakedModel = smallBakedModel;
		}
		return bakedModel.handlePerspective(transformType);
	}

	@Override
	public ItemOverrideList getOverrides() {
		return largeBakedModel.getOverrides();
	}

	@Override
	public TextureAtlasSprite getParticleIcon() {
		return largeBakedModel.getParticleIcon();
	}

	@Override
	public List<BakedQuad> getQuads(BlockState blockState, Direction direction, Random random) {
		return largeBakedModel.getQuads(blockState, direction, random);
	}

	@Override
	public ItemCameraTransforms getTransforms() {
		return largeBakedModel.getTransforms();
	}

	@Override
	public boolean isCustomRenderer() {
		return largeBakedModel.isCustomRenderer();
	}

	@Override
	public boolean isGui3d() {
		return largeBakedModel.isGui3d();
	}

	@Override
	public boolean useAmbientOcclusion() {
		return largeBakedModel.useAmbientOcclusion();
	}
}