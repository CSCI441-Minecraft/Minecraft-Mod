package com.suziLe.questRewards.items.tools;

import com.suziLe.questRewards.Main;
import com.suziLe.questRewards.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.suziLe.questRewards.util.Model;
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