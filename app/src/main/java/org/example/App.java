package org.example;

public class App {
    public static void main(String[] args) {
        SeMonsterGame game = new SeMonsterGame();
        game.addPlayer("user");
        game.draw("user");
    }
}