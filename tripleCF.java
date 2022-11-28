// Day 74
// https://codeforces.com/problemset/problem/1669/B
// 1669 B. Triple

import java.util.*;

public class tripleCF {
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
            int temp = -1;
            for (int i = 2; i < n; i++) {
                if (arr[i] == arr[i - 1] && arr[i] == arr[i - 2])
                    temp = arr[i];
            }
            System.out.println(temp);
        }
        in.close();
    }
}
