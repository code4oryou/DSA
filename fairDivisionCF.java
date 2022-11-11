import java.util.*;

public class fairDivisionCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int arr[] = new int[n];
            int a = 0, b = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if (arr[i] == 1)
                    a++;
                else
                    b++;
            }
            if (n % 2 == 0) {
                if (a % 2 == 0 && b % 2 == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else {
                if (a % 2 != 0 && b % 2 != 0 && a != 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }

        in.close();
    }
}
