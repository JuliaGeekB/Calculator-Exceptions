package Model;

public class Calculator implements iCalculable {
    private int firstNumber;
    
    public Calculator(int firstNumber) {
        this.firstNumber = firstNumber;
    }
    
    @Override  // метод не содер;ит исключений
    public iCalculable sum(int secondNumber) {
        firstNumber += secondNumber;
        return this;
    }

    @Override  // метод не содер;ит исключений
    public iCalculable subtract(int secondNumber) {
        firstNumber -= secondNumber;
        return this;
    }

    @Override // метод не содер;ит исключений
    public iCalculable multi(int secondNumber) {
        firstNumber = firstNumber*secondNumber;
        return this;
    }

    @Override
    public iCalculable division(int secondNumber) throws ArithmeticException{
        if(secondNumber==0) throw new ArithmeticException("Divide by zero is not possible");
        firstNumber = firstNumber/secondNumber;
        return this;
    }  
    
    @Override
    public iCalculable calculatePower(int secondNumber) throws InvalidInputException{ 
        if(firstNumber==0) throw new  InvalidInputException("Введено основание числа 0!");
        if(secondNumber<0) throw new  InvalidInputException("Введена отрицательная степень!");
        firstNumber = (int) Math.pow(firstNumber,secondNumber);
        return this;
    }

    @Override
    public int getResultReal() {
        return firstNumber;
    }

    public class InvalidInputException extends Exception{
        public InvalidInputException (String message){
            super(message);
        }
    }


}