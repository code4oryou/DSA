import java.util.*;

public class maximumInTableCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[][] = new int[15][15];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    arr[i][j] = 1;
                else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
        }
        System.out.println(arr[n - 1][n - 1]);
        in.close();
    }
}
