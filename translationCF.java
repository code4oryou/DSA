import java.util.*;
public class translationCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb = new StringBuilder(t);
        sb.reverse();
        String re = sb.toString();
        String re1 = sb1.toString();
        if(re1.equals(re))
        System.out.print("YES");
        else
        System.out.print("NO");
        in.close();
    }
}
