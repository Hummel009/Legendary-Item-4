package legendarium;

import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LIObfuscationHelper {
	public static void setIconIndex(Item item, int value) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, value, "cl");
		} catch (Exception e) {
			item.setIconIndex(value);
		}
	}

	public static void setItemName(Item item, String value) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, "item." + value, "cp");
		} catch (Exception e) {
			item.setItemName(value);
		}
	}

	public static void setCreativeTab(Item item, CreativeTabs value) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, LICreativeTabs.TAB_ARTIFACTS, "a");
		} catch (Exception e) {
			item.setCreativeTab(LICreativeTabs.TAB_ARTIFACTS);
		}
	}

	public static void setMaxStackSize(Item item, int value) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, 1, "ck");
		} catch (Exception e) {
			item.setMaxStackSize(1);
		}
	}
}