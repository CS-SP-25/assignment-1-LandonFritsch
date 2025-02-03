/**
 * State class that contains the name of the state and a method to display the sales tax for that state.
 */
public class State {
    private String state;

    public String getName() {
        return state;
    }

    public void setName(String state) {
        this.state = state;
    }

    public void showTax(double tax) {
        System.out.println("The sales tax for " + state + " is: " + tax);
    }
}