package at.ma.bw.lobby;

import at.ma.bw.main.Main;
import net.mysticarmy.api.MysticAPI;
import net.mysticarmy.api.utils.player.MysticPlayerManager;
import org.bukkit.Bukkit;

public class CheckPlayers {

    public void CheckPlayers(){
        while(!Main.tplayers){
            if(MysticPlayerManager.getOnlinePlayers().size() == 2){
                System.out.print("True");
                Main.tplayers = true;
            }else{
                System.out.print("False");
            }
        }
        System.out.print("Test");
    }

}
