/*
 * BYTEBITES - CMRIT CAMPUS FOOD DELIVERY
 *
 * BUSINESS REQUIREMENTS
 * ---------------------
 *
 * R1. CMRIT students receive a 10% discount when
 *     the order subtotal is ₹500 or more.
 *
 * R2. Orders below ₹500 do not receive a student discount.
 *
 * R3. Delivery charge is ₹40 for orders below ₹500
 *     and FREE for orders of ₹500 or more.
 *
 * R4. GST is 5% on the amount after discount and delivery.
 *
 * R5. The final bill can be split among multiple people.
 *
 * R6. Number of people must be greater than zero.
 *
 * Example order:
 * Debug Burger + Bug-Fix Fries + Stack Overflow Shake
 */

public class ByteBites {

    public static void main(String[] args) {

        // Customer details
        String customerName = "Rahul";
        boolean cmritStudent = true;
        int people = 2;

        // Order details
        double burgerPrice = 250;
        int burgerQty = 2;

        double friesPrice = 100;
        int friesQty = 1;

        double shakePrice = 80;
        int shakeQty = 1;

        // Calculate item totals
        double burgerTotal = burgerPrice * burgerQty;
        double friesTotal = friesPrice * friesQty;
        double shakeTotal = shakePrice * shakeQty;

        // Calculate subtotal
        double subtotal = burgerTotal + friesTotal + shakeTotal;

        // Student discount
        double discount = 0;

        if (cmritStudent && subtotal > 500) {
            double d = subtotal * 0.10;
            discount = d;
        }

        // Amount after discount
        double discountedAmount = subtotal - discount;

        // Delivery charge
        double delivery = 0;

        if (subtotal < 500) {
            delivery = 40;
        }

        // GST
        double taxableAmount = discountedAmount + delivery;
        double gst = taxableAmount * 0.05;

        // Final bill
        double finalAmount = taxableAmount + gst;

        // Split bill
        double amountPerPerson = finalAmount / people;

        // Display order summary
        System.out.println("==========================================");
        System.out.println("          BYTEBITES ORDER SUMMARY");
        System.out.println("==========================================");

        System.out.println("Customer       : " + customerName);
        System.out.println("CMRIT Student  : " +
                (cmritStudent ? "Yes" : "No"));

        System.out.println("------------------------------------------");

        System.out.printf("Debug Burger           ₹%.2f%n", burgerTotal);
        System.out.printf("Bug-Fix Fries          ₹%.2f%n", friesTotal);
        System.out.printf("Stack Overflow Shake   ₹%.2f%n", shakeTotal);

        System.out.println("------------------------------------------");

        System.out.printf("Subtotal               ₹%.2f%n", subtotal);
        System.out.printf("Student Discount       ₹%.2f%n", discount);
        System.out.printf("Delivery Charge        ₹%.2f%n", delivery);
        System.out.printf("GST                    ₹%.2f%n", gst);

        System.out.println("------------------------------------------");

        System.out.printf("FINAL AMOUNT           ₹%.2f%n", finalAmount);

        System.out.println("------------------------------------------");

        System.out.println("People Sharing         : " + people);
        System.out.printf("Amount Per Person      : ₹%.2f%n",
                amountPerPerson);

        System.out.println("==========================================");
    }
}
