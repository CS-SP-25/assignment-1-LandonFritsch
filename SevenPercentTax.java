/**
 * SevenPercent class implements the SalesTaxBehavior interface and calculates
 * the sales tax for states with a 7% sales tax rate.
 */
public class SevenPercentTax implements SalesTaxBehavior {
    public double compute(double sale) {
        return sale * 0.07;
    }
}
