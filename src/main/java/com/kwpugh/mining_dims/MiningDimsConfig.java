package com.kwpugh.mining_dims;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.serializer.PartitioningSerializer;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;

@Config(name = "mining_dims")
public class MiningDimsConfig extends PartitioningSerializer.GlobalData
{

    public General GENERAL = new General();


    @Config(name = "general")
    public static class General implements ConfigData {
        @Comment("\n"
                + "\n"
                + "***********************"
                + "\nDimensions"
                + "\n***********************")
        public boolean enableMining = true;
        public boolean enableHunting = true;
        public boolean enableCaving = true;
        public boolean enableNethering = true;
    }
}