package com.matt.forgehax;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.NetworkManager;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 2 lazy to import static
 */
public interface Globals {
    Logger      LOGGER              = LogManager.getLogger("ForgeHax");
    Minecraft   MC                  = FMLClientHandler.instance().getClient();
}