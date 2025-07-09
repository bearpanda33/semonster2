package org.example;
import java.util.ArrayList;
import java.util.Random;

public class Player {
    String name;
    ArrayList<Monster> monsterDeck = new ArrayList<>();
    int hp = 100;

    public Player(String name) {
        this.name = name;
        drawMonsters(8); // デッキのモンスターを8体に
    }

    public void drawMonsters(int count) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            this.monsterDeck.add(new Monster(rand.nextInt(5), rand.nextInt(5)));
        }
    }

    
    public String getName() {
        return this.name;
    }

    public int getHP() {
        return this.hp;
    }

    public ArrayList<Monster> getDeck() {
        return this.monsterDeck;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deck:").append(this.name).append(" HP:").append(this.hp).append("\n");
        for (Monster m : this.monsterDeck) {
            sb.append(m.toString()).append("\n");
        }
        return sb.toString();
    }
}