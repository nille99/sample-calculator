/**
 * 
 * Class Calculator. Just a implementation of a simple calculator. 
 * i.e. the four basic operations in arithmetics. The methods
 * take double as parameters and return a double value.
 * 
 * 
 * 
 *@author niklas
 *@version 2.0 
 * 
 **/
public class Calculator {
	
	/**
	 * Add- add two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the addition.
	 * */
	public double add(double firstNumber, double secondNumber){
		return firstNumber+secondNumber;
	}
	
	/**
	 * subtract - subtracts two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the subtraction.
	 * */
	public double subtract(double firstNumber, double secondNumber){
		return firstNumber-secondNumber;
	}
	
	/**
	 * multiply - multiplies two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the multiplication.
	 * */
	public double multiply(double firstNumber, double secondNumber){
		return firstNumber*secondNumber;
	}
	
	/**
	 * divide- divides two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the division.
	 * */
	//public double divide(double firstNumber, double secondNumber){
	//	return firstNumber/secondNumber;
	//}
	
	public double divide(double firstNumber, double secondNumber) {
		double result = firstNumber / secondNumber;
		
		if(secondNumber == 0) {
			
			System.out.println("Division by zero?");
			return -0.123456789;
		}	
		
		return result;
	}
	

}
