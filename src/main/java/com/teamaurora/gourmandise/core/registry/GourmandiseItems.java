package com.teamaurora.gourmandise.core.registry;

import com.minecraftabnormals.abnormals_core.core.util.registry.ItemSubRegistryHelper;
import com.teamaurora.gourmandise.common.item.FoodOnStickItem;
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
    public static final RegistryObject<Item> DRIED_GRAPES = HELPER.createItem("dried_grapes", ()->new Item(new Item.Properties().food(Foods.DRIED_GRAPES).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> GRAPE_JUICE = HELPER.createItem("grape_juice", ()->new DrinkItem(new Item.Properties().containerItem(Items.GLASS_BOTTLE).food(Foods.GRAPE_JUICE).maxStackSize(16).group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> CHEESE = HELPER.createItem("cheese", ()->new Item(new Item.Properties().food(Foods.CHEESE).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> CHEESE_SAUCE = HELPER.createItem("cheese_sauce", ()->new SoupItem(new Item.Properties().food(Foods.CHEESE_SAUCE).containerItem(Items.BOWL).maxStackSize(1).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> CHEESE_BREAD = HELPER.createItem("cheese_bread", ()->new Item(new Item.Properties().food(Foods.CHEESE_BREAD).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> CHEESE_WHEEL = HELPER.createItem("cheese_wheel", ()->new Item(new Item.Properties().group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> BLUE_CHEESE = HELPER.createItem("blue_cheese", ()->new Item(new Item.Properties().food(Foods.BLUE_CHEESE).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> BLUE_CHEESE_WHEEL = HELPER.createItem("blue_cheese_wheel", ()->new Item(new Item.Properties().group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> SOFT_CHEESE = HELPER.createItem("soft_cheese", ()->new Item(new Item.Properties().food(Foods.SOFT_CHEESE).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> SOFT_CHEESE_WHEEL = HELPER.createItem("soft_cheese_wheel", ()->new Item(new Item.Properties().group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> MELTED_CHEESE = HELPER.createItem("melted_cheese", ()->new Item(new Item.Properties().food(Foods.MELTED_CHEESE).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> MELTED_CHEESE_BUCKET = HELPER.createItem("melted_cheese_bucket", ()->new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> GRILLED_CHEESE = HELPER.createItem("grilled_cheese", ()->new Item(new Item.Properties().food(Foods.GRILLED_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> PINEAPPLE_LEAVES = HELPER.createItem("pineapple_leaves", ()->new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> PINEAPPLE = HELPER.createItem("pineapple", ()->new BlockNamedItem(GourmandiseBlocks.PINEAPPLE.get(), new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> PINEAPPLE_SLICES = HELPER.createItem("pineapple_slices", ()->new Item(new Item.Properties().food(Foods.PINEAPPLE_SLICES).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> PINEAPPLE_PUNCH = HELPER.createItem("pineapple_punch", ()->new DrinkItem(new Item.Properties().containerItem(Items.GLASS_BOTTLE).food(Foods.PINEAPPLE_PUNCH).maxStackSize(16).group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> SAUSAGE = HELPER.createItem("sausage", ()->new Item(new Item.Properties().food(Foods.SAUSAGE).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> COOKED_SAUSAGE = HELPER.createItem("cooked_sausage", ()->new Item(new Item.Properties().food(Foods.COOKED_SAUSAGE).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> CHEESE_SAUSAGE = HELPER.createItem("cheese_sausage", ()->new Item(new Item.Properties().food(Foods.CHEESE_SAUSAGE).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> HOT_DOG = HELPER.createItem("hot_dog", ()->new Item(new Item.Properties().food(Foods.HOT_DOG).group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> SHRIMP = HELPER.createItem("shrimp", ()->new Item(new Item.Properties().food(Foods.SHRIMP).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> COOKED_SHRIMP = HELPER.createItem("cooked_shrimp", ()->new Item(new Item.Properties().food(Foods.COOKED_SHRIMP).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> SHRIMP_ON_A_STICK = HELPER.createItem("shrimp_on_a_stick", ()->new FoodOnStickItem(new Item.Properties().food(Foods.SHRIMP_ON_A_STICK).group(ItemGroup.FOOD).containerItem(Items.STICK)));

    public static final RegistryObject<Item> GOURMAND_SALAD = HELPER.createItem("gourmand_salad", ()->new SoupItem(new Item.Properties().food(Foods.FRUIT_SALAD).maxStackSize(1).containerItem(Items.BOWL).group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> POTATO_CHIPS = HELPER.createItem("potato_chips", ()->new Item(new Item.Properties().food(Foods.POTATO_CHIPS).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> SPICY_CHIPS = HELPER.createItem("spicy_chips", ()->new Item(new Item.Properties().food(Foods.SPICY_CHIPS).group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> GOLDEN_WHEAT = HELPER.createItem("golden_wheat", ()->new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> GOLDEN_BREAD = HELPER.createItem("golden_bread", ()->new Item(new Item.Properties().food(Foods.GOLDEN_BREAD).group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> SLICED_BREAD = HELPER.createItem("sliced_bread", ()->new Item(new Item.Properties().food(Foods.SLICED_BREAD).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> PIZZA = HELPER.createItem("pizza", ()->new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> PIZZA_SLICE = HELPER.createItem("pizza_slice", ()->new Item(new Item.Properties().food(Foods.PIZZA_SLICE).group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> PEPPER_SEEDS = HELPER.createItem("pepper_seeds", ()->new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> PEPPER_VINE = HELPER.createItem("pepper_vine", ()->new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> PEPPER_BUNCH = HELPER.createItem("pepper_bunch", ()->new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> PEPPER = HELPER.createItem("pepper", ()->new Item(new Item.Properties().food(Foods.PEPPER).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> PAPRIKA = HELPER.createItem("paprika", ()->new Item(new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<Item> SPICY_CHICKEN = HELPER.createItem("spicy_chicken", ()->new Item(new Item.Properties().food(Foods.SPICY_CHICKEN).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> SPICY_FISH = HELPER.createItem("spicy_fish", ()->new Item(new Item.Properties().food(Foods.SPICY_FISH).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> SPICY_FISH_SOUP = HELPER.createItem("spicy_fish_soup", ()->new SoupItem(new Item.Properties().food(Foods.SPICY_FISH_SOUP).group(ItemGroup.FOOD).containerItem(Items.BOWL).maxStackSize(1)));

    public static class Foods {
        // mostly temp values until all recipes are in
        public static final Food GRAPES = (new Food.Builder()).hunger(4).saturation(0.3F).build();
        public static final Food DRIED_GRAPES = (new Food.Builder()).hunger(4).saturation(0.3F).build(); // TODO: make distinct from regular grapes
        public static final Food GRAPE_JUICE = (new Food.Builder()).hunger(2).saturation(0.1F).build();

        public static final Food CHEESE = (new Food.Builder()).hunger(2).saturation(0.15F).build();
        public static final Food CHEESE_SAUCE = (new Food.Builder()).hunger(3).saturation(0.2F).build();
        public static final Food CHEESE_BREAD = (new Food.Builder()).hunger(7).saturation(0.7F).build();

        // TODO: make distinct from other cheeses
        public static final Food BLUE_CHEESE = (new Food.Builder()).hunger(2).saturation(0.15F).build();
        public static final Food SOFT_CHEESE = (new Food.Builder()).hunger(2).saturation(0.15F).build();
        public static final Food MELTED_CHEESE = (new Food.Builder()).hunger(2).saturation(0.15F).build();

        public static final Food GRILLED_CHEESE = (new Food.Builder()).hunger(7).saturation(0.7F).build(); // TODO: make distinct from cheese bread

        // pineapple stuff is literally just a copy of grape stuff for now lmao
        public static final Food PINEAPPLE_SLICES = (new Food.Builder()).hunger(4).saturation(0.3F).build();
        public static final Food PINEAPPLE_PUNCH = (new Food.Builder()).hunger(2).saturation(0.1F).build();

        public static final Food SAUSAGE = (new Food.Builder()).hunger(2).saturation(0.1F).meat().build();
        public static final Food COOKED_SAUSAGE = (new Food.Builder()).hunger(5).saturation(0.3F).meat().build();
        public static final Food HOT_DOG = (new Food.Builder()).hunger(5).saturation(0.3F).meat().build(); // TODO: make distinct from cooked sausage

        public static final Food SHRIMP = (new Food.Builder()).hunger(2).saturation(0.1F).build();
        public static final Food COOKED_SHRIMP = (new Food.Builder()).hunger(4).saturation(0.2F).build();

        // these ones are *especially* temporary
        public static final Food SHRIMP_ON_A_STICK = (new Food.Builder()).hunger(6).saturation(0.4F).build();
        public static final Food CHEESE_SAUSAGE = (new Food.Builder()).hunger(6).saturation(0.4F).build();
        public static final Food FRUIT_SALAD = (new Food.Builder()).hunger(6).saturation(0.4F).build();

        public static final Food POTATO_CHIPS = (new Food.Builder()).hunger(6).saturation(0.4F).build();
        public static final Food SPICY_CHIPS = (new Food.Builder()).hunger(6).saturation(0.4F).build(); // TODO: add spice

        public static final Food SLICED_BREAD = (new Food.Builder()).hunger(2).saturation(0.2F).build();
        public static final Food PIZZA_SLICE = (new Food.Builder()).hunger(2).saturation(0.2F).build(); // TODO: make different from sliced bread lmao

        public static final Food GOLDEN_BREAD = (new Food.Builder()).hunger(8).saturation(1.2F).build();

        // TODO: make not clones of vanilla foods (currently carrot, cooked chicken, cooked cod, rabbit stew)
        public static final Food PEPPER = (new Food.Builder()).hunger(3).saturation(0.6F).build();
        public static final Food SPICY_CHICKEN = (new Food.Builder()).hunger(6).saturation(0.6F).meat().build();
        public static final Food SPICY_FISH = (new Food.Builder()).hunger(5).saturation(0.6F).build();
        public static final Food SPICY_FISH_SOUP = (new Food.Builder()).hunger(10).saturation(0.6F).build();
    }
}
