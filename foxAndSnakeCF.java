import java.util.*;
public class foxAndSnakeCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 4 == 2){
                for(int j = 1; j < m; j++){
                    System.out.print(".");
                }
                System.out.print("#");
            }
            else if(i % 4 == 0){
                System.out.print("#");
                for(int j = 1; j < m; j++){
                    System.out.print(".");
                }
            }
            else{
                for(int j = 1; j <= m; j++){
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
