package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
    @Test
    public void testSummonAndToString() {
        Monster monster = new Monster(3, 0); //デュラハン, レア度0
        assertEquals("デュラハン:レア度[0]", monster.toString());
    }

    @Test
    public void testEvolve() {
        Monster monster = new Monster(2, 3); //ドラゴン, レア度3
        assertEquals("キングドラゴン:レア度[3]", monster.toString());
    }
}