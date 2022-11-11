import java.util.*;
public class footballCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if(s.contains("1111111")||s.contains("0000000"))
        System.out.print("YES");
        else 
        System.out.print("NO");
    }
}
