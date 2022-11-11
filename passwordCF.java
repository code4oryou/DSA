import java.util.*;
public class passwordCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = in.nextInt();
            }
            int res = 3 * (10 - n) * (9 - n);
            System.out.println(res);
        }
        in.close();
    }
}
