import java.util.*;

public class polycarpAndCoinsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int count1 = n / 3;
            int count2 = count1;
            if (n % 3 == 1)
                count1++;
            else if (n % 3 == 2)
                count2++;
            System.out.println(count1 + " " + count2);
        }
        in.close();
    }
}
