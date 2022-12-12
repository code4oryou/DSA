// Day 88
// https://codeforces.com/problemset/problem/1543/B
// 1543 B. Customising the Track

import java.util.*;

public class customisingTheTrackCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += in.nextLong();
            }
            System.out.println((sum % n) * (n - sum % n));
        }
        in.close();
    }
}