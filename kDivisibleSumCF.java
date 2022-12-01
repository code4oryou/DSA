// Day 77
// https://codeforces.com/problemset/problem/1476/A
// 1476 A. K-Divisble Sum

import java.util.*;

public class kDivisibleSumCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            long k = in.nextLong();
            long temp = (n + k - 1) / k;
            k = k * temp;
            System.out.println((k + n - 1) / n);
        }
        in.close();
    }
}
