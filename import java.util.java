import java.util.Scanner;

public class TrafficChallan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of vehicles
        System.out.println("Enter the number of vehicles:");
        int N = sc.nextInt();

        // Input last digits of the registration numbers
        System.out.println("Enter the last digits of the registration numbers:");
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        // Input the date
        System.out.println("Enter the date:");
        int D = sc.nextInt();

        // Input the fine amount
        System.out.println("Enter the fine amount (X):");
        int X = sc.nextInt();

        // Calculate the total fine
        int totalFine = 0;
        for (int i = 0; i < N; i++) {
            if ((D % 2 == 0 && a[i] % 2 != 0) || (D % 2 != 0 && a[i] % 2 == 0)) {
                totalFine += X;
            }
        }

        // Output the total fine
        System.out.println("Total fine collected: " + totalFine);
    }
}