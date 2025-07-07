package org.example;

public class Monster {
    String name;
    int rare; // 0:ノーマル, 1:R, 2:SR, 3:SSR, 4:UR

    Monster() {
        this.name = "スライム";
        this.rare = 0;
    }

    @Override
    public String toString() {
        return this.name + ":レア度[" + this.rare + "]";
    }
}