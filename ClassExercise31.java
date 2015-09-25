/** 
* 
* @author Emma Grammer
* This program is for class exercise 3.1 and displays statements using printf.
*/
public class ClassExercise31
{/**
* This is a main method 
* @param args arguments for user input during run java command 
*/
public static void main(String[]args) 
{String myname = "Emma";
char grade = 'A';
int n1;
double n2, n3;
n1 = 9;
n2 = 125000;
n3 = 125.26;	
//	display a string and a character using printf
System.out.printf("My name using printf is %5s ",  myname);
System.out.printf("And i am going an %c in this class. ", grade);
System.out.println("\n");
//	display a decimal integer number using printf
System.out.printf("A decimal integer number using printf: %d", n1);
System.out.println("\n");
//	display a exponential floating point using printf
System.out.printf("An exponential floating point number using printf: %e", n2);
System.out.println("\n");
//	display a floating point number using printf
System.out.printf("A floating point number using printf: %6.2f", n3); 
} 
}

