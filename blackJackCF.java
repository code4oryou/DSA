import java.util.*;
public class blackJackCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n <= 10 || n > 21)
        System.out.println(0);
        else if(n == 20)
        System.out.println(15);
        else
        System.out.println(4);
        in.close();
    }
}
