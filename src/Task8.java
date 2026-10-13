import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        boolean again = true;

        while (again) {

            System.out.printf("%-5s %-5s %-5s %-5s %-5s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            int roll = 1;
            boolean triple = false;

            while (!triple) {

                int d1 = rnd.nextInt(6) + 1;
                int d2 = rnd.nextInt(6) + 1;
                int d3 = rnd.nextInt(6) + 1;

                int sum = d1 + d2 + d3;

                System.out.printf("%-5d %-5d %-5d %-5d %-5d\n", roll, d1, d2, d3, sum);

                if (d1 == d2 && d2 == d3) {
                    triple = true;
                }

                roll++;
            }

            System.out.print("Roll again? (y/n): ");
            String response = in.nextLine();

            if (!response.equalsIgnoreCase("y")) {
                again = false;
            }
        }
    }
}
