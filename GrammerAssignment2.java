 /**Grammer Assignment 2 
  *  to prompt the user for five numbers and display the results below 
   **/

   import java.util.Scanner;



   public class GrammerAssignment2 {
   	public static void main(String[]args) {
			/**
			 * This section prints out the answers to the following equations 
			 */
			System.out.println("Display results from table.");
			System.out.println(1 / 2);
			System.out.println(1 % 2);
			System.out.println(1.0 / 2);
			System.out.println(5 + 7 / 2);
			System.out.println("Beat" + ' ' + "Army");
			System.out.println(6 + 13 / 5 - 35 % 3);
			System.out.println(3.5 * (5/4));
			System.out.println((3.5 * 5)/4);
																											
																													int n1, n2, n3, n4, n5, Sum, Average; 
																													Scanner keyboard = new Scanner(System.in);
																																	
	
	/**																												 * This section enters 5 numbers and prints the sum and average. 
		
		**/
																												 		System.out.println("");
																														System.out.println("Enter 5 numbers:");
																														n1 = keyboard.nextInt();
																														n2 = keyboard.nextInt();
																														n3 = keyboard.nextInt();
																														n4 = keyboard.nextInt(); 
																														n5 = keyboard.nextInt();
		  																																																							Sum = n1 + n2 + n3 + n4 + n5;
																																																									Average = Sum/5;
																																																									System.out.println("The sum of the numbers is " + Sum);
																																																									System.out.println("The average of the numbers is " + Average);
																																																											
																																																									/**
																																																									 * This section prints the max and min.
																																																							 		 */
																																																							 		int max;
																																																									max = n1;
																																																									if (n2 > max)																																																							max = n2;
																																																									if (n3 > max)

			max = n3;																									 																																																							if (n4 > max) 
																																																																																					max = n4;
																																																																																				if (n5 > max)
																																																																																					max = n5;																																																							int min;
																																																																																						min = n1;
																																																										if (n2 < min)																																																								min= n2;
																																																																																					if (n3 < min)	
																																																										min = n3;																																																																																																																																											if (n4 < min) 
																																																																																																																			min = n3;
																																																																																																																	if (n5 < min) 	
																																																																																					min = n5;
																																																																																																																															
																																																																																																																System.out.println("The max of the numbers is " + max);
																																																																																																																System.out.println("The min of the numbers is " + min);
																																																																																																																	}}

