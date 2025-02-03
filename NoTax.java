/**
 * NoTax class implements the SalesTaxBehavior interface and calculates
 * the sales tax for states with no sales tax.
 */
public class NoTax implements SalesTaxBehavior {
    public double compute(double sale) {
        return 0.00;
    }
}
