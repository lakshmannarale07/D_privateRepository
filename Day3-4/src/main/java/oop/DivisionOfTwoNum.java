package oop;

public class DivisionOfTwoNum {

    public int division(int num1, int num2) {
        if (num2 > 0 && num1 > 0)
            return num1 / num2;
        return 0;
    }

    public double divideNumbersException(double num1, double num2) {
        if (num2 == 0) throw new ArithmeticException("num2 is 0");
        return num1 / num2; // throw new ArithmeticException()
    }
}

