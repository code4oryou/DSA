// Day 112
// https://codeforces.com/problemset/problem/43/A
// 43 A. Football

import java.util.*;

public class footbalCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        String s1 = s;
        String s2 = "";
        int s1Count = 1;
        int s2Count = 0;

        for (int i = 1; i < n; i++) {
            s = in.next();
            if (s1.equals(s)) {
                s1Count++;
            } else {
                s2 = s;
                s2Count++;
            }
        }
        if (s1Count > s2Count) {
            System.out.println(s1);
        } else {
            System.out.println(s2);
        }
        in.close();
    }
}
