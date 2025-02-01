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
    public double sumArray(double[] arr) {
        double sum = 0;

        for (double num : arr) {
            sum += num;
        }

        return sum;
    }
    public double mean(double[] arr) {
        return sumArray(arr) / arr.length;
    }

    public double variance(double[] arr) {
        double mean = mean(arr);
        double sum = 0;

        for (double num : arr) {
            sum += Math.pow(num - mean, 2);
        }

        return sum / arr.length;
    }

    public double standardDeviation(double[] arr) {
        return Math.sqrt(variance(arr));
    }
}
