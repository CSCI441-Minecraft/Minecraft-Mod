package com.CSCI441Minecraft.questMod.items;

import java.util.Random;

import com.CSCI441Minecraft.questMod.Main;
import com.CSCI441Minecraft.questMod.init.ModItems;
import com.CSCI441Minecraft.questMod.util.Model;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemBase extends Item implements Model {

	public ItemBase(String name)
	{
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
