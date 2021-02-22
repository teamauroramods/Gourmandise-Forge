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

    public static class Foods {
        public static final Food GRAPES = (new Food.Builder()).hunger(4).saturation(0.3F).build();
        public static final Food GRAPE_JUICE = (new Food.Builder()).hunger(2).saturation(0.1F).build();

        public static final Food CHEESE = (new Food.Builder()).hunger(2).saturation(0.15F).build();
        public static final Food CHEESE_SAUCE = (new Food.Builder()).hunger(3).saturation(0.2F).build();
        public static final Food CHEESE_BREAD = (new Food.Builder()).hunger(7).saturation(0.7F).build();
    }
}
