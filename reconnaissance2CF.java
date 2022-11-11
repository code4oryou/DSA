import java.util.*;

public class reconnaissance2CF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int hold = 0;
        int lastHold = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) < min) {
                min = Math.abs(arr[i] - arr[i + 1]);
                hold = i;
                lastHold = i + 1;
            }
        }
        if (Math.abs(arr[0] - arr[n - 1]) < min) {
            min = Math.abs(arr[0] - arr[n - 1]);
            hold = 0;
            lastHold = n - 1;
        }
        System.out.println((hold + 1) + " " + (lastHold + 1));
        in.close();
    }
}
