/**
 * FourPointFivePercent class implements the SalesTaxBehavior interface and calculates
 * the sales tax for states with a 4.5% sales tax rate.
 */
public class FourPointFivePercentTax implements SalesTaxBehavior {
    public double compute(double sale) {
        return sale * 0.045;
    }
}
