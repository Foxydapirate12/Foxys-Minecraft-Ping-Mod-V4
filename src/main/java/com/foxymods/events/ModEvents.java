package com.foxymods.events;

import com.foxymods.commands.PingCommand;
import com.foxymods.pingmod.PingMod;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = PingMod.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void onCommandRegister(RegisterCommandsEvent event) {
        new PingCommand(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());
    }

}
