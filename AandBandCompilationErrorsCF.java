// Day 87
// https://codeforces.com/problemset/problem/519/B
// 519 B. A and B and Compilation Errors  

import java.util.*;

public class AandBandCompilationErrorsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] sum = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n - i; j++)
                sum[i] += in.nextInt();
            if (i > 0)
                System.out.println(sum[i - 1] - sum[i]);
        }
    }
}
