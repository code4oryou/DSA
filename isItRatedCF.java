// Day 62
// 807 A. Is it rated?
// https://codeforces.com/problemset/problem/807/A

import java.util.*;

public class isItRatedCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int value = 4127;
        boolean flag1 = false;
        boolean flag2 = false;
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a != b) {
                flag1 = true;
            } else if (value < a) {
                flag2 = true;
            }
            value = a;
        }
        if (flag1)
            System.out.println("rated");
        else if (flag2) {
            System.out.println("unrated");
        } else
            System.out.println("maybe");
    }
}
