// Day 67
// https://codeforces.com/contest/1760/problem/0
// 1760 A Medium Number

import java.util.*;

public class mediumNumberCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int arr[] = { a, b, c };
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
        in.close();
    }
}
