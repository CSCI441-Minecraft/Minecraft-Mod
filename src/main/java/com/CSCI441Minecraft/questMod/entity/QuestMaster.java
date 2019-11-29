package com.CSCI441Minecraft.questMod.entity;

import java.util.Random;

import com.CSCI441Minecraft.questMod.init.ModProfessions;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;
import net.minecraftforge.items.IItemHandler;

public class QuestMaster extends EntityVillager {

	

	private static final DataParameter<Integer> PROFESSION = null;

	public QuestMaster(World worldIn) {
		super(worldIn);
		
	}

	@Override
	public EntityVillager createChild(EntityAgeable ageable)
	{
		return new QuestMaster(world);
	}
	
	@Override
	public void setProfession(int professionId)
    {
        this.dataManager.set(PROFESSION, Integer.valueOf(professionId));
        net.minecraftforge.fml.common.registry.VillagerRegistry.onSetProfession(this, professionId);
    }
}
