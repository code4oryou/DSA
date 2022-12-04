// Day 80
// https://codeforces.com/problemset/problem/476/A
// 476 A. Draemoon and Stairs

import java.util.*;

public class draemoonAndStairsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a;
        if (m > n) {
            System.out.println("-1");
        } else {
            if (n % 2 == 0) {
                a = n / 2;
            } else {
                a = (n / 2) + 1;
            }
            while (a % m != 0) {
                a++;
            }
            System.out.println(a);
        }
        in.close();
    }
}