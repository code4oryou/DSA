// Day 126
// https://codeforces.com/problemset/problem/688/B
// 688 B. Lovely Palindrom

import java.util.*;

public class lovelyPalindromesCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(s + sb.toString());
    }
}
