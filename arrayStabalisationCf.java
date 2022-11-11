import java.util.*;

public class arrayStabalisationCf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int res = Math.min((arr[n - 2] - arr[0]), (arr[n - 1] - arr[1]));
        System.out.println(res);
        in.close();
    }
}
