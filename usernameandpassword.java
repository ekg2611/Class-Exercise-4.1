import java.util.Scanner;

/**
 *
  * @author Grammer Purpose: Authenticate a user login for Username and Password.

  If username and password is correct then display "Welcome Username!" message.

  Else display "Wrong Username or Password!" message.
   *
    */
    public class usernameandpassword {

    	public static void main(String[] args) {
			String auth_username;
			String auth_password;
			String username;
	  		String password;
												
			auth_username = "ekg2611";
			auth_password = "Sc0R91oN";
			System.out.println("Enter Username:");
			Scanner keyboard = new Scanner(System.in);
			username = keyboard.nextLine();
																													
			System.out.println("Enter Password:");
			password = keyboard.nextLine();
																																			
																																					if (username.equals (auth_username) && (password.equals (auth_password)))	
																																						System.out.println("Welcome "+ username);
																																					else
																																						System.out.println("Wrong Username or Password");
																																													
																																																		
																																																			}

																																																			}
