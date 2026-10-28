import java.util.Scanner;

public class task202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        
        int totalSum = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int result = i * j;
                System.out.printf("%4d", result);
                totalSum += result;
            }
            System.out.println();
        }
        
        System.out.println("Total of all numbers: " + totalSum);
        sc.close();
    }
}