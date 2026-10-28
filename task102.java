import java.util.Scanner;

public class task102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        
        int totalDigits = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j > 1) {
                    System.out.print(" ");
                }
                System.out.print(j);
                totalDigits++;
            }
            System.out.println();
        }
        
        System.out.println("Total numbers printed: " + totalDigits);
        sc.close();
    }
}