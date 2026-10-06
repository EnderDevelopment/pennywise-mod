package com.bd3194345.pennywisemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public
class ModCreativeModeTab {
    public static final CreativeModeTab PENNYWISE_TAB = new CreativeModeTab("pennywisetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RED_BALLOON.get());
        }
    };
}
