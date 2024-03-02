package Assignments;

public class CalculatorMain {
	
	public static void main(String[] args) {
        
        Calculator cal = new Calculator();

        //int add, subtract, multi, div;
        
        int add = cal.add(55, 11);
        System.out.println("Addition is: " +add );

        int subtract = cal.subtract(55, 11);
        System.out.println("Subtraction is: " + subtract);

        int multi = cal.multiply(55, 11);
        System.out.println("Multiplication is: " + multi);

        int div = cal.divide(55, 11);
        System.out.println("Division is: " + div);
	}

}
