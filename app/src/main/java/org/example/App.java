package org.example;

public class App {
    public static void main(String[] args) {
        // この行は元のサンプルコードの名残です
        System.out.println(new App().getGreeting());

        Calculate calculate = new Calculate();

        // 課題1で要求されている出力
        int sum_2_3 = calculate.sum(2, 3);
        double ave_2_3 = calculate.average(2, 3);
        System.out.println("Sum of 2 and 3 is " + sum_2_3 + ". Average is " + ave_2_3 + ".");

        int sum_1_10 = calculate.sumOfRange(1, 10);
        double ave_1_10 = calculate.averageOfRange(1, 10);
        System.out.println("Sum of 1 to 10 is " + sum_1_10 + ". Average is " + ave_1_10 + ".");

        int odd_1_10 = calculate.sumOfOdd(1, 10);
        System.out.println("Sum of odd of 1 to 10 is " + odd_1_10 + ".");

        int even_1_10 = calculate.sumOfEven(1, 10);
        System.out.println("Sum of even of 1 to 10 is " + even_1_10 + ".");
    }

    // このメソッドは元のサンプルコードのもので、今回は直接は使いません
    public String getGreeting() {
        return "Hello World!";
    }
}