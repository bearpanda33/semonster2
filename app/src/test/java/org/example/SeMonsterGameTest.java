package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SeMonsterGameTest {
    @Test
    public void testAddPlayer() {
        SeMonsterGame game = new SeMonsterGame();
        game.addPlayer("test-player");
        // このテストでは、addPlayer後にdrawを呼び出してもエラーが出ないことを確認する程度とします
        // 本来はコンソール出力をキャプチャするなどの高度なテストが必要です
        try {
            game.draw("test-player");
        } catch (Exception e) {
            fail("draw method should not throw an exception for existing player.");
        }
    }
}