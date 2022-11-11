import java.util.*;
public class iqNightCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count1 = 0;
        int count2 = 0;
        int index1 = 0;
        int index2 = 0;
        int num;
        for(int i = 0; i < n; i++){
            num = in.nextInt();
            if(num % 2 == 0){
                count1++;
                index1 = i + 1;
            }
            else{
                count2++;
                index2 = i + 1;
            }
        }
        if(count1 == 1)
        System.out.println(index1);
        else
        System.out.println(index2);
        in.close();
    }
}
