package legendarium;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemOverrideList;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumFacing;
import org.apache.commons.lang3.tuple.Pair;

import javax.vecmath.Matrix4f;
import java.util.List;

public class LIItemSword extends ItemSword {
	public LIItemSword() {
		super(Item.ToolMaterial.DIAMOND);
	}

	public static class LargeItemModel implements IBakedModel {
		public final IBakedModel smallModel;
		public final IBakedModel largeModel;

		public LargeItemModel(IBakedModel smallModel, IBakedModel largeModel) {
			this.smallModel = smallModel;
			this.largeModel = largeModel;
		}

		@Override
		public ItemOverrideList getOverrides() {
			return smallModel.getOverrides();
		}

		@Override
		public TextureAtlasSprite getParticleTexture() {
			return smallModel.getParticleTexture();
		}

		@Override
		public List<BakedQuad> getQuads(IBlockState blockState, EnumFacing facing, long l) {
			return smallModel.getQuads(blockState, facing, l);
		}

		@Override
		public Pair<? extends IBakedModel, Matrix4f> handlePerspective(ItemCameraTransforms.TransformType transformType) {
			IBakedModel bakedModel = smallModel;
			if (transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_LEFT_HAND || transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND || transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_LEFT_HAND || transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND) {
				bakedModel = largeModel;
			}
			return bakedModel.handlePerspective(transformType);
		}

		@Override
		public boolean isAmbientOcclusion() {
			return smallModel.isAmbientOcclusion();
		}

		@Override
		public boolean isBuiltInRenderer() {
			return smallModel.isBuiltInRenderer();
		}

		@Override
		public boolean isGui3d() {
			return smallModel.isGui3d();
		}
	}
}