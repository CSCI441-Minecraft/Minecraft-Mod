package com.CSCI441Minecraft.questMod.entity;

import net.minecraft.entity.*;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.items.IItemHandler;

public class QuestMaster extends EntityVillager {

	public QuestMaster(World worldIn) {
		super(worldIn);
		
	}

	@Override
	public EntityVillager createChild(EntityAgeable ageable)
	{
		return new QuestMaster(world);
	}
	
}
