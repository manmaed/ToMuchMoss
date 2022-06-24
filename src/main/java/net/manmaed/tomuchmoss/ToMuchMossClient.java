package net.manmaed.tomuchmoss;

import net.manmaed.tomuchmoss.blocks.TMMBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * Created by manmaed on 23/06/2022.
 */
public class ToMuchMossClient {

    public static void doClientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(TMMBlocks.MOSSY_DEEPSLATE.get(), renderType -> renderType == RenderType.solid() || renderType == RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TMMBlocks.COBBLED_MOSSY_DEEPSLATE.get(), renderType -> renderType == RenderType.solid() || renderType == RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TMMBlocks.MOSSY_DEEPSLATE_SLAB.get(), renderType -> renderType == RenderType.solid() || renderType == RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TMMBlocks.MOSSY_DEEPSLATE_STAIR.get(), renderType -> renderType == RenderType.solid() || renderType == RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TMMBlocks.MOSSY_DEEPSLATE_WALL.get(), renderType -> renderType == RenderType.solid() || renderType == RenderType.translucent());

    }
}
