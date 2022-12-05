
// Day 82
// https://codeforces.com/problemset/problem/1486/A
// 1486 A. Shifting Stacks
import java.util.*;

public class shiftingStacksCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            long sum = 0;
            long count = 0;
            int flag = 1;
            for (int i = 0; i < n; i++) {
                al.add(in.nextInt());
            }
            for (int i = 0; i < al.size(); i++) {
                count += i;
                sum += al.get(i);
                if (sum < count) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        in.close();
    }
}
