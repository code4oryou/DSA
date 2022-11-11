import java.util.*;

public class colourblindnessCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            scanner.nextInt();
            scanner.nextLine();
            String one = scanner.nextLine().replaceAll("G", "B");
            String two = scanner.nextLine().replaceAll("G", "B");
            System.out.println(one.equals(two) ? "YES" : "NO");
        }
    }

}
