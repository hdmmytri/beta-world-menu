package com.betaworldmenu.config;

import com.google.gson.Gson;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BetaWorldMenuConfig {
    private static final File CONFIG_PATH = FabricLoader.getInstance().getConfigDir().resolve("betaworldmenu.json").toFile();

    private static BetaWorldMenuConfig instance;
    private static Gson gson;

    public int worldTypeID = 0;

    public void write() {
        try (FileWriter writer = new FileWriter(BetaWorldMenuConfig.CONFIG_PATH)) {
            gson.toJson(this, writer);
        } catch (IOException e) {
            throw new RuntimeException("Could not write BetaWorldMenu config file", e);
        }
    }

    public static BetaWorldMenuConfig get() {
        if (instance == null) {
            gson = new Gson();

            if (!BetaWorldMenuConfig.CONFIG_PATH.exists()) {
                instance = new BetaWorldMenuConfig();
                instance.write();
            } else {
                try (FileReader reader = new FileReader(BetaWorldMenuConfig.CONFIG_PATH)) {
                    instance = gson.fromJson(reader, BetaWorldMenuConfig.class);
                } catch (IOException e) {
                    throw new RuntimeException("Could not read BetaWorldMenu config file", e);
                }
            }
        }

        return instance;
    }
}
