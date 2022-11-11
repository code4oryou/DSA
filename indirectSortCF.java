import java.util.*;

public class indirectSortCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();

            }
            if (arr[0] == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        in.close();
    }
}
