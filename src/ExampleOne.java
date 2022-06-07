public class ExampleOne {

    public static void main(String[] args){

        // Given in prompt
        int numberOfBoxes = 39;
        double costOfBox = 15.10;

        // Calculate the total price using the original cost
        double totalPrice = numberOfBoxes * costOfBox;

        // Calculate the new rate per 5 boxes
        double discountedPrice = numberOfBoxes / 5 * 50;

        // Print info
        System.out.println("Total Cost: $" + totalPrice);
        System.out.println("Discounted Cost: $" + discountedPrice);

        // Add old moving companies rate for four boxes to the discounted cost
        discountedPrice += costOfBox * 4;

        // Print info
        System.out.println("Final Cost: $" + discountedPrice);

    }

}
