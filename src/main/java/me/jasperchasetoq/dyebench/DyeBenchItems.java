package me.jasperchasetoq.dyebench;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class DyeBenchItems {
    private DyeBenchItems() {}

    //groups
    public static final NestedItemGroup JC_DB_GENERAL = new NestedItemGroup(new NamespacedKey(DyeBench.getInstance(), "JC_DB_GENERAL"), new CustomItemStack(Material.LOOM, "&b染色科技"));
    public static final SubItemGroup JC_DB_MACHINES = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "JC_DB_MACHINES"), JC_DB_GENERAL, new CustomItemStack(Material.LOOM, "&b机器"));
    public static final SubItemGroup JC_DB_PIGMENTS = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "JC_DB_PIGMENTS"), JC_DB_GENERAL, new CustomItemStack(Material.WHITE_DYE, "&b颜料"));
    public static final SubItemGroup JC_DB_CRAFTING_MATERIALS = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "JC_DB_CRAFTING_MATERIALS"), JC_DB_GENERAL, new CustomItemStack(Material.WHITE_DYE, "&b颜料"));
    public static final SubItemGroup JC_DB_DYEABLE_BLOCKS = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "JC_DB_DYEABLE_BLOCKS"), JC_DB_GENERAL, new CustomItemStack(Material.WHITE_WOOL, "&b可染色方块"));

    public static final ItemGroup DyeBenchGeneral = new ItemGroup(new NamespacedKey(DyeBench.getInstance(), "DyeBench"),
            new CustomItemStack(Material.LOOM, "&b染色科技"));
    
    //machines
    public static final SlimefunItemStack JC_DYEBENCH = new SlimefunItemStack("JC_DYEBENCH", Material.LOOM, "&e染色器", "&f用染料给物品染色", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(50));
    //Pigments
    public static final SlimefunItemStack JC_WHITE_PIGMENT = new SlimefunItemStack("JC_WHITE_PIGMENT", Material.WHITE_DYE, "&f白色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack JC_ORANGE_PIGMENT = new SlimefunItemStack("JC_ORANGE_PIGMENT", Material.ORANGE_DYE, "&d橙色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack JC_MAGENTA_PIGMENT = new SlimefunItemStack("JC_MAGENTA_PIGMENT", Material.MAGENTA_DYE, "&d品红色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack JC_LIGHT_BLUE_PIGMENT = new SlimefunItemStack("JC_LIGHT_BLUE_PIGMENT", Material.LIGHT_BLUE_DYE, "&d淡蓝色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack JC_YELLOW_PIGMENT = new SlimefunItemStack("JC_YELLOW_PIGMENT", Material.YELLOW_DYE, "&d黄色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack JC_LIME_PIGMENT = new SlimefunItemStack("JC_LIME_PIGMENT", Material.LIME_DYE, "&d黄绿色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack JC_PINK_PIGMENT = new SlimefunItemStack("JC_PINK_PIGMENT", Material.PINK_DYE, "&d粉色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack JC_GRAY_PIGMENT = new SlimefunItemStack("JC_GRAY_PIGMENT", Material.GRAY_DYE, "&d灰色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack JC_LIGHT_GRAY_PIGMENT = new SlimefunItemStack("JC_LIGHT_GRAY_PIGMENT", Material.LIGHT_GRAY_DYE, "&d淡灰色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack JC_CYAN_PIGMENT = new SlimefunItemStack("JC_CYAN_PIGMENT", Material.CYAN_DYE, "&d青色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack JC_PURPLE_PIGMENT = new SlimefunItemStack("JC_PURPLE_PIGMENT", Material.PURPLE_DYE, "&f紫色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack JC_BLUE_PIGMENT = new SlimefunItemStack("JC_BLUE_PIGMENT", Material.BLUE_DYE, "&f蓝色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack JC_BROWN_PIGMENT = new SlimefunItemStack("JC_BROWN_PIGMENT", Material.BROWN_DYE, "&f棕色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack JC_GREEN_PIGMENT = new SlimefunItemStack("JC_GREEN_PIGMENT", Material.GREEN_DYE, "&d绿色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack JC_RED_PIGMENT = new SlimefunItemStack("JC_RED_PIGMENT", Material.RED_DYE, "&d红色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack JC_BLACK_PIGMENT = new SlimefunItemStack("JC_BLACK_PIGMENT", Material.BLACK_DYE, "&f黑色染料", "", "&f一个能重复使用的染料", "");
    //Dyeable Blocks
    public static final SlimefunItemStack JC_DYEABLE_WOOL = new SlimefunItemStack("JC_DYEABLE_WOOL", Material.WHITE_WOOL, "&f羊毛",
            "&f 您可以将羊毛染成以下颜色",
            "&6Orange",
            "&dMagenta",
            "&bLight Blue",
            "&eYellow",
            "&aLime",
            "&dPink",
            "&8Gray",
            "&7Light Gray",
            "&3Cyan",
            "&5Purple",
            "&9Blue",
            "&6Brown",
            "&2Green",
            "&4Red",
            "&0Black");
    public static final SlimefunItemStack JC_DYEABLE_CARPET = new SlimefunItemStack("JC_DYEABLE_CARPET", Material.WHITE_CARPET, "&fCARPET",
            "&f 您可以将地毯染成以下颜色",
            "&6Orange",
            "&dMagenta",
            "&bLight Blue",
            "&eYellow",
            "&aLime",
            "&dPink",
            "&8Gray",
            "&7Light Gray",
            "&3Cyan",
            "&5Purple",
            "&9Blue",
            "&6Brown",
            "&2Green",
            "&4Red",
            "&0Black");
    public static final SlimefunItemStack JC_DYEABLE_CANDLES = new SlimefunItemStack("JC_DYEABLE_CANDLES", Material.CANDLE, "&fCandles",
            "&f 您可以将蜡烛染成以下颜色",
            "&fWhite",
            "&6Orange",
            "&dMagenta",
            "&bLight Blue",
            "&eYellow",
            "&aLime",
            "&dPink",
            "&8Gray",
            "&7Light Gray",
            "&3Cyan",
            "&5Purple",
            "&9Blue",
            "&6Brown",
            "&2Green",
            "&4Red",
            "&0Black");
    public static final SlimefunItemStack JC_DYEABLE_GLASS = new SlimefunItemStack("JC_DYEABLE_GLASS", Material.GLASS, "&fGlass",
            "&f 您可以将玻璃染成以下颜色",
            "&fWhite",
            "&6Orange",
            "&dMagenta",
            "&bLight Blue",
            "&eYellow",
            "&aLime",
            "&dPink",
            "&8Gray",
            "&7Light Gray",
            "&3Cyan",
            "&5Purple",
            "&9Blue",
            "&6Brown",
            "&2Green",
            "&4Red",
            "&0Black");
    public static final SlimefunItemStack JC_DYEABLE_GLASS_PANES = new SlimefunItemStack("JC_DYEABLE_GLASS_PANES", Material.GLASS_PANE, "&fGlass pane",
            "&f 您可以将玻璃板染成以下颜色",
            "&fWhite",
            "&6Orange",
            "&dMagenta",
            "&bLight Blue",
            "&eYellow",
            "&aLime",
            "&dPink",
            "&8Gray",
            "&7Light Gray",
            "&3Cyan",
            "&5Purple",
            "&9Blue",
            "&6Brown",
            "&2Green",
            "&4Red",
            "&0Black");
    public static final SlimefunItemStack JC_DYEABLE_TERRACOTTA = new SlimefunItemStack("JC_DYEABLE_TERRACOTTA", Material.TERRACOTTA, "&fTerracotta",
            "&f 您可以将兵马俑染成以下颜色",
            "&fWhite",
            "&6Orange",
            "&dMagenta",
            "&bLight Blue",
            "&eYellow",
            "&aLime",
            "&dPink",
            "&8Gray",
            "&7Light Gray",
            "&3Cyan",
            "&5Purple",
            "&9Blue",
            "&6Brown",
            "&2Green",
            "&4Red",
            "&0Black");
    public static final SlimefunItemStack JC_DYEABLE_GLAZED_TERRACOTTA = new SlimefunItemStack("JC_DYEABLE_GLAZED_TERRACOTTA", Material.WHITE_GLAZED_TERRACOTTA, "&fGlazed Terracotta",
            "&f 您可以将釉面陶土染成以下颜色",
            "&6Orange",
            "&dMagenta",
            "&bLight Blue",
            "&eYellow",
            "&aLime",
            "&dPink",
            "&8Gray",
            "&7Light Gray",
            "&3Cyan",
            "&5Purple",
            "&9Blue",
            "&6Brown",
            "&2Green",
            "&4Red",
            "&0Black");
    public static final SlimefunItemStack JC_DYEABLE_SHULKER_BOXES = new SlimefunItemStack("JC_DYEABLE_SHULKER_BOXES", Material.SHULKER_BOX, "&fShulker Box",
            "&f 你可以将潜影盒染成以下颜色",
            "&fWhite",
            "&6Orange",
            "&dMagenta",
            "&bLight Blue",
            "&eYellow",
            "&aLime",
            "&dPink",
            "&8Gray",
            "&7Light Gray",
            "&3Cyan",
            "&5Purple",
            "&9Blue",
            "&6Brown",
            "&2Green",
            "&4Red",
            "&0Black");
    public static final SlimefunItemStack JC_DYEABLE_CONCRETE_POWDER = new SlimefunItemStack("JC_DYEABLE_CONCRETE_POWDER", Material.WHITE_CONCRETE_POWDER, "&fConcrete Powder",
            "&f 您可以将混凝土粉末染成以下颜色",
            "&6Orange",
            "&dMagenta",
            "&bLight Blue",
            "&eYellow",
            "&aLime",
            "&dPink",
            "&8Gray",
            "&7Light Gray",
            "&3Cyan",
            "&5Purple",
            "&9Blue",
            "&6Brown",
            "&2Green",
            "&4Red",
            "&0Black");
    public static final SlimefunItemStack JC_DYEABLE_CONCRETE = new SlimefunItemStack("JC_DYEABLE_CONCRETE", Material.WHITE_CONCRETE, "&fConcrete",
            "&f 您可以将混凝土染成以下颜色",
            "&6Orange",
            "&dMagenta",
            "&bLight Blue",
            "&eYellow",
            "&aLime",
            "&dPink",
            "&8Gray",
            "&7Light Gray",
            "&3Cyan",
            "&5Purple",
            "&9Blue",
            "&6Brown",
            "&2Green",
            "&4Red",
            "&0Black");
    public static final SlimefunItemStack JC_DYEABLE_BEDS = new SlimefunItemStack("JC_DYEABLE_BEDS", Material.WHITE_BED, "&fBeds",
            "&f 您可以将床染成以下颜色",
            "&6Orange",
            "&dMagenta",
            "&bLight Blue",
            "&eYellow",
            "&aLime",
            "&dPink",
            "&8Gray",
            "&7Light Gray",
            "&3Cyan",
            "&5Purple",
            "&9Blue",
            "&6Brown",
            "&2Green",
            "&4Red",
            "&0Black");
}

