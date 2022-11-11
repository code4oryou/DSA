import java.util.*;

public class dieRollCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int w = in.nextInt();
        String prob[] = { "", "1/1", "5/6", "2/3", "1/2", "1/3", "1/6" };
        int maxx = Math.max(y, w);
        System.out.println(prob[maxx]);
        in.close();
    }

}