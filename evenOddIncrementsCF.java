import java.util.*;
public class evenOddIncrementsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        long arr[] = new long[n];
        long even = 0, odd = 0, ans = 0;
        for(int i = 0; i < n; i++){
            arr[i] = in.nextLong();
            if(arr[i] % 2 == 0)
            even++;
            else
            odd++;
            ans = ans + arr[i];
        }
        while(q-- > 0){
            int num = in.nextInt();
            int x = in.nextInt();
            if(num == 0){
                ans += x*even;
                if(x % 2 != 0){
                    odd += even;
                    even = 0;
                }
            }
            if(num == 1){
                ans += x*odd;
                if(x % 2 != 0){
                    even += odd;
                    odd = 0;
                }
            }
            System.out.println(ans);
        }
        in.close();
    }
}
