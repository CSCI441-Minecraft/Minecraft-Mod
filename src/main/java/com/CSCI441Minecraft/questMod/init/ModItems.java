package com.CSCI441Minecraft.questMod.init;

import java.util.ArrayList;
import java.util.List;

import com.CSCI441Minecraft.questMod.items.ItemBase;
import com.CSCI441Minecraft.questMod.items.armor.ArmorBase;
import com.CSCI441Minecraft.questMod.items.tools.ToolSword;
import com.CSCI441Minecraft.questMod.util.Reference;


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
	
	//Materials
	public static final ToolMaterial MATERIAL_OBSIDIAN_INGOT = EnumHelper.addToolMaterial("material_obsidian_ingot", 4, 30000, 10.0f, 4.0f, 25);
	public static final ArmorMaterial ARMOR_MATERIAL_OBSIDIAN_INGOT = EnumHelper.addArmorMaterial("armor_material_obsidian_ingot", Reference.MOD_ID + ":obsidian_ingot", 15, 
			new int[] {4, 9, 8, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	//Items
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");

	//Tools
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN_INGOT);
	
	//Armor
	public static final Item OBSIDIAN_HELMET = new ArmorBase("obsidian_helmet", ARMOR_MATERIAL_OBSIDIAN_INGOT, 1, EntityEquipmentSlot.HEAD);
	public static final Item OBSIDIAN_CHESTPLATE = new ArmorBase("obsidian_chestplate", ARMOR_MATERIAL_OBSIDIAN_INGOT, 1, EntityEquipmentSlot.CHEST);
	public static final Item OBSIDIAN_LEGGINGS = new ArmorBase("obsidian_leggings", ARMOR_MATERIAL_OBSIDIAN_INGOT, 2, EntityEquipmentSlot.LEGS);
	public static final Item OBSIDIAN_BOOTS = new ArmorBase("obsidian_boots", ARMOR_MATERIAL_OBSIDIAN_INGOT, 1, EntityEquipmentSlot.FEET);


	   
	    
  
    }
