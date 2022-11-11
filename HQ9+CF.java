import java.util.*;
public class HQ9CF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if(s.contains("H") || s.contains("Q") || s.contains("9"))
        System.out.print("YES");
        else
        System.out.print("NO");
        in.close();
    }
}
