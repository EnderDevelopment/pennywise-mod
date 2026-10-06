package com.bd3194345.pennywisemod.item;

import com.bd3194345.pennywisemod.PennywiseMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public
class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PennywiseMod.MOD_ID);

    public static final RegistryObject<Item> RED_BALLOON = ITEMS.register("red_balloon", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PENNYWISE_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
