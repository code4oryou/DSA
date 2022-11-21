// Day 67
// https://codeforces.com/contest/1760/problem/C
// 1760 C. Advantage

import java.util.*;

public class advantageCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int s[] = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = in.nextInt();
            }
            int arr[] = new int[s.length];
            for (int i = 0; i < n; i++) {
                arr[i] = s[i];
            }
            Arrays.sort(arr);
            int max = arr[arr.length - 1];
            int scndMax = arr[arr.length - 2];
            int ans[] = new int[n];
            for (int i = 0; i < n; i++) {
                if (max == s[i]) {
                    ans[i] = s[i] - scndMax;
                    System.out.print(ans[i] + " ");
                } else {
                    ans[i] = s[i] - max;
                    System.out.print(ans[i] + " ");
                }
            }
            System.out.println();

        }
        in.close();
    }
}
