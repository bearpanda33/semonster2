package org.example;

import java.util.HashMap;
import java.util.Map;

public class SeMonsterGame {
    private Map<String, Player> playerMap;

    public SeMonsterGame() {
        this.playerMap = new HashMap<>();
    }

    public void addPlayer(String playerName) {
        this.playerMap.put(playerName, new Player(playerName));
    }

    public void draw(String playerName) {
        Player player = this.playerMap.get(playerName);
        if (player != null) {
            System.out.println(player.toString());
        } else {
            System.out.println("Player " + playerName + " not found.");
        }
    }

    
    // 🔽 テストや確認用にプレイヤーを返す getter（オプション）
    public Player getPlayer(String playerName) {
        return this.playerMap.get(playerName);
    }
}
