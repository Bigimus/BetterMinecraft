package betterminecraft.bigimus.init;

import com.google.common.base.Supplier;
import betterminecraft.bigimus.betterMinecraft;
import betterminecraft.bigimus.betterMinecraftItemGroup.betterMinecraftTabArmor;
import betterminecraft.bigimus.betterMinecraftItemGroup.betterMinecraftTabBlock;
import betterminecraft.bigimus.betterMinecraftItemGroup.betterMinecraftTabFood;
import betterminecraft.bigimus.betterMinecraftItemGroup.betterMinecraftTabMaterial;
import betterminecraft.bigimus.betterMinecraftItemGroup.betterMinecraftTabTool;
import betterminecraft.bigimus.betterMinecraftItemGroup.betterMinecraftTabWeapon;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = betterMinecraft.MOD_ID, bus = Bus.MOD)
@ObjectHolder(betterMinecraft.MOD_ID)
public class ItemInit {
	//Creative Tabs
	public static betterMinecraftTabBlock block = betterMinecraftTabBlock.block;
	public static betterMinecraftTabTool tool = betterMinecraftTabTool.tool;
	public static betterMinecraftTabArmor armor = betterMinecraftTabArmor.armor;
	public static betterMinecraftTabFood food = betterMinecraftTabFood.food;
	public static betterMinecraftTabMaterial material = betterMinecraftTabMaterial.material;
	public static betterMinecraftTabWeapon weapon = betterMinecraftTabWeapon.weapon;

	//Items
	public static final Item titanium_ingot = null;
	public static final Item copper_ingot = null;
	public static final Item tin_ingot = null;
	public static final Item test_item = null;
	public static final Item obsidian_shard = null;

	//Food
	public static final Item green_apple = null;
	
	//Armor
	public static final Item titanium_helmet = null;
	public static final Item titanium_chestplate = null;
	public static final Item titanium_leggings = null;
	public static final Item titanium_boots = null;


	
	//Weapons
	public static final Item titanium_sword = null;
	public static final Item copper_sword = null;
	public static final Item tin_sword = null;
	
	//Tools
	public static final Item titanium_pickaxe = null;
	public static final Item titanium_axe = null;
	public static final Item titanium_hoe = null;
	public static final Item titanium_shovel = null;
	public static final Item copper_pickaxe = null;
	public static final Item copper_axe = null;
	public static final Item copper_hoe = null;
	public static final Item copper_shovel = null;
	public static final Item tin_pickaxe = null;
	public static final Item tin_axe = null;
	public static final Item tin_hoe = null;
	public static final Item tin_shovel = null;
	
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		/* -----------------------------Items-----------------------------------------------------------*/
		event.getRegistry().register(new Item(new Item.Properties().group(material)).setRegistryName("titanium_ingot"));
		event.getRegistry().register(new Item(new Item.Properties().group(material)).setRegistryName("copper_ingot"));
		event.getRegistry().register(new Item(new Item.Properties().group(material)).setRegistryName("tin_ingot"));
		event.getRegistry().register(new Item(new Item.Properties().group(material)).setRegistryName("silver_ingot"));
		event.getRegistry().register(new Item(new Item.Properties().group(material)).setRegistryName("steel_ingot"));
		
		
		/* -----------------------------Food-----------------------------------------------------------*/
		event.getRegistry().register(new Item(new Item.Properties().group(food).food(new Food.Builder().hunger(4).saturation(2.4F).build())).setRegistryName("green_apple"));
		
		/* -----------------------------Armor-----------------------------------------------------------*/
		
		//Titanium Armor
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.HEAD, new Item.Properties().group(armor)).setRegistryName("titanium_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.CHEST, new Item.Properties().group(armor)).setRegistryName("titanium_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.LEGS, new Item.Properties().group(armor)).setRegistryName("titanium_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.FEET, new Item.Properties().group(armor)).setRegistryName("titanium_boots"));

		
		/* -----------------------------Weapons-----------------------------------------------------------*/
		
		//Titanium Weapon
		event.getRegistry().register(new SwordItem(ModItemTier.TITANIUM, 7, 2.5F, new Item.Properties().group(weapon)).setRegistryName("titanium_sword"));
		event.getRegistry().register(new SwordItem(ModItemTier.COPPER, 4, 1.5F, new Item.Properties().group(weapon)).setRegistryName("copper_sword"));
		event.getRegistry().register(new SwordItem(ModItemTier.TIN, 4, 1.5F, new Item.Properties().group(weapon)).setRegistryName("tin_sword"));
		
		
		
		/* -----------------------------Tools-----------------------------------------------------------*/
		
		//Titanium Tools
		event.getRegistry().register(new PickaxeItem(ModItemTier.TITANIUM, 2, 2.5F, new Item.Properties().group(tool)).setRegistryName("titanium_pickaxe"));
		event.getRegistry().register(new AxeItem(ModItemTier.TITANIUM, 5, 2.5F, new Item.Properties().group(tool)).setRegistryName("titanium_axe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.TITANIUM, 2, 2.5F, new Item.Properties().group(tool)).setRegistryName("titanium_shovel"));
		event.getRegistry().register(new HoeItem(ModItemTier.TITANIUM, 2.5F, new Item.Properties().group(tool)).setRegistryName("titanium_hoe"));
		
		//Copper Tools
		event.getRegistry().register(new PickaxeItem(ModItemTier.COPPER, 2, 2.5F, new Item.Properties().group(tool)).setRegistryName("copper_pickaxe"));
		event.getRegistry().register(new AxeItem(ModItemTier.COPPER, 5, 2.5F, new Item.Properties().group(tool)).setRegistryName("copper_axe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.COPPER, 2, 2.5F, new Item.Properties().group(tool)).setRegistryName("copper_shovel"));
		event.getRegistry().register(new HoeItem(ModItemTier.COPPER, 2.5F, new Item.Properties().group(tool)).setRegistryName("copper_hoe"));
		
		//Tin Tools
		event.getRegistry().register(new PickaxeItem(ModItemTier.TIN, 2, 2.5F, new Item.Properties().group(tool)).setRegistryName("tin_pickaxe"));
		event.getRegistry().register(new AxeItem(ModItemTier.TIN, 5, 2.5F, new Item.Properties().group(tool)).setRegistryName("tin_axe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.TIN, 2, 2.5F, new Item.Properties().group(tool)).setRegistryName("tin_shovel"));
		event.getRegistry().register(new HoeItem(ModItemTier.TIN, 2.5F, new Item.Properties().group(tool)).setRegistryName("tin_hoe"));
	}
	public enum ModItemTier implements IItemTier {

		TITANIUM(4, 1000, 15.0F, 10.0F, 150, () -> {
			return Ingredient.fromItems(ItemInit.titanium_ingot);
		}),
		TIN(1, 250, 5.0F, 5.0F, 50, () -> {
			return Ingredient.fromItems(ItemInit.tin_ingot);
		}),
		COPPER(1, 250, 5.0F, 5.0F, 50, () -> {
			return Ingredient.fromItems(ItemInit.copper_ingot);
		});
		
		private final int harvestLevel, maxUses, enchantability;
		private final float efficiency, attackDamage;
		private final LazyValue<Ingredient> repairMaterial;
		
		private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}
	
	public enum ModArmorMaterial implements IArmorMaterial{
		TITANIUM(betterMinecraft.MOD_ID + ":titanium", 5, new int[] {7, 9, 11, 7}, 420, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.9F, () ->{ 
			return Ingredient.fromItems(ItemInit.titanium_ingot);
		});

		private static final int[] MAX_DAMAGE_ARRAY = new int[] { 16, 16, 16, 16 };
		private final String name;
		private final int maxDamageFactor, enchantability;
		private final int[] damageReductionAmountArray;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;
		private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn) {
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmountArray = damageReductionAmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
			
		}
		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.damageReductionAmountArray[slotIn.getIndex()];
		}
		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}
		@Override
		public int getEnchantability() {
			return this.enchantability;
		}
		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return this.name;
		}
		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
		@Override
		public SoundEvent getSoundEvent() {
			return this.soundEvent;

		}
		@Override
		public float getToughness() {
			return this.toughness;
	
		}
	}
}
