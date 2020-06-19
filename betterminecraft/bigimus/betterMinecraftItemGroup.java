package betterminecraft.bigimus;
import betterminecraft.bigimus.init.BlockInit;
import betterminecraft.bigimus.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class betterMinecraftItemGroup {

	//Blocks
	public static class betterMinecraftTabBlock extends ItemGroup{
		public static final betterMinecraftTabBlock block = new betterMinecraftTabBlock(ItemGroup.GROUPS.length, "betterminecraftblock");
		private betterMinecraftTabBlock(int index, String Label) {
			super(index, Label);
			}
				@Override
				public ItemStack createIcon() {
					return new ItemStack(BlockInit.titanium_block);
				}
		}
	//Armor
	public static class betterMinecraftTabArmor extends ItemGroup{
		public static final betterMinecraftTabArmor armor = new betterMinecraftTabArmor(ItemGroup.GROUPS.length, "betterminecraftarmor");
		public betterMinecraftTabArmor(int index, String label) {
			super(index, label);
			}
				@Override
				public ItemStack createIcon() {
					return new ItemStack(ItemInit.titanium_chestplate);
				}
		}
	//Tools
	public static class betterMinecraftTabTool extends ItemGroup{
		public static final betterMinecraftTabTool tool = new betterMinecraftTabTool(ItemGroup.GROUPS.length, "betterminecrafttool");
		public betterMinecraftTabTool(int index, String label) {
			super(index, label);
		}
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ItemInit.titanium_pickaxe);
			}
	}
	//Weapons
	public static class betterMinecraftTabWeapon extends ItemGroup{
		public static final betterMinecraftTabWeapon weapon = new betterMinecraftTabWeapon(ItemGroup.GROUPS.length, "betterminecraftweapon");
		public betterMinecraftTabWeapon(int index, String label) {
			super(index, label);
		}
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ItemInit.titanium_sword);
			}
	}
	//Food
	public static class betterMinecraftTabFood extends ItemGroup{
		public static final betterMinecraftTabFood food = new betterMinecraftTabFood(ItemGroup.GROUPS.length, "betterminecraftfood");
		public betterMinecraftTabFood(int index, String label) {
			super(index, label);
		}
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ItemInit.green_apple);
			}
	}
	//Materials
	public static class betterMinecraftTabMaterial extends ItemGroup{
		public static final betterMinecraftTabMaterial material = new betterMinecraftTabMaterial(ItemGroup.GROUPS.length, "betterminecraftmaterial");
		public betterMinecraftTabMaterial(int index, String label) {
			super(index, label);
		}
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ItemInit.titanium_ingot);
			}
	}
}


