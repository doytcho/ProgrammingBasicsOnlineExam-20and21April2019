import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guests = Integer.parseInt(scan.nextLine());
        double kuvertPrice = Double.parseDouble(scan.nextLine());
        double budjet = Double.parseDouble(scan.nextLine());
        double cakePrice = budjet * 0.1;
        if (guests > 10 && guests <= 15) {
            kuvertPrice = kuvertPrice * 0.85;
        } else if (guests > 15 && guests <= 20) {
            kuvertPrice = kuvertPrice * 0.8;
        }
        if (guests > 20) {
            kuvertPrice = kuvertPrice * 0.75;
        }
        double totalPrice = cakePrice + guests * kuvertPrice;
        if (budjet >= totalPrice) {
            System.out.printf("It is party time! %.2f leva left.", budjet - totalPrice);
        } else {
            System.out.printf("No party! %.2f leva needed.", totalPrice - budjet);
        }
    }
}
