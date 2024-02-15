package com.github.hummel.legendarium;

import com.github.hummel.legendarium.handler.ForgeEventHandler;
import com.github.hummel.legendarium.init.Items;
import com.github.hummel.legendarium.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventBus;
import net.minecraftforge.common.MinecraftForge;

@SuppressWarnings({"PublicField", "WeakerAccess"})
@Mod(modid = "legendarium", useMetadata = true)
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	@SidedProxy(clientSide = "com.github.hummel.legendarium.proxy.ClientProxy", serverSide = "com.github.hummel.legendarium.proxy.ServerProxy")
	public static CommonProxy proxy;

	public Main() {
		EventBus forgeEventBus = MinecraftForge.EVENT_BUS;
		ForgeEventHandler forgeEventHandler = new ForgeEventHandler();
		forgeEventBus.register(forgeEventHandler);
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Items.preInit();
	}

	@Mod.EventHandler
	public void onInit(FMLInitializationEvent event) {
		proxy.onInit();
	}
}