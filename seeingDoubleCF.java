// Day 71
// https://codeforces.com/contest/1758/problem/A
// 1758 A. Seeing Double

import java.util.*;

public class seeingDoubleCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            String rev = s;
            for (int i = s.length() - 1; i >= 0; i--) {
                rev = rev + s.charAt(i);
            }
            System.out.println(rev);
        }
        in.close();
    }
}
