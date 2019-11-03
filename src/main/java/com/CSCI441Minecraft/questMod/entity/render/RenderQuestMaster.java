package com.CSCI441Minecraft.questMod.entity.render;

import com.CSCI441Minecraft.questMod.entity.QuestMaster;
import com.CSCI441Minecraft.questMod.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderQuestMaster extends RenderLiving<QuestMaster>{
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/questmaster.png");

	public RenderQuestMaster(RenderManager manager)
	{
		super(manager, new ModelVillager(0.0f), 0.5f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(QuestMaster entity)
	{
		return TEXTURES;
	}
	
	
}
