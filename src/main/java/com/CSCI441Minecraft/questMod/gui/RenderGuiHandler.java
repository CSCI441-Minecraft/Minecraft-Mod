package com.CSCI441Minecraft.questMod.gui;

import com.CSCI441Minecraft.questMod.entity.QuestMaster;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RenderGuiHandler {

//	@SubscribeEvent
	public void onRenderQuestMaster(PlayerInteractEvent.EntityInteract event)
	{
		// event happens when QuestMaster is clicked
		if (event.getTarget() instanceof QuestMaster) 
		{
			new QuestMasterGui(Minecraft.getMinecraft());
		}
		
	}
}
