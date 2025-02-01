public class Calculator {
    public double add(double a, double b) { 
        return a + b; 
    }

    public double subtract(double a, double b) { 
        return a - b; 
    }

    public double multiply(double a, double b) { 
        return a * b; 
    }
    public double divide(double a, double b) { 
        if (b != 0) {
            return a / b ;
        }
        else {
            return Double.NaN ;
        }
    }
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }   
    }
  
