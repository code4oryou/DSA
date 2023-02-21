// Day 159
// https://codeforces.com/problemset/problem/1691/A
// 1691 A. Beat the Odds 

import java.util.*;

public class beatTheOddsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int even = 0, odd = 0;
            for (int num : arr) {
                if (num % 2 == 0)
                    even++;
                else
                    odd++;
            }
            System.out.println(Math.min(even, odd));
        }
    }
}
