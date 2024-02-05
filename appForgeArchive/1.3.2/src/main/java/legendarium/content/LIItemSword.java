package legendarium.content;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSword;

public class LIItemSword extends ItemSword {
	public LIItemSword(int id) {
		super(id, EnumToolMaterial.EMERALD);
		setCreativeTab(LICreativeTabs.TAB_ARTIFACTS);
	}
}