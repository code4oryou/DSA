import java.util.*;
public class saleCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i < m; i++){
            if(arr[i] < 0){
                sum += arr[i];
            }
        }
        System.out.println(-1*sum);
        in.close();
    }
}
