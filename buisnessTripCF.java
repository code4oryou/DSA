import java.util.*;
public class buisnessTripCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int arr[] = new int[12];
        int sum = 0;
        for(int i = 0; i < 12; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr, 0, 12);
        if(k == 0){
            System.out.println(0);
        }
        else{
            int j = 12;
            while(j-- > 0){
                sum = sum + arr[j];
                if(sum >= k){
                    break;
                }
            }
            if(sum < k){
                System.out.println(-1);
            }
            else{
                System.out.println(12 - j);
            }
        }
        in.close();
    }
}
