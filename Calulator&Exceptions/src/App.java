import Model.Calculator;
import Model.iCalculable;
import View.ViewCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        iCalculable calculator = new Calculator(0);
        ViewCalculator view = new ViewCalculator(calculator );
        
        view.run();
    }
}