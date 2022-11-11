import java.util.*;
public class magnetsCF
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int count = 0;
        for(int i = 1; i < n; i++){
            if(arr[i-1] == arr[i])
            continue;
            else
            count++;
        }
        System.out.print(count+1);
        in.close();
    }
}