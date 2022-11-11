import java.util.Scanner;
public class teamCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for(int i = n; i > 0; i--){
            int temp = 0;
            int x;
            for(int j = 0; j < 3; j++){
                x = in.nextInt();
                temp = temp + x;
            }
            if(temp >= 2)
                count ++;
        }
        System.out.print(count);
    }
}
