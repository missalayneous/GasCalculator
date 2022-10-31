
    import java.util.Scanner;

public class gascalc {
    public static void main (String Args[]) {

        //Create new scanner object
        Scanner input = new Scanner (System.in);

        //Prompt the user for input
        System.out.print("Enter how many miles per gallon your vehicle gets: ");
        //Assign variable to int input
        int mpg = input.nextInt();

        //Prompt the user for a second input
        System.out.print("Please enter the distance in miles from your home to work: ");
        //Assign second variable to second int input
        int miles = input.nextInt();

        //calculate gallons consumed
        double mult = (double)miles / (double)mpg;

        //Display calculation to user
        System.out.print("Your trip to work will consume: " + mult + " gallons of gas!" + "\n" + "\n");

        //Prompt the user for gas price
        System.out.print("Please enter the current cost of gas: $");
        double cost = input.nextDouble();

        //calculate cost of one way trip
        double pog = (double)mult * (double)cost;

        //Display total cost of one way trip
        System.out.print("Your one way trip will cost you: $" + String.format("%.2f", pog)+ "\n");

        //calculate cost of round trip
        double rt = pog * 2;

        //Display total cost of round trip
        System.out.print("A full round trip will cost you: $" + String.format("%.2f", rt));

    }//end main
}//end class
