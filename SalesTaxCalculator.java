/**
 * SalesTaxCalculator is a command-line program that computes the sales tax on a sale amount
 * based on the state where the sale is made.
 * The program takes two arguments: the state and the sale amount.
 * The program uses the SalesTaxBehavior interface to calculate the sales tax based on the state.
 * The program then displays the sales tax for the given state and sale amount.
 * If the state is not recognized, the program displays an error message.
 */
public class SalesTaxCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main <state> <amount>");
            System.out.println("Example: java Main California 100.0");
            return;
        }
        String state = args[0];
        double saleAmount = Double.parseDouble(args[1]);
        SalesTaxBehavior taxBehavior;
        switch (state) {
            case "Alaska":
                taxBehavior = new NoTax();
                break;
            case "Indiana":
                taxBehavior = new SevenPercentTax();
                break;
            case "Hawaii":
                taxBehavior = new FourPointFivePercentTax();
                break;
            default:
                System.out.println("Unknown state: " + state);
                return;
        }
        double tax = taxBehavior.compute(saleAmount);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f" + ".", saleAmount, state, tax);
    }
}