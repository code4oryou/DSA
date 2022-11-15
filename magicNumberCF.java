
// Day 60
// 320 A. Magic Numbers
// https://codeforces.com/problemset/problem/320/A
import java.util.*;

public class magicNumberCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s = s.replace("144", " ");
        s = s.replace("14", " ");
        s = s.replace("1", " ");
        s = s.replace(" ", "");
        if (s.length() == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
        in.close();
    }
}
