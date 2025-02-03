/**
 * SalesTaxBehavior interface defines the behavior of the sales tax calculation.
 * The compute method calculates the sales tax based on the sale amount.
 */
public interface SalesTaxBehavior {
    double compute(double sale);
}