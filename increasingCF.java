import java.util.*;
public class increasingCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int sum = 0;
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            for(int i = 0; i < n - 1; i++){
                if(arr[i] == arr[i + 1]){
                sum = 1;
                break;
                }
                else
                sum = 0;
            }
            if(sum == 0)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        in.close();
    }
}
