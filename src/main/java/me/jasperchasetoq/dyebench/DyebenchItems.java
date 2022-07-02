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

public class DyebenchItems {
    private DyebenchItems() {}

    //groups
    public static final NestedItemGroup DB_GENERAL = new NestedItemGroup(new NamespacedKey(DyeBench.getInstance(), "DB_GENERAL"), new CustomItemStack(Material.LOOM, "&b染色科技"));
    public static final SubItemGroup DB_MACHINES = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "DB_MACHINES"), DB_GENERAL, new CustomItemStack(Material.LOOM, "&b机器"));
    public static final SubItemGroup DB_PIGMENTS = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "DB_PIGMENTS"), DB_GENERAL, new CustomItemStack(Material.WHITE_DYE, "&b颜料"));
    public static final SubItemGroup DB_DYEABLE_BLOCKS = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "DB_DYEABLE_BLOCKS"), DB_GENERAL, new CustomItemStack(Material.WHITE_WOOL, "&b可染色方块"));
    public static final SubItemGroup DB_INFO = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "DB_INFO"), DB_GENERAL, new CustomItemStack(Material.BOOK, "&b附属信息"));

    public static final ItemGroup DyeBenchGeneral = new ItemGroup(new NamespacedKey(DyeBench.getInstance(), "DyeBench"),
            new CustomItemStack(Material.LOOM, "&b染色科技"));
    
    //machines
    public static final SlimefunItemStack DB_DYEBENCH = new SlimefunItemStack("DB_DYEBENCH", Material.LOOM, "&e染色器", "&f用染料给物品染色", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(50));
    //Pigments
    public static final SlimefunItemStack DB_WHITE_PIGMENT = new SlimefunItemStack("DB_WHITE_PIGMENT", Material.WHITE_DYE, "&f白色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack DB_ORANGE_PIGMENT = new SlimefunItemStack("DB_ORANGE_PIGMENT", Material.ORANGE_DYE, "&d橙色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack DB_MAGENTA_PIGMENT = new SlimefunItemStack("DB_MAGENTA_PIGMENT", Material.MAGENTA_DYE, "&d品红色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack DB_LIGHT_BLUE_PIGMENT = new SlimefunItemStack("DB_LIGHT_BLUE_PIGMENT", Material.LIGHT_BLUE_DYE, "&d淡蓝色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack DB_YELLOW_PIGMENT = new SlimefunItemStack("DB_YELLOW_PIGMENT", Material.YELLOW_DYE, "&d黄色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack DB_LIME_PIGMENT = new SlimefunItemStack("DB_LIME_PIGMENT", Material.LIME_DYE, "&d黄绿色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack DB_PINK_PIGMENT = new SlimefunItemStack("DB_PINK_PIGMENT", Material.PINK_DYE, "&d粉色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack DB_GRAY_PIGMENT = new SlimefunItemStack("DB_GRAY_PIGMENT", Material.GRAY_DYE, "&d灰色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack DB_LIGHT_GRAY_PIGMENT = new SlimefunItemStack("DB_LIGHT_GRAY_PIGMENT", Material.LIGHT_GRAY_DYE, "&d淡灰色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack DB_CYAN_PIGMENT = new SlimefunItemStack("DB_CYAN_PIGMENT", Material.CYAN_DYE, "&d青色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack DB_PURPLE_PIGMENT = new SlimefunItemStack("DB_PURPLE_PIGMENT", Material.PURPLE_DYE, "&d紫色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack DB_BLUE_PIGMENT = new SlimefunItemStack("DB_BLUE_PIGMENT", Material.BLUE_DYE, "&d蓝色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack DB_BROWN_PIGMENT = new SlimefunItemStack("DB_BROWN_PIGMENT", Material.BROWN_DYE, "&d棕色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack DB_GREEN_PIGMENT = new SlimefunItemStack("DB_GREEN_PIGMENT", Material.GREEN_DYE, "&d绿色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack DB_RED_PIGMENT = new SlimefunItemStack("DB_RED_PIGMENT", Material.RED_DYE, "&d红色染料", "", "&f一个能重复使用的染料", "");
    public static final SlimefunItemStack DB_BLACK_PIGMENT = new SlimefunItemStack("DB_BLACK_PIGMENT", Material.BLACK_DYE, "&d黑色染料", "", "&f一个能重复使用的染料", "");
    //Dyeable Blocks
    public static final SlimefunItemStack DB_DYEABLE_WOOL = new SlimefunItemStack("DB_DYEABLE_WOOL", Material.WHITE_WOOL, "&fWool",
            "&f you can dye wool in the following colors",
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
    public static final SlimefunItemStack DB_DYEABLE_CARPET = new SlimefunItemStack("DB_DYEABLE_CARPET", Material.WHITE_CARPET, "&fCARPET",
            "&f you can dye carpet in the following colors",
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
    public static final SlimefunItemStack DB_DYEABLE_CANDLES = new SlimefunItemStack("DB_DYEABLE_CANDLES", Material.CANDLE, "&fCandles",
            "&f you can dye candles in the following colors",
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
    public static final SlimefunItemStack DB_DYEABLE_GLASS = new SlimefunItemStack("DB_DYEABLE_GLASS", Material.GLASS, "&fGlass",
            "&f you can dye Glass in the following colors",
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
    public static final SlimefunItemStack DB_DYEABLE_GLASS_PANES = new SlimefunItemStack("DB_DYEABLE_GLASS_PANES", Material.GLASS_PANE, "&fGlass pane",
            "&f you can dye Glass panes in the following colors",
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
    public static final SlimefunItemStack DB_DYEABLE_TERRACOTTA = new SlimefunItemStack("DB_DYEABLE_TERRACOTTA", Material.TERRACOTTA, "&fTerracotta",
            "&f you can dye Terracotta in the following colors",
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
    public static final SlimefunItemStack DB_DYEABLE_GLAZED_TERRACOTTA = new SlimefunItemStack("DB_DYEABLE_GLAZED_TERRACOTTA", Material.WHITE_GLAZED_TERRACOTTA, "&fGlazed Terracotta",
            "&f you can dye Glazed terracotta in the following colors",
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
    public static final SlimefunItemStack DB_DYEABLE_SHULKER_BOXES = new SlimefunItemStack("DB_DYEABLE_SHULKER_BOXES", Material.SHULKER_BOX, "&fShulker Box",
            "&f you can dye Shulker boxes in the following colors",
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
    public static final SlimefunItemStack DB_DYEABLE_CONCRETE_POWDER = new SlimefunItemStack("DB_DYEABLE_CONCRETE_POWDER", Material.WHITE_CONCRETE_POWDER, "&fConcrete Powder",
            "&f you can dye Concrete powder in the following colors",
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
    public static final SlimefunItemStack DB_DYEABLE_CONCRETE = new SlimefunItemStack("DB_DYEABLE_CONCRETE", Material.WHITE_CONCRETE, "&fConcrete",
            "&f you can dye Concrete in the following colors",
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
    public static final SlimefunItemStack DB_DYEABLE_BEDS = new SlimefunItemStack("DB_DYEABLE_BEDS", Material.WHITE_BED, "&fBeds",
            "&f you can dye Beds in the following colors",
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
    //addon info
    public static final SlimefunItemStack DB_MC_VERSION = new SlimefunItemStack("DB_MC_VERSION", Material.BOOK, "&fMinecraft版本", "", "&f在1.17x-1.19x版本可运行");
    public static final SlimefunItemStack DB_SF_BUILD = new SlimefunItemStack("DB_SF_BUILD", Material.BOOK, "&f粘液科技版本", "", "&f染色科技被构建于在粘液科技版本: RC-31");
}

