import java.util.*;

public class brainsPhotosCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int flag = 0;
        HashSet<Character> set = new HashSet<>();
        set.add('C');
        set.add('M');
        set.add('Y');
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char ch = in.next().charAt(0);
                if (set.contains(ch))
                    flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("#Color");
        } else {
            System.out.println("#Black&White");
        }
    }
}
