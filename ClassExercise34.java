import javax.swing.JOptionPane;
public class ClassExercise34
{public static void main(String[] args) 
{int numberPeople, numberPlayers;
int groupSize, teamSize;
numberPeople = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of people"));
if (numberPeople > 10) 
{groupSize = numberPeople/2;
System.out.println(groupSize);}
if (numberPeople > 3 && numberPeople < 10)
{groupSize = numberPeople/3;
System.out.println(groupSize);		}
else if (numberPeople < 3)
System.out.println("The number of people needs to be at least 3");	
numberPlayers = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of players"));
if (numberPlayers > 11 && numberPlayers < 55) 
{teamSize = numberPlayers/ 11;
System.out.println(teamSize);}
else teamSize = 1;System.out.println(teamSize);
}
}
