import java.util.*;
public class chipsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int walrus = in.nextInt();
        int chips = in.nextInt();
        int temp = 0;
        for(int i = 1; i <= walrus; i++){
            if(chips < i)
            break;
            else{
                chips = chips - i;
                if(i == walrus)
                i = 0;
            }
        }
        System.out.println(chips);
        in.close();
    }
}