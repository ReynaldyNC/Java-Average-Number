import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        AverageNumber();
    }

    static void AverageNumber() {
        double num = 0;
        double total;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Size: ");
            double size = input.nextInt();

            for (int i = 0; i < size; i++) {
                System.out.print("Input: ");
                double numInput = input.nextInt();

                num += numInput;
            }

            total = num / size;

            System.out.println("Result: " + total);
        }
    }
}
