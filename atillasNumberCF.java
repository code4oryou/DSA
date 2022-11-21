// Day 68
// https://codeforces.com/contest/1760/problem/B
// 1760 B. Atilla's Favorite Problem

import java.util.*;

public class atillasNumberCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            String s = in.next();
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            char c = ch[ch.length - 1];
            int count = 0;
            for (char chh = 'a'; chh <= c; chh++) {
                count++;
            }
            System.out.println(count);
        }
        in.close();
    }
}
