package com.CSCI441Minecraft.questMod.util.handlers;

import com.CSCI441Minecraft.questMod.entity.QuestMaster;
import com.CSCI441Minecraft.questMod.entity.render.RenderQuestMaster;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(QuestMaster.class, new IRenderFactory<QuestMaster>()
				{
					@Override
					public Render<? super QuestMaster> createRenderFor(RenderManager manager)
					{
						return new RenderQuestMaster(manager);
					}
				});
	}
}
