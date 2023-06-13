package legendarium;

import legendarium.content.LIItemArmor;
import legendarium.content.LIItemEmpty;
import legendarium.content.LIItemSword;
import legendarium.content.LIMaterial;
import legendarium.proxy.LIClientProxy;
import legendarium.proxy.LIServerProxy;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.MissingMappingsEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mod("legendarium")
public class LI {
	public static final LIServerProxy PROXY = DistExecutor.safeRunForDist(() -> LIClientProxy::new, () -> LIServerProxy::new);

	public static final List<Item> CONTENT = new ArrayList<>();

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "legendarium");
	public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "trop");

	public static final RegistryObject<Item> ARMOR_ANARION_HELMET = ITEMS.register("armor_anarion_helmet", () -> new LIItemArmor(LIMaterial.ANARION, ArmorItem.Type.HELMET));
	public static final RegistryObject<Item> ARMOR_ANARION_CHESTPLATE = ITEMS.register("armor_anarion_chestplate", () -> new LIItemArmor(LIMaterial.ANARION, ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_ANARION_LEGGINGS = ITEMS.register("armor_anarion_leggings", () -> new LIItemArmor(LIMaterial.ANARION, ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_ANARION_BOOTS = ITEMS.register("armor_anarion_boots", () -> new LIItemArmor(LIMaterial.ANARION, ArmorItem.Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_ARPHARAZON_HELMET = ITEMS.register("armor_arpharazon_helmet", () -> new LIItemArmor(LIMaterial.ARPHARAZON, ArmorItem.Type.HELMET));
	public static final RegistryObject<Item> ARMOR_ARPHARAZON_CHESTPLATE = ITEMS.register("armor_arpharazon_chestplate", () -> new LIItemArmor(LIMaterial.ARPHARAZON, ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_ARPHARAZON_LEGGINGS = ITEMS.register("armor_arpharazon_leggings", () -> new LIItemArmor(LIMaterial.ARPHARAZON, ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_ARPHARAZON_BOOTS = ITEMS.register("armor_arpharazon_boots", () -> new LIItemArmor(LIMaterial.ARPHARAZON, ArmorItem.Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_ARVEDUI_HELMET = ITEMS.register("armor_arvedui_helmet", () -> new LIItemArmor(LIMaterial.ARVEDUI, ArmorItem.Type.HELMET));
	public static final RegistryObject<Item> ARMOR_ARVEDUI_CHESTPLATE = ITEMS.register("armor_arvedui_chestplate", () -> new LIItemArmor(LIMaterial.ARVEDUI, ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_ARVEDUI_LEGGINGS = ITEMS.register("armor_arvedui_leggings", () -> new LIItemArmor(LIMaterial.ARVEDUI, ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_ARVEDUI_BOOTS = ITEMS.register("armor_arvedui_boots", () -> new LIItemArmor(LIMaterial.ARVEDUI, ArmorItem.Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_BOROMIR_CHESTPLATE = ITEMS.register("armor_boromir_chestplate", () -> new LIItemArmor(LIMaterial.BOROMIR, ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_BOROMIR_LEGGINGS = ITEMS.register("armor_boromir_leggings", () -> new LIItemArmor(LIMaterial.BOROMIR, ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_BOROMIR_BOOTS = ITEMS.register("armor_boromir_boots", () -> new LIItemArmor(LIMaterial.BOROMIR, ArmorItem.Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_ELENDIL_HELMET = ITEMS.register("armor_elendil_helmet", () -> new LIItemArmor(LIMaterial.ELENDIL, ArmorItem.Type.HELMET));
	public static final RegistryObject<Item> ARMOR_ELENDIL_CHESTPLATE = ITEMS.register("armor_elendil_chestplate", () -> new LIItemArmor(LIMaterial.ELENDIL, ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_ELENDIL_LEGGINGS = ITEMS.register("armor_elendil_leggings", () -> new LIItemArmor(LIMaterial.ELENDIL, ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_ELENDIL_BOOTS = ITEMS.register("armor_elendil_boots", () -> new LIItemArmor(LIMaterial.ELENDIL, ArmorItem.Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_ELROS_HELMET = ITEMS.register("armor_elros_helmet", () -> new LIItemArmor(LIMaterial.ELROS, ArmorItem.Type.HELMET));
	public static final RegistryObject<Item> ARMOR_ELROS_CHESTPLATE = ITEMS.register("armor_elros_chestplate", () -> new LIItemArmor(LIMaterial.ELROS, ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_ELROS_LEGGINGS = ITEMS.register("armor_elros_leggings", () -> new LIItemArmor(LIMaterial.ELROS, ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_ELROS_BOOTS = ITEMS.register("armor_elros_boots", () -> new LIItemArmor(LIMaterial.ELROS, ArmorItem.Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_FEANOR_HELMET = ITEMS.register("armor_feanor_helmet", () -> new LIItemArmor(LIMaterial.FEANOR, ArmorItem.Type.HELMET));
	public static final RegistryObject<Item> ARMOR_FEANOR_CHESTPLATE = ITEMS.register("armor_feanor_chestplate", () -> new LIItemArmor(LIMaterial.FEANOR, ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_FEANOR_LEGGINGS = ITEMS.register("armor_feanor_leggings", () -> new LIItemArmor(LIMaterial.FEANOR, ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_FEANOR_BOOTS = ITEMS.register("armor_feanor_boots", () -> new LIItemArmor(LIMaterial.FEANOR, ArmorItem.Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_GILGALAD_HELMET = ITEMS.register("armor_gilgalad_helmet", () -> new LIItemArmor(LIMaterial.GILGALAD, ArmorItem.Type.HELMET));
	public static final RegistryObject<Item> ARMOR_GILGALAD_CHESTPLATE = ITEMS.register("armor_gilgalad_chestplate", () -> new LIItemArmor(LIMaterial.GILGALAD, ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_GILGALAD_LEGGINGS = ITEMS.register("armor_gilgalad_leggings", () -> new LIItemArmor(LIMaterial.GILGALAD, ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_GILGALAD_BOOTS = ITEMS.register("armor_gilgalad_boots", () -> new LIItemArmor(LIMaterial.GILGALAD, ArmorItem.Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_GIMLI_HELMET = ITEMS.register("armor_gimli_helmet", () -> new LIItemArmor(LIMaterial.GIMLI, ArmorItem.Type.HELMET));
	public static final RegistryObject<Item> ARMOR_GIMLI_CHESTPLATE = ITEMS.register("armor_gimli_chestplate", () -> new LIItemArmor(LIMaterial.GIMLI, ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_GIMLI_LEGGINGS = ITEMS.register("armor_gimli_leggings", () -> new LIItemArmor(LIMaterial.GIMLI, ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_GIMLI_BOOTS = ITEMS.register("armor_gimli_boots", () -> new LIItemArmor(LIMaterial.GIMLI, ArmorItem.Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_ISILDUR_HELMET = ITEMS.register("armor_isildur_helmet", () -> new LIItemArmor(LIMaterial.ISILDUR, ArmorItem.Type.HELMET));
	public static final RegistryObject<Item> ARMOR_ISILDUR_CHESTPLATE = ITEMS.register("armor_isildur_chestplate", () -> new LIItemArmor(LIMaterial.ISILDUR, ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_ISILDUR_LEGGINGS = ITEMS.register("armor_isildur_leggings", () -> new LIItemArmor(LIMaterial.ISILDUR, ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_ISILDUR_BOOTS = ITEMS.register("armor_isildur_boots", () -> new LIItemArmor(LIMaterial.ISILDUR, ArmorItem.Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_JIINDUR_HELMET = ITEMS.register("armor_jiindur_helmet", () -> new LIItemArmor(LIMaterial.JIINDUR, ArmorItem.Type.HELMET));
	public static final RegistryObject<Item> ARMOR_JIINDUR_CHESTPLATE = ITEMS.register("armor_jiindur_chestplate", () -> new LIItemArmor(LIMaterial.JIINDUR, ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_JIINDUR_LEGGINGS = ITEMS.register("armor_jiindur_leggings", () -> new LIItemArmor(LIMaterial.JIINDUR, ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_JIINDUR_BOOTS = ITEMS.register("armor_jiindur_boots", () -> new LIItemArmor(LIMaterial.JIINDUR, ArmorItem.Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_KHAMUL_HELMET = ITEMS.register("armor_khamul_helmet", () -> new LIItemArmor(LIMaterial.KHAMUL, ArmorItem.Type.HELMET));
	public static final RegistryObject<Item> ARMOR_KHAMUL_CHESTPLATE = ITEMS.register("armor_khamul_chestplate", () -> new LIItemArmor(LIMaterial.KHAMUL, ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_KHAMUL_LEGGINGS = ITEMS.register("armor_khamul_leggings", () -> new LIItemArmor(LIMaterial.KHAMUL, ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_KHAMUL_BOOTS = ITEMS.register("armor_khamul_boots", () -> new LIItemArmor(LIMaterial.KHAMUL, ArmorItem.Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_HOARMURATH_HELMET = ITEMS.register("armor_hoarmurath_helmet", () -> new LIItemArmor(LIMaterial.HOARMURATH, ArmorItem.Type.HELMET));
	public static final RegistryObject<Item> ARMOR_HOARMURATH_CHESTPLATE = ITEMS.register("armor_hoarmurath_chestplate", () -> new LIItemArmor(LIMaterial.HOARMURATH, ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_HOARMURATH_LEGGINGS = ITEMS.register("armor_hoarmurath_leggings", () -> new LIItemArmor(LIMaterial.HOARMURATH, ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_HOARMURATH_BOOTS = ITEMS.register("armor_hoarmurath_boots", () -> new LIItemArmor(LIMaterial.HOARMURATH, ArmorItem.Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_MORGOMIR_HELMET = ITEMS.register("armor_morgomir_helmet", () -> new LIItemArmor(LIMaterial.MORGOMIR, ArmorItem.Type.HELMET));
	public static final RegistryObject<Item> ARMOR_MORGOMIR_CHESTPLATE = ITEMS.register("armor_morgomir_chestplate", () -> new LIItemArmor(LIMaterial.MORGOMIR, ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_MORGOMIR_LEGGINGS = ITEMS.register("armor_morgomir_leggings", () -> new LIItemArmor(LIMaterial.MORGOMIR, ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_MORGOMIR_BOOTS = ITEMS.register("armor_morgomir_boots", () -> new LIItemArmor(LIMaterial.MORGOMIR, ArmorItem.Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_THEODEN_HELMET = ITEMS.register("armor_theoden_helmet", () -> new LIItemArmor(LIMaterial.THEODEN, ArmorItem.Type.HELMET));
	public static final RegistryObject<Item> ARMOR_THEODEN_CHESTPLATE = ITEMS.register("armor_theoden_chestplate", () -> new LIItemArmor(LIMaterial.THEODEN, ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_THEODEN_LEGGINGS = ITEMS.register("armor_theoden_leggings", () -> new LIItemArmor(LIMaterial.THEODEN, ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_THEODEN_BOOTS = ITEMS.register("armor_theoden_boots", () -> new LIItemArmor(LIMaterial.THEODEN, ArmorItem.Type.BOOTS));

	public static final RegistryObject<Item> ARMOR_TURGON_HELMET = ITEMS.register("armor_turgon_helmet", () -> new LIItemArmor(LIMaterial.TURGON, ArmorItem.Type.HELMET));
	public static final RegistryObject<Item> ARMOR_TURGON_CHESTPLATE = ITEMS.register("armor_turgon_chestplate", () -> new LIItemArmor(LIMaterial.TURGON, ArmorItem.Type.CHESTPLATE));
	public static final RegistryObject<Item> ARMOR_TURGON_LEGGINGS = ITEMS.register("armor_turgon_leggings", () -> new LIItemArmor(LIMaterial.TURGON, ArmorItem.Type.LEGGINGS));
	public static final RegistryObject<Item> ARMOR_TURGON_BOOTS = ITEMS.register("armor_turgon_boots", () -> new LIItemArmor(LIMaterial.TURGON, ArmorItem.Type.BOOTS));

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

	public static final RegistryObject<CreativeModeTab> TAB_ARTIFACTS = CREATIVE_TABS.register("legendariumtab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.artifacts")).icon(() -> new ItemStack(WEAPON_FARAMIR.get())).displayItems((enabledFlags, populator) -> {
		for (Item item : CONTENT) {
			populator.accept(item);
		}
	}).build());

	public LI() {
		IEventBus fmlBus = FMLJavaModLoadingContext.get().getModEventBus();
		IEventBus forgeBus = MinecraftForge.EVENT_BUS;
		fmlBus.register(this);
		forgeBus.register(this);
		fmlBus.register(PROXY);
		forgeBus.register(PROXY);
		ITEMS.register(fmlBus);
		CREATIVE_TABS.register(fmlBus);
	}

	@Mod.EventBusSubscriber
	public static class MissingMappingsDetector {
		@SubscribeEvent
		public static void onMissingMappings(MissingMappingsEvent event) {
			Map<String, RegistryObject<Item>> renamed = new HashMap<>();
			renamed.put("armor_khommurat_helmet", ARMOR_HOARMURATH_HELMET);
			renamed.put("armor_khommurat_chestplate", ARMOR_HOARMURATH_CHESTPLATE);
			renamed.put("armor_khommurat_legs", ARMOR_HOARMURATH_LEGGINGS);
			renamed.put("armor_khommurat_boots", ARMOR_HOARMURATH_BOOTS);
			renamed.put("armor_anarion_legs", ARMOR_ANARION_LEGGINGS);
			renamed.put("armor_arpharazon_legs", ARMOR_ARPHARAZON_LEGGINGS);
			renamed.put("armor_arvedui_legs", ARMOR_ARVEDUI_LEGGINGS);
			renamed.put("armor_boromir_legs", ARMOR_BOROMIR_LEGGINGS);
			renamed.put("armor_elendil_legs", ARMOR_ELENDIL_LEGGINGS);
			renamed.put("armor_elros_legs", ARMOR_ELROS_LEGGINGS);
			renamed.put("armor_feanor_legs", ARMOR_FEANOR_LEGGINGS);
			renamed.put("armor_gilgalad_legs", ARMOR_GILGALAD_LEGGINGS);
			renamed.put("armor_gimli_legs", ARMOR_GIMLI_LEGGINGS);
			renamed.put("armor_isildur_legs", ARMOR_ISILDUR_LEGGINGS);
			renamed.put("armor_jiindur_legs", ARMOR_JIINDUR_LEGGINGS);
			renamed.put("armor_khamul_legs", ARMOR_KHAMUL_LEGGINGS);
			renamed.put("armor_morgomir_legs", ARMOR_MORGOMIR_LEGGINGS);
			renamed.put("armor_theoden_legs", ARMOR_THEODEN_LEGGINGS);
			renamed.put("armor_turgon_legs", ARMOR_TURGON_LEGGINGS);
			for (MissingMappingsEvent.Mapping<Item> mapping : event.getAllMappings(ForgeRegistries.Keys.ITEMS)) {
				for (Map.Entry<String, RegistryObject<Item>> entry : renamed.entrySet()) {
					if (mapping.getKey().getPath().contains(entry.getKey())) {
						mapping.remap(entry.getValue().get());
						break;
					}
				}
			}
		}
	}
}