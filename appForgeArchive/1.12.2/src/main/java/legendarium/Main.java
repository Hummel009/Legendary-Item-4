package legendarium;

import legendarium.handler.ForgeEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventBus;

@Mod(modid = "legendarium", useMetadata = true)
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	public Main() {
		EventBus forgeEventBus = MinecraftForge.EVENT_BUS;
		ForgeEventHandler forgeEventHandler = new ForgeEventHandler();
		forgeEventBus.register(forgeEventHandler);
	}
}