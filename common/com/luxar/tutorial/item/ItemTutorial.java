package com.luxar.tutorial.item;

import com.luxar.tutorial.Tutorial;
import com.luxar.tutorial.lib.Names;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemTutorial extends Item {
	
    public ItemTutorial()
    {
        this.setCreativeTab(CreativeTabs.TOOLS);
    }

	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		
		if (!world.isRemote)
			player.sendMessage(new TextComponentString("Don't wear it out!"));
		
		return super.onItemRightClick(world, player, hand);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		
		return "item." + Tutorial.RESOURCE_PREFIX + Names.TUTORIAL_ITEM; //item.tutorial:tutorial_item
	}
}
