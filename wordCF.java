import java.util.*;
public class wordCF {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        String s = in.next();
        char ch [] = s.toCharArray();
        int cU = 0, cL = 0;
        for(int i = 0; i < ch.length; i++){
            if(ch[i] >= 'a' && ch[i] <= 'z')
            cL++;
            else if(ch[i] >= 'A' && ch[i] <= 'Z')
            cU++;
        }
        if(cL > cU || cL == cU)
        System.out.print(s.toLowerCase());

        else
        System.out.print(s.toUpperCase());
    }
}
