// Day 69
// https://codeforces.com/contest/1733/problem/A
// 1733 A. Consecutive Sum

import java.util.*;

public class consecutiveSumCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int arr[] = new int[k];
            for (int i = 0; i < n; i++) {
                arr[i % k] = Math.max(arr[i % k], in.nextInt());
            }
            long sum = 0;
            for (int i : arr) {
                sum += i;
            }
            System.out.println(sum);
        }
        in.close();
    }
}
