import java.util.*;
public class bearNbigBrotherCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for(int i = 0; i < a+b; i++){
            a = a*3;
            b = b*2;
            if(a > b){
                System.out.print(i+1);
                break;
            }
        }
    }
}
