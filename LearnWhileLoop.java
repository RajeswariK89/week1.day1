package week1.day1;

public class LearnWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int number = 12345;
			int sum = 0;
			while (number !=0) {
			int quo = number/10;
			int remind = number%10;
			sum = sum + remind;
		    number = quo;
			}
			System.out.println("Sum of the digits in number is " + sum);
		

	}

}
