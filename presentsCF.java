import java.util.*;
public class presentsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n+1];
        for(int i = 1; i <= n; i++){
            int x = in.nextInt();
            arr[x] = i;
        }
        for(int i = 1; i <= n; i++){
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}
