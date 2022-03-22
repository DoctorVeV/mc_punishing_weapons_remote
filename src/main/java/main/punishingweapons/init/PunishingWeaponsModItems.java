
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package main.punishingweapons.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import main.punishingweapons.item.SunsPunishmentItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PunishingWeaponsModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item SUNS_PUNISHMENT = register(new SunsPunishmentItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
