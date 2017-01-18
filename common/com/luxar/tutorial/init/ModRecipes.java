// This class deviates from SilentChaos' tutorial a little so as to have a place for adding new recipes
// that use vanilla blocks and items.  The init method is called from CommonProxy during the
// initialization phase.

package com.luxar.tutorial.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModRecipes {

	public static void init() {

		// An alternate bed recipe that uses straw instead of wool
		GameRegistry.addRecipe(new ItemStack(Items.BED), "   ", "hhh", "ppp", 'h', new ItemStack(Blocks.HAY_BLOCK), 'p',
				new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
	}
}
