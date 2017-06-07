package ca.vire.RollinBones;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import java.util.concurrent.ThreadLocalRandom;

public class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Starting up!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Shutting down.");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        int minRoll = 1;
        int maxRoll = 6;

        if (cmd.getName().equalsIgnoreCase("roll")) {
            int value = ThreadLocalRandom.current().nextInt(minRoll, maxRoll + 1);
            sender.sendMessage("You roll a " + value);
        }
        return true;
    }

}
