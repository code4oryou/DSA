import java.util.*;
public class ilyaAndBankAccountCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a, b ;
        if(n >= 0){
            System.out.println(n);
        }
        else{
            a = n / 10;
            b = (n / 100) * 10 + (n % 10);
            int c = Math.max(a, b);
            System.out.println(c);
        }
        in.close();
    }
}
