package org.example;

import org.example.Monster;     // ←★ これが必要！

import java.util.Scanner;

public class MonsterTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("SEMonster!");

    System.out.print("モンスターの番号を入力してください（0〜4）: ");
    int number = scanner.nextInt();

    System.out.print("レア度を入力してください（1〜4）: ");
    int rare = scanner.nextInt();

    Monster monster = new Monster(number, rare);
    System.out.println(monster);

    scanner.close();
  }
}


