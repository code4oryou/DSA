import java.util.*;
public class beautifulYearCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int a, b, c, d;
        while(y > 0){
            y++;
            a=y/1000;
            b=y/100;
            b=b%10;
            c=y/10;
            c=c%10;
            d=y%10;
            if(a!=b && a!=c && a!=d && d!=c && d!=b && c!=b){
                break;
            }
        }
        System.out.print(y);
        in.close();
    }
}
