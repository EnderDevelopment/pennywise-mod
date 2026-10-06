package com.bd3194345.pennywisemod.event;

import com.bd3194345.pennywisemod.ability.PennywiseAbilities;
import com.bd3194345.pennywisemod.item.ModItems;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "pennywisemod")
public
class ModEvents {
    @SubscribeEvent
    public static void onPlayerInteract(PlayerInteractEvent.RightClickItem event) {
        Player player = event.getEntity();
        ItemStack itemStack = event.getItemStack();

        if (itemStack.getItem() == ModItems.RED_BALLOON.get()) {
            PennywiseAbilities.transformPlayer(player);
        }
    }
}
