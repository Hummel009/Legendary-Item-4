package legendarium;

import net.minecraft.item.*;

public class LICreativeTabs {
	public static ItemGroup tabWeapons = new ItemGroup("weapons") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(LI.weapon_faramir);
		}
	};
}
