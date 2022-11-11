import java.util.*;
public class keyboardCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        String let = in.next();
        String s = "qwertyuiopasdfghjkl;zxcvbnm,./";
        char ch[] = s.toCharArray();
        String str = "";
        int index;
        for(int i = 0; i < let.length(); i++){
            for(int j = 0; j < s.length(); j++){
                if(let.charAt(i) == ch[j]){
                    index = j;
                    if(c == 'R'){
                        str = str + ch[index - 1];
                    }
                    else if(c == 'L'){
                        str = str + ch[index + 1];
                    }
                }
            }
        }
        System.out.println(str);
        in.close();
    }
}
