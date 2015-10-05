import javax.swing.JOptionPane;
public class ClassExercise36 {

public enum Months {January, February, March, April, May, June, July, August, September, October, November, December}

 public static void main(String[] args) { 

 Months[] choices = { Months.January, Months.February, Months.March, Months.April, Months.May, Months.June, Months.July,

	Months.August, Months.September, Months.October, Months.November, Months.December}; 

											  

	Months input = (Months) JOptionPane.showInputDialog(null,"Select a month from the year.", "Months", 

	JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);

																				 	
	switch(input) {

	case December: case January: case February:

	JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");																										break;
																																			 		

	case March: case April: case May:

																																	 		JOptionPane.showMessageDialog(null, "Happy Spring Days!");

																																		 	break;																												 		

																																			case June: case July: case August:
																																			JOptionPane.showMessageDialog(null, "It's summer time!");

																																			break;

	case September: case October: case November:

																																			JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");

																																																																					break;
																																																																							 		}

																																																																										 		

																																																																					while (input!=null) { 

																																																																				     //Fill in switch case code below to check for account type and return appropriate Welcome message

																																																																					  input = (Months) JOptionPane.showInputDialog(null,"Select a month from the year.", "Months", 

																																																																					  JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);

																																																																																					    	            

																																																																					switch(input) {

																																																																					case December: case January: case February:
																																																																			 		JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");

																																																																																																					 		break;

																																
	case March: case April: case May:

																																																																																																							JOptionPane.showMessageDialog(null, "Happy Spring Days!");

																																																																																																							break;																																																																																																																						 		

																																																																																																					 		case June: case July: case August:

																																																																																																					 		JOptionPane.showMessageDialog(null, "It's summer time!");
																																																																																																							break;

																																			case September: case October: case November:

																																																																																																																																									JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");																																																																			 	break;}}}}
