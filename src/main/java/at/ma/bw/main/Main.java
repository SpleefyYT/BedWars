package at.ma.bw.main;

import net.mysticarmy.api.MysticAPI;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public String red = null;
    public String blue = null;
    public static boolean tplayers = false;

    public void onEnable(){
        System.out.print(MysticAPI.getMysticPrefix() + " Das BedWars Plugin wurde erfolgreich geladen!");
    }


}
