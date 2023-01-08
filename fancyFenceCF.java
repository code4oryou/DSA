// Day 115
// https://codeforces.com/problemset/problem/270/A
// 270 A. Fancy Fence

import java.util.*;

public class fancyFenceCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            if (360 % (180 - n) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        in.close();
    }
}
