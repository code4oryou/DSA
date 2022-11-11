import java.util.*;
public class stringTaskCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.next().toLowerCase().replaceAll("[aeiouy]", "");
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length(); i = i + 2){
            sb.insert(i,'.');
        }
        System.out.print(sb);
        }
    }

