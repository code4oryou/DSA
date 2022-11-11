import java.util.*;
public class boyOrGirlCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        int c = 1;
        for(int i = 1; i < ch.length; i++){
            if(ch[i-1] != ch[i])
            c++;
        }
        if(c % 2 != 0)
        System.out.print("IGNORE HIM!");

        else
        System.out.print("CHAT WITH HER!");
    }
}
