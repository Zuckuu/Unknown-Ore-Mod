package com.zucku.unknownmod.item;

import com.zucku.unknownmod.UnknownMod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, UnknownMod.MOD_ID);

    public static final RegistryObject<Item> DARK = ITEMS.register("dark", 
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> DARK_INGOT = ITEMS.register("dark_ingot", 
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
