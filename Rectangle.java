
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		int height;
		int width;
		System.out.print("What is the height of the rectangle?");
		Scanner scanner = new Scanner(System.in);
		// read input from console	
		height = scanner.nextInt();	
		// output to console
		
		System.out.print("What is the width of the rectangle?");
		
		Scanner scanner1 = new Scanner(System.in);
		
		// read input from console
		
		width = scanner1.nextInt();
		
		System.out.println("The perimeter of the rectangle is " + (2*height+2*width));
		
		System.out.println("The area of the rectangle is " +(height*width));
																											}
} 
