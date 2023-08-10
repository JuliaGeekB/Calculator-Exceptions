package Model;

import Model.Calculator.InvalidInputException;

public interface iCalculable {
    iCalculable sum(int secondNumber);
    iCalculable subtract(int secondNumber);
    iCalculable multi(int secondNumber);
    iCalculable division(int secondNumber);
    iCalculable calculatePower(int secondNumber) throws InvalidInputException;
    int getResultReal();
    
}