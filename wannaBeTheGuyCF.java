import java.util.*;
public class wannaBeTheGuyCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int count = 1;
        int arr[] = new int[205];
        int j = 0;
        for(int i = 0; i < p; i++){
            arr[j] = in.nextInt();
            j++;
        }
        int q = in.nextInt();
        for(int i = 0; i < q; i++){
            arr[j] = in.nextInt();
            j++;
        }
        Arrays.sort(arr, 0, j);

        for(int i = 0; i < j-1; i++){
            if(arr[i] != arr[i+1])
            count++;
        }
        if((count != n) || (p == 0 && q == 0))
        System.out.print("Oh, my keyboard!");
        else
        System.out.print("I become the guy.");
        in.close();
    }
}
