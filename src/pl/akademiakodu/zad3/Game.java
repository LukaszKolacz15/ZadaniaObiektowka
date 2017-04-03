package pl.akademiakodu.zad3;

import java.util.List;

/**
 * Created by Moody on 2017-03-14.
 */
public class Game {

    private String name;
    private List<Player> playerList;


    public Game(String name, List<Player> playerList) {
        this.name = name;
        this.playerList = playerList;
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

//    Metoda:

    public Player getWinner(){
        int pointLocal = 0;
        Player playerWinner = null;
        for(Player player:playerList){
            if(player.getPoints()>pointLocal){
                pointLocal = player.getPoints();
                playerWinner = player;
            }
        }
        return playerWinner;
    }

}
