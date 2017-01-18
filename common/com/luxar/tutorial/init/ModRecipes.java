// This class deviates from SilentChaos' tutorial a little so as to have a place for adding new recipes
// that use vanilla blocks and items.  The init method is called from CommonProxy during the
// initialization phase.  Things aren't working so I'm not sure I'm calling it in the right place

package com.luxar.tutorial.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModRecipes {

	public static void init() {

		// An alternate bed recipe that uses straw instead of wool
		// this is borked and I don't know why
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.BED), "   ", "hhh", "ppp", 'h', Blocks.HAY_BLOCK, 'p',
				new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
	}
}
