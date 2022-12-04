// Day 79
// https://codeforces.com/problemset/problem/822/A
// 822 A. Bored With Life

import java.util.*;

public class boredWithLifeCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int min = Math.min(a, b);
        int fact = 1;
        for (int i = 1; i <= min; i++) {
            fact *= i;
        }
        System.out.println(fact);
        in.close();
    }
}
