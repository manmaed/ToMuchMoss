package net.manmaed.tomuchmoss;

import net.manmaed.tomuchmoss.blocks.TMMBlocks;
import net.manmaed.tomuchmoss.items.TMMItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by manmaed on 23/06/2022.
 */

@Mod(ToMuchMoss.MOD_ID)
public class ToMuchMoss {


    public static final String MOD_ID = "tomuchmoss";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    public ToMuchMoss() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        TMMBlocks.BLOCKS.register(eventBus);
        TMMItems.ITEMS.register(eventBus);
    }

    public void createTabs(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new ResourceLocation(MOD_ID, "creative_tab"), builder -> builder
                .icon(() -> new ItemStack(Items.WITHER_ROSE))
                .title(Component.translatable("itemGroup." + MOD_ID))
                .displayItems((features, output, hasPrems) -> {
                    for (Item item : ForgeRegistries.ITEMS.getValues()) {
                        if (item.getCreatorModId(item.getDefaultInstance()).equals(MOD_ID)) {
                            output.accept(item);
                        }
                    }
                })
        );
    }

}