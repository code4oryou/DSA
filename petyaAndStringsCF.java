import java.util.*;
public class petyaAndStringsCF {
    public static void main(String args[]){
        Scanner in  = new Scanner(System.in);
        String str1 = in.next().toLowerCase();
        String str2 = in.next().toLowerCase();
        int res = str1.compareTo(str2);
        if(res > 0)
        res = 1;
        else if(res < 0)
        res = -1;
        System.out.print(res);
        in.close();
    }
}
