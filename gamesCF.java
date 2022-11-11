import java.util.*;
public class gamesCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int home[] = new int[n];
        int away[] = new int[n];
        for(int i = 0; i < n; i++){
            home[i] = in.nextInt();
            away[i] = in.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(home[i] == away[j])
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}
