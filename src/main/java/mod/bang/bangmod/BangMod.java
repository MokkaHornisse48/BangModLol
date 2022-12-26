package mod.bang.bangmod;

import mod.bang.bangmod.blocks.Blocks;
import mod.bang.bangmod.client.KeyBindings;
import mod.bang.bangmod.client.renderer.Dodo_renderer;
import mod.bang.bangmod.entitys.Entitys;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

import java.util.stream.Collectors;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(BangMod.MOD_ID)
public class BangMod {
    IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

    public static final String MOD_ID = "bangmod";
    public static final Logger LOGGER = LogManager.getLogger();

    //public static final EntityAttribute WIDTH_MULTIPLIER = Registry.register(Registry.ATTRIBUTE, new ResourceLocation("sizeentityattributes", "width_multiplier"), new ClampedEntityAttribute("attribute.name.generic.sizeentityattributes.width_multiplier", 1, 0.125, 8)).setTracked(true);
    //public static final EntityAttribute HEIGHT_MULTIPLIER = Registry.register(Registry.ATTRIBUTE, new ResourceLocation("sizeentityattributes", "height_multiplier"), new ClampedEntityAttribute("attribute.name.generic.sizeentityattributes.height_multiplier", 1, 0.125, 8)).setTracked(true);

    public BangMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        //Items.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        //LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        LOGGER.info("MokkaHornisse48 = Gott");
    }



    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
        RenderTypeLookup.setRenderLayer(Blocks.BLOOD_ORE, RenderType.getSolid());
        RenderingRegistry.registerEntityRenderingHandler(Entitys.DodoEntity, new Dodo_renderer.RenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(Entitys.DodoEggEntity, new Dodo_renderer.RenderFactoryEgg());
        ClientRegistry.registerKeyBinding(KeyBindings.changeKey);
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo(BangMod.MOD_ID, "helloworld", () -> {
            LOGGER.info("Hello world from the MDK");
            return "Hello world";
        });
    }

    private void processIMC(final InterModProcessEvent event) {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m -> m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
}
