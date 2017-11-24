package xanplayz.cm.net;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
package xanplayz.cm.net;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xanplayz.cm.init.BlockInit;
import xanplayz.cm.init.ItemInit;
import xanplayz.cm.proxy.CommonProxy;
import xanplayz.cm.util.References;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class Main {
	
	
	public static final CreativeTabs COPPER = new CopperTab("coppertab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = References.CLIENT, serverSide = References.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
	
	

}
