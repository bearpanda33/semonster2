package org.example;

public class Calculate {

    // 2つの整数の和を返す
    public int sum(int x, int y) {
        return x + y;
    }

    // 2つの整数の平均値を返す
    public double average(int x, int y) {
        return (double)(x + y) / 2.0;
    }

    // 指定された範囲の整数の合計を返す
    public int sumOfRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    // 指定された範囲の整数の平均値を返す
    public double averageOfRange(int start, int end) {
        int sum = sumOfRange(start, end);
        int count = end - start + 1;
        return (double)sum / count;
    }

    // 指定された範囲の奇数の合計を返す
    public int sumOfOdd(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    // 指定された範囲の偶数の合計を返す
    public int sumOfEven(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}