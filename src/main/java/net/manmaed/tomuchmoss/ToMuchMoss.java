package net.manmaed.tomuchmoss;

import net.manmaed.tomuchmoss.blocks.TMMBlocks;
import net.manmaed.tomuchmoss.items.TMMItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by manmaed on 23/06/2022.
 */

@Mod(ToMuchMoss.MOD_ID)
public class ToMuchMoss {


    public static final String MOD_ID = "tomuchmoss";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    public static final CreativeModeTab TAB = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TMMBlocks.MOSSY_DEEPSLATE.get());
        }
    };

    public ToMuchMoss() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        TMMBlocks.BLOCKS.register(eventBus);
        TMMItems.ITEMS.register(eventBus);
        eventBus.addListener(ToMuchMossClient::doClientSetup);
    }

}