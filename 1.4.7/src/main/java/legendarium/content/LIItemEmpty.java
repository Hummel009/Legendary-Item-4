package legendarium.content;

import net.minecraft.item.Item;

public class LIItemEmpty extends Item {
	public LIItemEmpty(int id) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(LICreativeTabs.TAB_ARTIFACTS);
	}
}