package com.CSCI441Minecraft.questMod.init;

import java.util.Random;


import com.CSCI441Minecraft.questMod.util.Reference;

import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityVillager.ITradeList;
import net.minecraft.entity.passive.EntityVillager.PriceInfo;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerCareer;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;


@ObjectHolder(Reference.MOD_ID)
public class ModProfessions {
	
	// create a profession for the quest_npc career
	public final static VillagerProfession QuestMaster = null;
	
	// declare a new career for the quest master entity
	public static VillagerCareer quest_npc;
	
	
	public static void associateCareersAndTrades() {
		quest_npc = (new VillagerCareer(QuestMaster, "quest_npc")).addTrade(1,  new TradeThisForThat());
	}
	
	public static class TradeThisForThat implements ITradeList {
		
		public ItemStack stack;
		
		public EntityVillager.PriceInfo priceInfo;
		
		// creates the trade - currently emeralds for obsidian sword
		public TradeThisForThat() {
			stack = new ItemStack(ModItems.OBSIDIAN_SWORD);
			priceInfo = new PriceInfo(17, 64);
			
		}

		@Override
		public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
}
