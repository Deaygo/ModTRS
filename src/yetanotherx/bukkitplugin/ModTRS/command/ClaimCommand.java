package yetanotherx.bukkitplugin.ModTRS.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import yetanotherx.bukkitplugin.ModTRS.ModTRS;

public class ClaimCommand implements CommandExecutor {

    private ModTRS parent;

    public ClaimCommand(ModTRS parent) {
	this.parent = parent;
    }



    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {

	String[] split = args;
	String joined = CommandHandler.implode(split, " ");
	String commandName = command.getName().toLowerCase();

	return false;

    }

}