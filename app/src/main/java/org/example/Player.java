package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Player {
    String name;
    ArrayList<Monster> monsterDeck = new ArrayList<>();
    int hp = 100;

    // コンストラクタ（デフォルトはランダム生成）
    public Player(String name) {
        this.name = name;
        drawMonsters(8);  // デッキを8体に増やす
    }

    // テスト用：指定したLinkedListでモンスターを設定
    public Player(String name, LinkedList<Monster> predefinedMonsters) {
        this.name = name;
        for (int i = 0; i < 8 && i < predefinedMonsters.size(); i++) {
            this.monsterDeck.add(predefinedMonsters.get(i));
        }
    }

    // ランダムでモンスターを生成してデッキに追加
    public void drawMonsters(int count) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            this.monsterDeck.add(new Monster(rand.nextInt(5), rand.nextInt(5)));
        }
    }

    // デッキサイズを取得（テスト容易化）
    public int getDeckSize() {
        return this.monsterDeck.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deck:" + this.name + " HP:" + this.hp + "\n");
        for (Monster m : this.monsterDeck) {
            sb.append(m.toString()).append("\n");
        }
        return sb.toString();
    }
}
