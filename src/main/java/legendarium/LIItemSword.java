package legendarium;

import net.minecraft.world.item.*;

public class LIItemSword extends SwordItem {
	public LIItemSword() {
		super(Tiers.NETHERITE, 12, 2F, new Properties().tab(LICreativeTabs.tabWeapons));
	}
}