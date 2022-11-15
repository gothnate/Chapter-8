import java.util.*;
public class PurchaseArray {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        Purchase items[] = new Purchase[5];
        int invoiceNumber;
        double sale;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter invoice number: ");
            invoiceNumber = input.nextInt();

            while (invoiceNumber < 1000 || invoiceNumber > 8000) {
                System.out.print("Invoice number should be between 1000 and 8000");
                System.out.print("Enter invoice number: ");
                invoiceNumber = input.nextInt();
            }

            System.out.print("Enter sale amount: ");
            sale = input.nextDouble();

            while (sale < 00) {
                System.out.print("Sale amount shouldbe greated than $0");
                System.out.print("Enter sale amount: ");
                sale = input.nextDouble();
            }

            items[i] = new Purchase();
            items[i].setInvoiceNumber(invoiceNumber);
            items[i].setSaleAmount(sale);
        }

        input.close();
        System.out.print("---Item Details---");

        for (int i = 0; i < 5; i++) {
            items[i].display();
        }
    }
}