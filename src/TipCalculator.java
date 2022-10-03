import java.util.Scanner;

public class TipCalculator {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the total bill cost: ");
        double bill = scan.nextDouble();
        System.out.println("Input the number of people in the party: ");
        int people = scan.nextInt();
        System.out.println("Tip percentage(do not use percent symbol): ");
        double tip = scan.nextDouble();
        double tipDecimal = tip/100; //making it into a decimal to multiply bill by

        double totalTip = tipDecimal * bill;
        double totalBill = totalTip + bill;
        double tipPerPerson = totalTip/people;
        double totalPerPerson = totalBill/people;

        totalTip = Math.round(totalTip*100)/100.0;
        totalBill = Math.round(totalBill *100)/100.0;
        tipPerPerson = Math.round(tipPerPerson*100)/100.0;
        totalPerPerson = Math.round(totalPerPerson*100)/100.0;

        System.out.println("The total bill is $" + totalBill);
        System.out.println("The total tip is $" + totalTip);
        System.out.println("The tip per person is $" + tipPerPerson);
        System.out.println("The total per person is $" + totalPerPerson);

    }
}
