package com.betaworldmenu.betaworldmenu;

import net.minecraft.text.Text;
import net.minecraft.util.math.ColorHelper;

public class Constants {

    public static final Text WORLD_NAME_LABEL = Text.translatable("selectWorld.enterName");
    public static final Text WORLD_DIRECTORY_NAME_LABEL = Text.translatable("betaworldmenu.selectWorld.resultFolder");
    public static final Text GAME_MODE_LABEL = Text.translatable("selectWorld.gameMode");
    public static final Text ALLOW_CHEATS_TEXT = Text.translatable("selectWorld.allowCommands");
    public static final Text SEED_LABEL = Text.translatable("selectWorld.enterSeed");
    public static final Text SEED_INFO_LABEL = Text.translatable("selectWorld.seedInfo");

    public static final Text DIFFICULTY_TEXT = Text.translatable("options.difficulty");
    public static final Text CREATE_NEW_WORLD_TEXT = Text.translatable("selectWorld.create");
    public static final Text CANCEL_TEXT = Text.translatable("gui.cancel");

    public static final int GRAY_COLOR = ColorHelper.Argb.getArgb(0xFF, 0xA0, 0xA0, 0xA0);

    public static final int BUTTON_WIDTH = 200;
    public static final int BUTTON_HEIGHT = 20;

    public static int getTextColor() {
        return GRAY_COLOR;
    }
}
