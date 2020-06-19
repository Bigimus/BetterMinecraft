package betterminecraft.bigimus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import betterminecraft.bigimus.world.gen.ModOreGen;
//import betterminecraft.bigimus.init.ItemInit;
//import betterminecraft.bigimus.util.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
//import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("bm")
@Mod.EventBusSubscriber(modid = betterMinecraft.MOD_ID, bus = Bus.MOD)
public class betterMinecraft {
	public static final String MOD_ID = "bm";
	public static betterMinecraft instance;
	public static final Logger LOGGER = LogManager.getLogger();
	public betterMinecraft(){
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::doClientStuff);
		instance = this;
		//RegistryHandler.init();
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		
	}
	private void doClientStuff(final FMLClientSetupEvent event) {
		
	}
	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {
		
	}
	/*@SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event){
		ModOreGen.generateOre();
	}*/
}
