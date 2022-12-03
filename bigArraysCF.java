// Day 79
// https://codeforces.com/problemset/problem/1529/A
// 1529 A. Eshaq loves Big Arrays

import java.util.*;

public class bigArraysCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > arr[0])
                    count++;
            }
            System.out.println(count);
        }
        in.close();
    }
}
