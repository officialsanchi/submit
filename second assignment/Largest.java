import java.util.Scanner;
public class Largest{
	public static void main(String [] args ){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter first number : ");
		int number1 = input.nextInt();
		
		System.out.print("Enter second number : ");
		int number2 = input.nextInt();
		
		System.out.print("Enter third number : ");
		int number3 = input.nextInt();
		
		System.out.print("Enter four number : ");
		int number4 = input.nextInt();
		
		System.out.print("Enter five number : ");
		int number5 = input.nextInt();
		
		

		if ( number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5) {
			System.out.println("The greatest number is : "+ number1);
			}
		
		if ( number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5){
			System.out.println("The greatest number is : "+ number2);
			}

		if ( number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5){
			System.out.println("The greatest number is :  "+ number3 );
			}
	
		if ( number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5){
			System.out.println("The greatest number is  : "+ number4);
			}
		if ( number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4){
			System.out.println("The greatest number is : "+ number5);
		 }
			
			
			 if ( number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5 ) {
			System.out.println("The lowest number is : "+ number1);
			}
		
		 	if ( number2 < number1 && number2 < number3 && number2 < number4 && number1 < number5){
			System.out.println("The lowest number is  : "+ number2);
			}

			if  ( number3 < number1 && number3 < number2 && number3 < number4 && number1 < number5){
			System.out.println("The lowest number is : "+ number3);
			}
	
		if ( number4 < number1 && number4 < number2 && number4 < number3 && number1 < number5){
			System.out.print("The lowest number is : "+ number4);
			}
		if (number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4){
		System.out.print("The lowest number is : "+ number5);
 }



		}
	}