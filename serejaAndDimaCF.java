// Day 113
// https://codeforces.com/problemset/problem/381/A
// 381 A. Sereja and Dima

import java.util.*;

public class serejaAndDimaCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int ser = 0, dim = 0;
        int count = 1;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0, j = n - 1; i <= j;) {
            int max;
            if (a[i] < a[j]) {
                max = a[j];
                j--;
            } else {
                max = a[i];
                i++;
            }
            if (count % 2 == 0)
                dim += max;
            else
                ser += max;
            count++;
        }

        System.out.print(ser + " " + dim);
    }
}
