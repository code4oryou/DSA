import java.util.*;
public class divideItCF{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            long n = in.nextLong();
            int ans = 0;
           while (n%5==0){
               n/=5;
               ans+=3;
           }
            while (n%3==0){
                n/=3;
                ans+=2;
            }
            while (n%2==0){
                n/=2;
                ans+=1;
            }
            if(n==1)
                System.out.println(ans);
            else
                System.out.println(-1);
        }


    }
        
}