package com.suziLe.questRewards.init;

import java.util.ArrayList;
import java.util.List;
import com.suziLe.questRewards.items.ItemBase;
import com.suziLe.questRewards.items.tools.ToolSword;
import com.suziLe.questRewards.util.Reference;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{ 	
	public static final List<Item> ITEMS = new ArrayList<Item>(); 
	
	//materials
	public static final ToolMaterial MATERIAL_OBSIDIAN_INGOT = EnumHelper.addToolMaterial("material_obsidian_ingot", 4, 30000, 10.0f, 4.0f, 25);
	
	//items
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");

	
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN_INGOT);


	   
	    
  
    }



