// Day 113
// https://codeforces.com/problemset/problem/279/B
// 279 B. Books

import java.util.*;

public class booksCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = sc.nextInt();
        int a[] = new int[n], sum = 0, cnt = 0, ind = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
            if (sum <= t)
                cnt++;
            else {
                sum -= a[ind];
                ind++;
            }

        }
        System.out.println(cnt);
    }
}
