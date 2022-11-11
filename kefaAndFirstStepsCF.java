import java.util.*;
public class kefaAndFirstStepsCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int count  = 1;
        int res = 1;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] <= arr[i + 1]){
                count ++;
                if(count > res)
                res = count;
            }
            else
            count = 1;
        }
        System.out.print(res);
        in.close();
    }
}
