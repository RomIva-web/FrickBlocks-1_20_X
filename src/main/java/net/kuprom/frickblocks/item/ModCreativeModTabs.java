package net.kuprom.frickblocks.item;

import net.kuprom.frickblocks.FrickBlocks;
import net.kuprom.frickblocks.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FrickBlocks.MOD_ID);
    public static  final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ACACIA_PLANKS_FRICK_A.get()))
                    .title(Component.translatable("creativeTab.tutorial_tab"))
                    .displayItems((pParameters,pOutput) ->{

                        pOutput.accept(Items.DIAMOND);
                        pOutput.accept(ModBlocks.ACACIA_PLANKS_FRICK_A.get());
                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATE_MODE_TABS.register(eventBus);
    }
}

