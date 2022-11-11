import java.util.*;
public class maxminaCF{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int arr[] = new int[n];
            int flag = 0;
            for(int i = 0; i < n; i++){
                arr[i] = in.nextInt();
            }
            for(int j = 0; j < n; j++){
                if(arr[j] == 1){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}