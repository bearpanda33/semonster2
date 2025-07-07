package org.example;
import java.util.HashMap;

public class SeMonsterGame {
    private HashMap<String, Player> playerMap;

    SeMonsterGame() {
        this.playerMap = new HashMap<>();
    }

    public void addPlayer(String playerName) {
        this.playerMap.put(playerName, new Player(playerName));
    }

    public void draw(String playerName) {
        Player player = this.playerMap.get(playerName);
        if(player != null){
            System.out.println(player.toString());
        } else {
            System.out.println("Player " + playerName + " not found.");
        }
    }
}