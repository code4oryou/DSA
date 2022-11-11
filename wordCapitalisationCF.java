import java.util.*;
public class wordCapitalisationCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String ch1 = "";
        char ch[] = s.toCharArray();
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            if(i == 0){
            ch1 = ch1 + s.charAt(i);
            ch1 = ch1.toUpperCase();
            temp = temp + ch1;
            continue;
            }
            temp = temp + ch[i];
        }
        System.out.print(temp);
     in.close();   
    }
}
