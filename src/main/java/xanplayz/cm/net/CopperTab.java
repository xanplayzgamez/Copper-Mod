package xanplayz.cm.net;

import xanplayz.cm.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CopperTab extends CreativeTabs
{


	public CopperTab(String string){
	    super("copper_tab");
	}

	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.COPPER_INGOT);}
	
}
