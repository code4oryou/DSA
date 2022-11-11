import java.util.*;
public class evenOddsCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = in.nextLong();
        long mid=n/2;
        if(n%2==1)
        mid++;
        if(k<=mid)
        System.out.println((2*k)-1);
        else{
        k-=mid;
        System.out.println(2*k);
        }

    }
}
