import java.util.*;
public class llpsCF{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        int count = 0;
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == ch[ch.length-1])
            count++;
        }
        for(int i = 0; i < count; i++)
        System.out.print(ch[ch.length-1]);
        in.close();
    }
}