import java.util.*;
public class sumOfRoundNumbersCF{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int arr[] = new int[6];
            int count = 0;
            int m = 1;
            for(int i = 1; i < 6; i++){
                arr[i] = n % 10;
                n = n / 10;
                if(arr[i] != 0){
                    count ++;
                }
            }
            System.out.println(count);
            for(int i = 1; i < 6; i++){
                if(arr[i] != 0){
                    System.out.print((arr[i] * m) + " ");
                }
                m = m * 10;
            }
            System.out.println();
        }
        in.close();
    }
}