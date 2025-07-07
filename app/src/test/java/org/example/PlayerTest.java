package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void testPlayerDeckSize() {
        Player player = new Player("Test Player");
        assertEquals(8, player.monsterDeck.size());
    }

    @Test
    public void testPlayerToString() {
        Player player = new Player("Test Player");
        assertTrue(player.toString().contains("Deck:Test Player HP:100"));
    }
}