package com.CSCI441Minecraft.questMod.items.tools;

import com.CSCI441Minecraft.questMod.Main;
import com.CSCI441Minecraft.questMod.init.ModItems;
import com.CSCI441Minecraft.questMod.util.Model;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements Model {

	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}