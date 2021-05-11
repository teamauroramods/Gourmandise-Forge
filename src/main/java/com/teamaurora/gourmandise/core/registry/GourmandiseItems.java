package com.teamaurora.gourmandise.core.registry;

import com.minecraftabnormals.abnormals_core.core.util.registry.ItemSubRegistryHelper;
import com.teamaurora.gourmandise.core.Gourmandise;
import com.teamaurora.gourmandise.common.item.DrinkItem;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gourmandise.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GourmandiseItems {
    public static final ItemSubRegistryHelper HELPER = Gourmandise.REGISTRY_HELPER.getItemSubHelper();

    public static final RegistryObject<Item> GRAPE_BOAT = HELPER.createBoatItem("grape", GourmandiseBlocks.GRAPE_PLANKS);

    public static final RegistryObject<Item> GRAPE_BUNCH = HELPER.createItem("grape_bunch", ()->new Item(new Item.Properties().group(ItemGroup.MISC))); // TODO: make it so this can be made into grapes
    public static final RegistryObject<Item> GRAPES = HELPER.createItem("grapes", ()->new Item(new Item.Properties().food(Foods.GRAPES).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> GRAPE_JUICE = HELPER.createItem("grape_juice", ()->new DrinkItem(new Item.Properties().containerItem(Items.GLASS_BOTTLE).food(Foods.GRAPE_JUICE).maxStackSize(16).group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> CHEESE = HELPER.createItem("cheese", ()->new Item(new Item.Properties().food(Foods.CHEESE).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> CHEESE_SAUCE = HELPER.createItem("cheese_sauce", ()->new SoupItem(new Item.Properties().food(Foods.CHEESE_SAUCE).containerItem(Items.BOWL).maxStackSize(1).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> CHEESE_BREAD = HELPER.createItem("cheese_bread", ()->new Item(new Item.Properties().food(Foods.CHEESE_BREAD).group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> PINEAPPLE_LEAVES = HELPER.createItem("pineapple_leaves", ()->new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> PINEAPPLE = HELPER.createItem("pineapple", ()->new BlockNamedItem(GourmandiseBlocks.PINEAPPLE.get(), new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> PINEAPPLE_SLICES = HELPER.createItem("pineapple_slices", ()->new Item(new Item.Properties().food(Foods.PINEAPPLE_SLICES).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> PINEAPPLE_PUNCH = HELPER.createItem("pineapple_punch", ()->new DrinkItem(new Item.Properties().containerItem(Items.GLASS_BOTTLE).food(Foods.PINEAPPLE_PUNCH).maxStackSize(16).group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> SAUSAGE = HELPER.createItem("sausage", ()->new Item(new Item.Properties().food(Foods.SAUSAGE).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> COOKED_SAUSAGE = HELPER.createItem("cooked_sausage", ()->new Item(new Item.Properties().food(Foods.COOKED_SAUSAGE).group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> SHRIMP = HELPER.createItem("shrimp", ()->new Item(new Item.Properties().food(Foods.SHRIMP).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> COOKED_SHRIMP = HELPER.createItem("cooked_shrimp", ()->new Item(new Item.Properties().food(Foods.COOKED_SHRIMP).group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> SHRIMP_ON_A_STICK = HELPER.createItem("shrimp_on_a_stick", ()->new Item(new Item.Properties().food(Foods.SHRIMP_ON_A_STICK).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> CHEESE_SAUSAGE = HELPER.createItem("cheese_sausage", ()->new Item(new Item.Properties().food(Foods.CHEESE_SAUSAGE).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> FRUIT_SALAD = HELPER.createItem("fruit_salad", ()->new SoupItem(new Item.Properties().food(Foods.FRUIT_SALAD).maxStackSize(1).containerItem(Items.BOWL).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> POTATO_CHIP = HELPER.createItem("potato_chip", ()->new Item(new Item.Properties().food(Foods.POTATO_CHIP).group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> GOLDEN_WHEAT = HELPER.createItem("golden_wheat", ()->new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> GOLDEN_BREAD = HELPER.createItem("golden_bread", ()->new Item(new Item.Properties().food(Foods.GOLDEN_BREAD).group(ItemGroup.FOOD)));

    public static class Foods {
        // mostly temp values until all recipes are in
        public static final Food GRAPES = (new Food.Builder()).hunger(4).saturation(0.3F).build();
        public static final Food GRAPE_JUICE = (new Food.Builder()).hunger(2).saturation(0.1F).build();

        public static final Food CHEESE = (new Food.Builder()).hunger(2).saturation(0.15F).build();
        public static final Food CHEESE_SAUCE = (new Food.Builder()).hunger(3).saturation(0.2F).build();
        public static final Food CHEESE_BREAD = (new Food.Builder()).hunger(7).saturation(0.7F).build();

        // pineapple stuff is literally just a copy of grape stuff for now lmao
        public static final Food PINEAPPLE_SLICES = (new Food.Builder()).hunger(4).saturation(0.3F).build();
        public static final Food PINEAPPLE_PUNCH = (new Food.Builder()).hunger(2).saturation(0.1F).build();

        public static final Food SAUSAGE = (new Food.Builder()).hunger(2).saturation(0.1F).meat().build();
        public static final Food COOKED_SAUSAGE = (new Food.Builder()).hunger(5).saturation(0.3F).meat().build();

        public static final Food SHRIMP = (new Food.Builder()).hunger(2).saturation(0.1F).build();
        public static final Food COOKED_SHRIMP = (new Food.Builder()).hunger(4).saturation(0.2F).build();

        // these ones are *especially* temporary
        public static final Food SHRIMP_ON_A_STICK = (new Food.Builder()).hunger(6).saturation(0.4F).build();
        public static final Food CHEESE_SAUSAGE = (new Food.Builder()).hunger(6).saturation(0.4F).build();
        public static final Food FRUIT_SALAD = (new Food.Builder()).hunger(6).saturation(0.4F).build();
        public static final Food POTATO_CHIP = (new Food.Builder()).hunger(6).saturation(0.4F).build();

        public static final Food GOLDEN_BREAD = (new Food.Builder()).hunger(8).saturation(1.2F).build();
    }
}
