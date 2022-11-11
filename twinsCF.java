import java.util.*;
public class twinsCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int [n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            sum = sum + arr[i];
        }
        sum = sum / 2;
        Arrays.sort(arr);
        int count1 = 0;
        int count2 = 0;
        for(int i = n-1; i > 0; i--){
            count1 = count1 + arr[i];
            if(count1 > sum)
            break;
            else
            count2++;
        }
        System.out.print(count2+1);
        in.close();
    }
}
