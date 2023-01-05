// Day 110
// https://codeforces.com/problemset/problem/1692/C
// 1692 C. Wheres the Bishop

import java.util.*;

public class wheresTheBishopCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            char ch[][] = new char[8][8];
            for (int i = 0; i < 8; i++) {
                ch[i] = in.next().toCharArray();
            }
            for (int i = 1; i < 7; i++) {
                for (int j = 1; j < 7; j++) {
                    if (ch[i][j] == '#') {
                        if (ch[i - 1][j - 1] == '#' && ch[i - 1][j + 1] == '#' && ch[i + 1][j - 1] == '#'
                                && ch[i + 1][j + 1] == '#')
                            System.out.println((i + 1) + " " + (j + 1));
                    }
                }
            }
        }
        in.close();
    }
}
