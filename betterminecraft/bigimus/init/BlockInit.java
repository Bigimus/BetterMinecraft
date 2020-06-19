package betterminecraft.bigimus.init;

import betterminecraft.bigimus.betterMinecraft;
import betterminecraft.bigimus.betterMinecraftItemGroup.betterMinecraftTabBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = betterMinecraft.MOD_ID, bus = Bus.MOD)
@ObjectHolder(betterMinecraft.MOD_ID)
public class BlockInit {
	//Creative Tabs
	public static betterMinecraftTabBlock blocks = betterMinecraftTabBlock.block;
	
	//Blocks
	public static final Block titanium_block = null;
	public static final Block steel_block = null;
	public static final Block titanium_ore = null;
	public static final Block copper_block = null;
	public static final Block copper_ore = null;
	public static final Block tin_block = null;
	public static final Block tin_ore = null;
	public static final Block iron_furnace = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(6.0F).sound(SoundType.METAL).harvestLevel(3).harvestTool(ToolType.PICKAXE)).setRegistryName("titanium_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(6.0F).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("steel_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(6.0F).sound(SoundType.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE)).setRegistryName("titanium_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName("copper_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(6.0F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName("copper_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName("tin_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(6.0F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName("tin_ore"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new BlockItem(titanium_block, new Item.Properties().group(blocks)).setRegistryName("titanium_block"));
		event.getRegistry().register(new BlockItem(steel_block, new Item.Properties().group(blocks)).setRegistryName("steel_block"));
		event.getRegistry().register(new BlockItem(titanium_ore, new Item.Properties().group(blocks)).setRegistryName("titanium_ore"));
		event.getRegistry().register(new BlockItem(copper_block, new Item.Properties().group(blocks)).setRegistryName("copper_block"));
		event.getRegistry().register(new BlockItem(copper_ore, new Item.Properties().group(blocks)).setRegistryName("copper_ore"));
		event.getRegistry().register(new BlockItem(tin_block, new Item.Properties().group(blocks)).setRegistryName("tin_block"));
		event.getRegistry().register(new BlockItem(tin_ore, new Item.Properties().group(blocks)).setRegistryName("tin_ore"));
		event.getRegistry().register(new BlockItem(iron_furnace, new Item.Properties().group(blocks)).setRegistryName("iron_furnace"));
		}
}
