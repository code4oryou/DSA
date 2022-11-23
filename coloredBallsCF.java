// Day 69
// https://codeforces.com/problemset/problem/1728/A
// 1728 A. Colored Balls

import java.util.*;

public class coloredBallsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int temp = 0;
            for (int i = 0; i < n; i++) {
                if (arr[temp] < arr[i]) {
                    temp = i;
                }
            }
            System.out.println(temp + 1);
        }
        in.close();
    }
}
