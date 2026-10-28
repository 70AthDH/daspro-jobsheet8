import java.util.Scanner;

public class task302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stores: ");
        int numStores = sc.nextInt();
        
        if (numStores < 1) {
            System.out.println("Number of stores must be at least 1.");
        } else {
            int grandTotalItems = 0;
            int maxItems = -1;
            int bestStore = 1;
            
            for (int store = 1; store <= numStores; store++) {
                System.out.print("Enter the number of customers for Store " + store + ": ");
                int numCustomers = sc.nextInt();
                while (numCustomers < 0) {
                    System.out.print("Number of customers cannot be negative. Retry: ");
                    numCustomers = sc.nextInt();
                }
                
                int storeItems = 0;
                
                for (int cust = 1; cust <= numCustomers; cust++) {
                    System.out.print("  Enter items bought by customer " + cust + ": ");
                    int items = sc.nextInt();
                    while (items < 0) {
                        System.out.print("  Number of items cannot be negative. Retry: ");
                        items = sc.nextInt();
                    }
                    storeItems += items;
                }
                
                System.out.println("Store " + store + " customers: " + numCustomers + ", total items: " + storeItems);
                
                grandTotalItems += storeItems;
                
                // Strict inequality ensures that if two stores tie, the one with the smaller store number is kept
                if (storeItems > maxItems) {
                    maxItems = storeItems;
                    bestStore = store;
                }
            }
            
            System.out.println("========================================");
            System.out.println("Total items across all stores: " + grandTotalItems);
            System.out.println("Store with the most items: " + bestStore);
        }
        
        sc.close();
    }
}