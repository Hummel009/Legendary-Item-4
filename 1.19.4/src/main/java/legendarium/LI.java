package legendarium;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod("legendarium")
public class LI {
	public static final List<Item> CONTENT = new ArrayList<>();

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "legendarium");

	public static final RegistryObject<Item> ARMOR_ANARION_HELMET = ITEMS.register("armor_anarion_helmet", () -> new LIItemArmor(LIMaterial.ANARION, Type.HELMET));
	public static final RegistryObject<Item> ARMOR_ANARION_CHESTPLATE = ITEMS.register("armor_anarion_chestplate", () -> new LIItemArmor(LIMaterial.ANARION, Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_ANARION_LEGS = ITEMS.register("armor_anarion_legs", () -> new LIItemArmor(LIMaterial.ANARION, Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_ANARION_BOOTS = ITEMS.register("armor_anarion_boots", () -> new LIItemArmor(LIMaterial.ANARION, Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_ARPHARAZON_HELMET = ITEMS.register("armor_arpharazon_helmet", () -> new LIItemArmor(LIMaterial.ARPHARAZON, Type.HELMET));
	public static final RegistryObject<Item> ARMOR_ARPHARAZON_CHESTPLATE = ITEMS.register("armor_arpharazon_chestplate", () -> new LIItemArmor(LIMaterial.ARPHARAZON, Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_ARPHARAZON_LEGS = ITEMS.register("armor_arpharazon_legs", () -> new LIItemArmor(LIMaterial.ARPHARAZON, Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_ARPHARAZON_BOOTS = ITEMS.register("armor_arpharazon_boots", () -> new LIItemArmor(LIMaterial.ARPHARAZON, Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_ARVEDUI_HELMET = ITEMS.register("armor_arvedui_helmet", () -> new LIItemArmor(LIMaterial.ARVEDUI, Type.HELMET));
	public static final RegistryObject<Item> ARMOR_ARVEDUI_CHESTPLATE = ITEMS.register("armor_arvedui_chestplate", () -> new LIItemArmor(LIMaterial.ARVEDUI, Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_ARVEDUI_LEGS = ITEMS.register("armor_arvedui_legs", () -> new LIItemArmor(LIMaterial.ARVEDUI, Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_ARVEDUI_BOOTS = ITEMS.register("armor_arvedui_boots", () -> new LIItemArmor(LIMaterial.ARVEDUI, Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_BOROMIR_CHESTPLATE = ITEMS.register("armor_boromir_chestplate", () -> new LIItemArmor(LIMaterial.BOROMIR, Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_BOROMIR_LEGS = ITEMS.register("armor_boromir_legs", () -> new LIItemArmor(LIMaterial.BOROMIR, Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_BOROMIR_BOOTS = ITEMS.register("armor_boromir_boots", () -> new LIItemArmor(LIMaterial.BOROMIR, Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_ELENDIL_HELMET = ITEMS.register("armor_elendil_helmet", () -> new LIItemArmor(LIMaterial.ELENDIL, Type.HELMET));
	public static final RegistryObject<Item> ARMOR_ELENDIL_CHESTPLATE = ITEMS.register("armor_elendil_chestplate", () -> new LIItemArmor(LIMaterial.ELENDIL, Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_ELENDIL_LEGS = ITEMS.register("armor_elendil_legs", () -> new LIItemArmor(LIMaterial.ELENDIL, Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_ELENDIL_BOOTS = ITEMS.register("armor_elendil_boots", () -> new LIItemArmor(LIMaterial.ELENDIL, Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_ELROS_HELMET = ITEMS.register("armor_elros_helmet", () -> new LIItemArmor(LIMaterial.ELROS, Type.HELMET));
	public static final RegistryObject<Item> ARMOR_ELROS_CHESTPLATE = ITEMS.register("armor_elros_chestplate", () -> new LIItemArmor(LIMaterial.ELROS, Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_ELROS_LEGS = ITEMS.register("armor_elros_legs", () -> new LIItemArmor(LIMaterial.ELROS, Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_ELROS_BOOTS = ITEMS.register("armor_elros_boots", () -> new LIItemArmor(LIMaterial.ELROS, Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_FEANOR_HELMET = ITEMS.register("armor_feanor_helmet", () -> new LIItemArmor(LIMaterial.FEANOR, Type.HELMET));
	public static final RegistryObject<Item> ARMOR_FEANOR_CHESTPLATE = ITEMS.register("armor_feanor_chestplate", () -> new LIItemArmor(LIMaterial.FEANOR, Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_FEANOR_LEGS = ITEMS.register("armor_feanor_legs", () -> new LIItemArmor(LIMaterial.FEANOR, Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_FEANOR_BOOTS = ITEMS.register("armor_feanor_boots", () -> new LIItemArmor(LIMaterial.FEANOR, Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_GILGALAD_HELMET = ITEMS.register("armor_gilgalad_helmet", () -> new LIItemArmor(LIMaterial.GILGALAD, Type.HELMET));
	public static final RegistryObject<Item> ARMOR_GILGALAD_CHESTPLATE = ITEMS.register("armor_gilgalad_chestplate", () -> new LIItemArmor(LIMaterial.GILGALAD, Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_GILGALAD_LEGS = ITEMS.register("armor_gilgalad_legs", () -> new LIItemArmor(LIMaterial.GILGALAD, Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_GILGALAD_BOOTS = ITEMS.register("armor_gilgalad_boots", () -> new LIItemArmor(LIMaterial.GILGALAD, Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_GIMLI_HELMET = ITEMS.register("armor_gimli_helmet", () -> new LIItemArmor(LIMaterial.GIMLI, Type.HELMET));
	public static final RegistryObject<Item> ARMOR_GIMLI_CHESTPLATE = ITEMS.register("armor_gimli_chestplate", () -> new LIItemArmor(LIMaterial.GIMLI, Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_GIMLI_LEGS = ITEMS.register("armor_gimli_legs", () -> new LIItemArmor(LIMaterial.GIMLI, Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_GIMLI_BOOTS = ITEMS.register("armor_gimli_boots", () -> new LIItemArmor(LIMaterial.GIMLI, Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_ISILDUR_HELMET = ITEMS.register("armor_isildur_helmet", () -> new LIItemArmor(LIMaterial.ISILDUR, Type.HELMET));
	public static final RegistryObject<Item> ARMOR_ISILDUR_CHESTPLATE = ITEMS.register("armor_isildur_chestplate", () -> new LIItemArmor(LIMaterial.ISILDUR, Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_ISILDUR_LEGS = ITEMS.register("armor_isildur_legs", () -> new LIItemArmor(LIMaterial.ISILDUR, Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_ISILDUR_BOOTS = ITEMS.register("armor_isildur_boots", () -> new LIItemArmor(LIMaterial.ISILDUR, Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_JIINDUR_HELMET = ITEMS.register("armor_jiindur_helmet", () -> new LIItemArmor(LIMaterial.JIINDUR, Type.HELMET));
	public static final RegistryObject<Item> ARMOR_JIINDUR_CHESTPLATE = ITEMS.register("armor_jiindur_chestplate", () -> new LIItemArmor(LIMaterial.JIINDUR, Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_JIINDUR_LEGS = ITEMS.register("armor_jiindur_legs", () -> new LIItemArmor(LIMaterial.JIINDUR, Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_JIINDUR_BOOTS = ITEMS.register("armor_jiindur_boots", () -> new LIItemArmor(LIMaterial.JIINDUR, Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_KHAMUL_HELMET = ITEMS.register("armor_khamul_helmet", () -> new LIItemArmor(LIMaterial.KHAMUL, Type.HELMET));
	public static final RegistryObject<Item> ARMOR_KHAMUL_CHESTPLATE = ITEMS.register("armor_khamul_chestplate", () -> new LIItemArmor(LIMaterial.KHAMUL, Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_KHAMUL_LEGS = ITEMS.register("armor_khamul_legs", () -> new LIItemArmor(LIMaterial.KHAMUL, Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_KHAMUL_BOOTS = ITEMS.register("armor_khamul_boots", () -> new LIItemArmor(LIMaterial.KHAMUL, Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_KHOMMURAT_HELMET = ITEMS.register("armor_khommurat_helmet", () -> new LIItemArmor(LIMaterial.KHOMMURAT, Type.HELMET));
	public static final RegistryObject<Item> ARMOR_KHOMMURAT_CHESTPLATE = ITEMS.register("armor_khommurat_chestplate", () -> new LIItemArmor(LIMaterial.KHOMMURAT, Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_KHOMMURAT_LEGS = ITEMS.register("armor_khommurat_legs", () -> new LIItemArmor(LIMaterial.KHOMMURAT, Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_KHOMMURAT_BOOTS = ITEMS.register("armor_khommurat_boots", () -> new LIItemArmor(LIMaterial.KHOMMURAT, Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_MORGOMIR_HELMET = ITEMS.register("armor_morgomir_helmet", () -> new LIItemArmor(LIMaterial.MORGOMIR, Type.HELMET));
	public static final RegistryObject<Item> ARMOR_MORGOMIR_CHESTPLATE = ITEMS.register("armor_morgomir_chestplate", () -> new LIItemArmor(LIMaterial.MORGOMIR, Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_MORGOMIR_LEGS = ITEMS.register("armor_morgomir_legs", () -> new LIItemArmor(LIMaterial.MORGOMIR, Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_MORGOMIR_BOOTS = ITEMS.register("armor_morgomir_boots", () -> new LIItemArmor(LIMaterial.MORGOMIR, Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_THEODEN_HELMET = ITEMS.register("armor_theoden_helmet", () -> new LIItemArmor(LIMaterial.THEODEN, Type.HELMET));
	public static final RegistryObject<Item> ARMOR_THEODEN_CHESTPLATE = ITEMS.register("armor_theoden_chestplate", () -> new LIItemArmor(LIMaterial.THEODEN, Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_THEODEN_LEGS = ITEMS.register("armor_theoden_legs", () -> new LIItemArmor(LIMaterial.THEODEN, Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_THEODEN_BOOTS = ITEMS.register("armor_theoden_boots", () -> new LIItemArmor(LIMaterial.THEODEN, Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_TURGON_HELMET = ITEMS.register("armor_turgon_helmet", () -> new LIItemArmor(LIMaterial.TURGON, Type.HELMET));
	public static final RegistryObject<Item> ARMOR_TURGON_CHESTPLATE = ITEMS.register("armor_turgon_chestplate", () -> new LIItemArmor(LIMaterial.TURGON, Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_TURGON_LEGS = ITEMS.register("armor_turgon_legs", () -> new LIItemArmor(LIMaterial.TURGON, Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_TURGON_BOOTS = ITEMS.register("armor_turgon_boots", () -> new LIItemArmor(LIMaterial.TURGON, Type.BOOTS));

	public static final RegistryObject<Item> WEAPON_ACHARN = ITEMS.register("weapon_acharn", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_AEGLOS = ITEMS.register("weapon_aeglos", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_ALATAR = ITEMS.register("weapon_alatar", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_ANGRIST = ITEMS.register("weapon_angrist", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_ANGUIREL = ITEMS.register("weapon_anguirel", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_ARANRUTH = ITEMS.register("weapon_aranruth", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_AZOG = ITEMS.register("weapon_azog", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_BALIN = ITEMS.register("weapon_balin", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_BARAZANTHUAL = ITEMS.register("weapon_barazanthual", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_BOLG = ITEMS.register("weapon_bolg", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_BOROMIR = ITEMS.register("weapon_boromir", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_CELEBORN = ITEMS.register("weapon_celeborn", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_DAGMOR = ITEMS.register("weapon_dagmor", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_DAIN = ITEMS.register("weapon_dain", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_DENETHOR = ITEMS.register("weapon_denethor", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_DORI = ITEMS.register("weapon_dori", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_DRAMBORLEG = ITEMS.register("weapon_dramborleg", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_DURIN = ITEMS.register("weapon_durin", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_DWALIN = ITEMS.register("weapon_dwalin", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_EOTHAIN = ITEMS.register("weapon_eothain", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_EOWYN = ITEMS.register("weapon_eowyn", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_FARAMIR = ITEMS.register("weapon_faramir", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_GAMLING = ITEMS.register("weapon_gamling", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_GIMLI = ITEMS.register("weapon_gimli", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_GIRION = ITEMS.register("weapon_girion", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_GOBLINKING = ITEMS.register("weapon_goblinking", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_GORBAG = ITEMS.register("weapon_gorbag", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_GOTHMOG = ITEMS.register("weapon_gothmog", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_GRIMA = ITEMS.register("weapon_grima", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_GURTHANG = ITEMS.register("weapon_gurthang", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_GUTHWINE = ITEMS.register("weapon_guthwine", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_HADHAFANG = ITEMS.register("weapon_hadhafang", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_HERUGRIM = ITEMS.register("weapon_herugrim", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_KHAMUL = ITEMS.register("weapon_khamul", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_KILI = ITEMS.register("weapon_kili", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_LEGOLAS = ITEMS.register("weapon_legolas", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_MELKOR = ITEMS.register("weapon_melkor", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_MOUTHOFSAURON = ITEMS.register("weapon_mouthofsauron", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_NARCIL = ITEMS.register("weapon_narcil", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_NAZGUL = ITEMS.register("weapon_nazgul", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_ORCRIST = ITEMS.register("weapon_orcrist", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_PALLANDO = ITEMS.register("weapon_pallando", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_RADAGAST = ITEMS.register("weapon_radagast", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_SARUMAN = ITEMS.register("weapon_saruman", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_SHAGRAT = ITEMS.register("weapon_shagrat", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_THORIN = ITEMS.register("weapon_thorin", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_THORONDUN = ITEMS.register("weapon_thorondun", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_THRAIN = ITEMS.register("weapon_thrain", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_THRANDUIL = ITEMS.register("weapon_thranduil", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_THROR = ITEMS.register("weapon_thror", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_URFAEL = ITEMS.register("weapon_urfael", LIItemSword::new);
	public static final RegistryObject<Item> WEAPON_WITCHKING = ITEMS.register("weapon_witchking", LIItemSword::new);

	public static final RegistryObject<Item> ARKENSTONE = ITEMS.register("arkenstone", LIItemEmpty::new);
	public static final RegistryObject<Item> SILMARIL = ITEMS.register("silmaril", LIItemEmpty::new);

	public LI() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		MinecraftForge.EVENT_BUS.register(this);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(LICreativeTabs::addCreativeTab);
	}
}