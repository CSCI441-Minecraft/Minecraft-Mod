package com.CSCI441Minecraft.questMod.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;

public class QuestMasterGui extends Gui{
	public QuestMasterGui(Minecraft mc)
	{
		String text = "TEST";
		
		ScaledResolution scaled = new ScaledResolution(mc);
		int width = scaled.getScaledWidth();
		int height = scaled.getScaledHeight();
		
		drawCenteredString(mc.fontRenderer, text, width / 2, (height / 2) - 4, Integer.parseInt("FFFFFF", 16));
	}
}
