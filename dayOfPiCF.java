// Day 159
// https://codeforces.com/problemset/problem/1790/A
// 1790 A. Polycarp and Day of Pi

import java.util.*;

public class dayOfPiCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String pi = "314159265358979323846264338327";
        while (t-- > 0) {
            String s = in.next();
            int i;
            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) != pi.charAt(i)) {
                    break;
                }
            }
            System.out.println(i);
        }
    }
}
