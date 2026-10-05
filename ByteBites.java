public class ByteBites {

    public static void main(String[] args) {
        String customer = "Rahul";
        double orderAmount = 600.00;
        boolean cmritStudent = true;
        int people = 2;

        double discount = 0;
        if (cmritStudent && orderAmount > 500) {   // BUG: requirement says >= 500
            double d = orderAmount * 0.10;          // REVIEW: hardcoded discount + poor name
            discount = d;
        }

        double finalAmount = orderAmount - discount;
        double amountPerPerson = finalAmount / people; // REVIEW: people == 0 can crash

        System.out.println("====================================");
        System.out.println("       BYTEBITES ORDER");
        System.out.println("====================================");
        System.out.println("Customer: " + customer);
        System.out.printf("Order Amount: ₹%.2f%n", orderAmount);
        System.out.println("Student: " + (cmritStudent ? "Yes" : "No"));
        System.out.printf("Discount: ₹%.2f%n", discount);
        System.out.printf("Final Amount: ₹%.2f%n", finalAmount);
        System.out.println("People Sharing: " + people);
        System.out.printf("Amount Per Person: ₹%.2f%n", amountPerPerson);
        System.out.println("====================================");
        System.out.println("Today's order: Debug Burger + Bug-Fix Fries");
    }
}
