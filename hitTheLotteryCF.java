import java.util.*;
public class hitTheLotteryCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = {100,20,10,5,1};
        int res = 0;
        for(int i = 0; i < 5; i++){
            res += n / arr[i];
            n = n % arr[i];
        }
        System.out.println(res);
        in.close();
    }
}
