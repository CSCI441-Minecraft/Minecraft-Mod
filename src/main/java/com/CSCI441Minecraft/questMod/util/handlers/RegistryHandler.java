package com.CSCI441Minecraft.questMod.util.handlers;

import com.CSCI441Minecraft.questMod.init.EntityInit;
import com.CSCI441Minecraft.questMod.init.ModItems;
import com.CSCI441Minecraft.questMod.util.Model;
import com.CSCI441Minecraft.questMod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;
import net.minecraftforge.registries.IForgeRegistry;


@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)

	{
		for(Item item : ModItems.ITEMS)
		{
			
			if (item instanceof Model)
			{
				((Model)item).registerModels();
			}
		}
		
		
	}
	
	//register new professions
	@SubscribeEvent
	public static void onEvent(final RegistryEvent.Register<VillagerProfession> event) {
		final IForgeRegistry<VillagerProfession> registry = event.getRegistry();
		
		registry.register(new VillagerProfession(
				Reference.MOD_ID+":QuestMaster",
				"minecraft:textures/entity/villager/villager.png",
				"minecraft:textures/entity/villager/villager.png"
				)
			);
	}
	
	
	// entity entries will not spawn if used in a subscribe event above
	public static void preInitRegistries() 
	{
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
	}
	
	
}