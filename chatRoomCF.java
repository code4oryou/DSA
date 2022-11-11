import java.util.*;
public class chatRoomCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String word = "hello";
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            if(index == word.length())
            break;
            else if(s.charAt(i) == word.charAt(index))
            index++;
        }
        if(index == word.length())
        System.out.print("YES");
        else
        System.out.print("NO");
        in.close();
    }
}
