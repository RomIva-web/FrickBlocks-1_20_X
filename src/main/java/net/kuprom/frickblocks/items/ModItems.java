package net.kuprom.frickblocks.items;

import net.kuprom.frickblocks.FrickBlocks;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item>ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FrickBlocks.MOD_ID);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> MANDARIN = ITEMS.register("mandarin",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MANDARIN = ITEMS.register("raw_mandarin",
            ()->new Item(new Item.Properties()));
}
