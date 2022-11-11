import java.util.*;
public class stonesAndColorsCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int count = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i))
            count ++;
        }
        System.out.print(count);
    }
}
