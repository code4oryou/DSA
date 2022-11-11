import java.util.*;
public class softDrinkingCF {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n, k, l, c, d, p, nl, np;
    n = in.nextInt();
    k = in.nextInt();
    l = in.nextInt();
    c = in.nextInt();
    d = in.nextInt();
    p = in.nextInt();
    nl = in.nextInt();
    np = in.nextInt();
    
    int res = (Math.min(Math.min((k * l / nl), c * d), p / np)) / n;
    System.out.println(res);
    
   } 
}
