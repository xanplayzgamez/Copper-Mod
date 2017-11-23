package xanplayz.cm.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import xanplayz.cm.net.Main;
import xanplayz.cm.init.ItemInit;
import xanplayz.cm.proxy.ClientProxy;
import xanplayz.cm.util.IHasModel;

public class ItemBase extends Item implements IHasModel
{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
