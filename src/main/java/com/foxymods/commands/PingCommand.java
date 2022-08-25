package com.foxymods.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.TextComponent;

import static org.openjdk.nashorn.internal.objects.NativeRegExp.source;

public class PingCommand {
    public PingCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("ping").executes((command) -> {
            return 0;
        }));
    }

    static int ping(CommandSource source) throws CommandSyntaxException {

        source (new TextComponent("pong"));
            return 1;
            }
}
