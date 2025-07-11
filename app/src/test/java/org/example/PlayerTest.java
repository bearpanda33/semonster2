package org.example;

import org.junit.Test;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testPlayerDeckSize() {
        Player player = new Player("Test Player");
        assertEquals(8, player.monsterDeck.size());
    }

    @Test
    public void testPlayerToStringContainsHeader() {
        Player player = new Player("Test Player");
        String output = player.toString();
        assertTrue(output.contains("Deck:Test Player HP:100"));
    }

    @Test
    public void testPlayerToStringWithPredefinedMonsters() {
        // ★ テスト用LinkedListを使ってプレイヤー生成
        LinkedList<Monster> mockDeck = new LinkedList<>();
        mockDeck.add(new Monster(0, 0)); // デュラハン:レア度[0]
        mockDeck.add(new Monster(1, 4)); // ドラゴン:レア度[4]
        mockDeck.add(new Monster(0, 0));
        mockDeck.add(new Monster(0, 3));
        mockDeck.add(new Monster(4, 1));
        mockDeck.add(new Monster(2, 2));
        mockDeck.add(new Monster(3, 3));
        mockDeck.add(new Monster(1, 1));

        Player player = new Player("TestUser", mockDeck);
        String output = player.toString();

        // 各モンスターが表示されているかを確認
        assertTrue(output.contains("デュラハン:レア度[0]"));
        assertTrue(output.contains("ドラゴン:レア度[4]"));
        assertTrue(output.contains("スライム:レア度[1]"));
    }
}
