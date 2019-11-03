package com.CSCI441Minecraft.questMod.init;

import com.CSCI441Minecraft.questMod.Main;
import com.CSCI441Minecraft.questMod.entity.QuestMaster;
import com.CSCI441Minecraft.questMod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
	
	public static void registerEntities() {
		registerEntity("questmaster", QuestMaster.class, Reference.ENTITY_QUESTMASTER, 10, 555555, 555555);
	}

	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
