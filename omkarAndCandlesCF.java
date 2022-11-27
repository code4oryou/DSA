// Day 73
// https://codeforces.com/problemset/problem/379/A
// 379 A. New Year Candles

import java.util.*;

public class omkarAndCandlesCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int count = 0;
        int temp = 0;
        while (a > 0) {
            count = count + a;
            temp = temp + a;
            a = temp / b;
            temp = temp % b;
        }
        System.out.println(count);
        in.close();
    }
}