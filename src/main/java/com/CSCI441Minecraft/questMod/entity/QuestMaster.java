package com.CSCI441Minecraft.questMod.entity;

import java.util.Random;

import com.CSCI441Minecraft.questMod.init.ModProfessions;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;
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
	
	//broken, need to find the right return value for this
//	@Override
//	public VillagerProfession getProfessionForge() {
//		return ForgeRegistries.VILLAGER_PROFESSIONS.getValue(new ResourceLocation("qr:QuestMasterTrade"));
//	}
	
	
}
