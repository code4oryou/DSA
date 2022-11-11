import java.util.*;

public class dislikeOfThreesCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int arr[] = new int[1000];
        for (int i = 0, j = 1; i < 1000; j++) {
            if (j % 3 != 0 && j % 10 != 3) {
                arr[i] = j;
                i++;
            }
        }
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            System.out.println(arr[n - 1]);
        }
        in.close();
    }
}
