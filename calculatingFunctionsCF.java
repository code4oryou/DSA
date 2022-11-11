import java.util.*;
public class calculatingFunctionsCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        if(n % 2 == 0){
        long r = (n / 2);
        System.out.print(r);
        }

        else if(n % 2 == 1){
            long r = -((n+1)/2);
            System.out.print(r);
        }
    }
}
