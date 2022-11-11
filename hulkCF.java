import java.util.*;
public class hulkCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1)
            System.out.print("I hate ");
            else
            System.out.print("I love ");
            if(i != n)
            System.out.print("that ");
        }
        System.out.print("it");
        in.close();
    }
}
