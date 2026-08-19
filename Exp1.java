import java.util.Scanner;

class StreamingSubscription {
    // Data members
    String customerName;
    String planName;
    double monthlyPrice;
    int months;

    // Constructor
    StreamingSubscription(String customerName, String planName,
                          double monthlyPrice, int months) {
        this.customerName = customerName;
        this.planName = planName;
        this.monthlyPrice = monthlyPrice;
        this.months = months;
    }

    // Method to calculate total bill
    double calculateBill() {
        return monthlyPrice * months;
    }

    // Method to display bill
    void displayBill() {
        System.out.println("\n===== STREAMING SUBSCRIPTION BILL =====");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Plan          : " + planName);
        System.out.println("Monthly Price : ₹" + monthlyPrice);
        System.out.println("Months        : " + months);
        System.out.println("---------------------------------------");
        System.out.println("Total Bill    : ₹" + calculateBill());
        System.out.println("=======================================");
    }
}

public class Exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter plan name: ");
        String plan = sc.nextLine();

        System.out.print("Enter monthly subscription price: ₹");
        double price = sc.nextDouble();

        System.out.print("Enter number of months: ");
        int months = sc.nextInt();

        // Creating an object
        StreamingSubscription subscription =
            new StreamingSubscription(name, plan, price, months);

        // Generate and display bill
        subscription.displayBill();

        sc.close();
    }
}
