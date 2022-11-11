import java.util.*;

public class choosingTeamsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();

        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (5 - arr[i] >= k)
                c++;
        }
        System.out.println(c / 3);
    }
}
