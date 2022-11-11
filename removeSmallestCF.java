import java.util.*;
public class removeSmallestCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            Double arr[] = new Double[n];
            for(int i = 0; i < n; i++)
                arr[i] = in.nextDouble();            
            Arrays.sort(arr);
            boolean bl = true;
            if(n > 1)
                {
                    for(int i = 0; i < n - 1; i++){
                    if(arr[i+1] - arr[i] > 1)
                    {
                        bl = false;
                        break;
                    }
                    }
                }
            if(bl == true)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        in.close();
    }
}
