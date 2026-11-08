import java.util.Scanner;

public class Exercise1_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;

        System.out.println("Enter numbers (-1 to stop):");

        while (true) {
            number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            sum = sum + number;
            count++;
        }

        double average = 0;

        if (count > 0) {
            average = (double) sum / count;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}