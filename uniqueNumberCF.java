// Day 59
// 1462 C. Unique Number
// https://codeforces.com/problemset/problem/1462/C

import java.util.*;

public class uniqueNumberCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int x = in.nextInt();
            String s = "";
            int k = 9;
            while (x > 0 && k > 0) {
                if (x >= k)
                    s = (char) (k + 48) + s;
                else
                    s = (char) (x + 48) + s;
                x = x - k;
                k--;
            }
            if ((x > 0 && k == 0))
                System.out.println(-1);
            else
                System.out.println(s);
        }
        in.close();
    }
}