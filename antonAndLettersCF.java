import java.util.*;
public class antonAndLettersCF{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.replace("{","").replace("}", "").replace(",","").replace(" ","");
        int count = 0;
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(s.contains(String.valueOf(ch))){
                count ++;
            }
        }
        System.out.print(count);
        in.close();
    }
}