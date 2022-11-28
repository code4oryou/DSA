// Day 74
// https://codeforces.com/problemset/problem/6/A
// 6 A. Triangle 

import java.util.*;

public class triangleCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        if (arr[0] + arr[1] > arr[2] || arr[2] + arr[1] > arr[3])
            System.out.println("TRIANGLE");
        else if (arr[0] + arr[1] == arr[2] || arr[2] + arr[1] == arr[3])
            System.out.println("SEGMENT");
        else
            System.out.println("IMPOSSIBLE");
        in.close();
    }
}
