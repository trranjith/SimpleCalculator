package Calculator.SimpleCalculator;

/**
 * Hello world!
 *
 */

public class Calculator 
{
    public double doAdd(double a, double b)
    {
        return a + b;
    }
    public double doSub(double num1, double num2)
    {
        return num1 - num2;
    }
    public double doMul(double num1, double num2)
    {
        return num1 * num2;
    }
    public double doDiv(double num1, double num2) throws Exception
    {
        if(num2 == 0){
        	throw new Exception();
        }
    	return num1 / num2;
    }
    
}
