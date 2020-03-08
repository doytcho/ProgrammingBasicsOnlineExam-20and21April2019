import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double totalPrice = 0;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            double klientTotalPrice = 0;
            String imput = scan.nextLine();
            while ((!imput.equals("Finish"))) {
                switch (imput) {
                    case "basket":
                        klientTotalPrice += 1.5;
                        counter++;
                        break;
                    case "wreath":
                        klientTotalPrice += 3.8;
                        counter++;
                        break;
                    case "chocolate bunny":
                        klientTotalPrice += 7;
                        counter++;
                        break;
                }
                imput = scan.nextLine();
            }
            if (counter % 2 == 0) {
                klientTotalPrice = klientTotalPrice * 0.8;
            }
            totalPrice = totalPrice + klientTotalPrice;
            System.out.printf("You purchased %d items for %.2f leva.%n", counter, klientTotalPrice);
            counter = 0;
        }
        System.out.printf("Average bill per client is: %.2f leva.", totalPrice / n);
    }
}
