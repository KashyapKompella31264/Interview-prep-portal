import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Added this line
        int[] ans = new int[4];
        
        for (int i = 0; i < 4; i++) {
            ans[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += ans[i];
        }

        System.out.println(sum);
        sc.close();  // Optional: Good practice to close the scanner
    }
}
