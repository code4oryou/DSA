// Day 73
// https://codeforces.com/problemset/problem/1327/A
// 1327 A. Sum of Odd integers

import java.util.*;

public class sumOfOddIntegersCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            long k = in.nextLong();
            if (n % 2 == k % 2 && n >= k * k)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        in.close();
    }
}
