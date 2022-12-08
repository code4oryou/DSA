// Day 84
// https://codeforces.com/problemset/problem/265/A
// 265 A. Colorful Stones

import java.util.*;

public class colorfulStonesCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
        }
        System.out.println(j + 1);
        in.close();
    }
}
