import java.util.Scanner;

public class TipCalculator {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in); //create the scanner

        //prompting the user for the inputs
        System.out.println("Input the total bill cost: ");
        double bill = scan.nextDouble();
        System.out.println("Input the number of people in the party: ");
        int people = scan.nextInt();
        System.out.println("Tip percentage(do not use percent symbol): ");
        double tip = scan.nextDouble();
        double tipDecimal = tip/100; //making it into a decimal to multiply bill by

        //performing calculations on user inputs
        double totalTip = tipDecimal * bill;
        double totalBill = totalTip + bill;
        double tipPerPerson = totalTip/people;
        double totalPerPerson = totalBill/people;

        //producing output to user. Also, rounding all numbers to 2 decimal places
        System.out.println("The total bill is $" + String.format("%.2f", totalBill));
        System.out.println("The total tip is $" + String.format("%.2f", totalTip));
        System.out.println("The tip per person is $" + String.format("%.2f", tipPerPerson));
        System.out.println("The total per person is $" + String.format("%.2f", totalPerPerson));

    }
}
