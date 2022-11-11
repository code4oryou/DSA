import java.util.*;
public class immobileKnightCF{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int m = in.nextInt();
            
            if((n == 3 && m == 3) || (n == 2 && m == 3) || (n == 3 && m == 2))
                System.out.println(2 + " " + 2);

            else
                System.out.println(n + " " + m);
        }
        in.close();
    }
}