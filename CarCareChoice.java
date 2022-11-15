import java.util.Scanner;
public class CarCareChoice {
    public static void main(String[] args) {

        String selection;
        Scanner input = new Scanner(System.in);

        String array[] = { "oil change", "tire rotation", "battery check", "brake inspection"};
        int[] prices = { 25, 22, 15, 5 };

        System.out.print("Enter selection >> ");
        selection = input.nextLine();
        for (int x = 0; x < prices.length; ++x) {
            if (array[x].equals(selection)) {
                System.out.println(array[x] + " price is $" + prices[x]);
                return;
            }
        }
        System.out.print("Invalid Entry");
     }
}