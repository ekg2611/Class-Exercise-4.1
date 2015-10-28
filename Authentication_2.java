
package edu.nvcc.csc200.javax;

import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Authentication_2 extends Application{
public static final int LIMIT = 3;
public static void main(String[] args) {launch(args);}

@Overridepublic

void start(Stage primaryStage)  {

String correctUser = "ekg2611";
String correctPass = "student!";

primaryStage.setTitle("Authentication");

GridPane grid = new GridPane();
grid.setAlignment(Pos.CENTER);
grid.setHgap(10);
grid.setVgap(10);
grid.setPadding(new Insets(25, 25, 25, 25));
Label userName = new Label("User Name:");
grid.add(userName, 0, 1);
TextField userTextField = new TextField();
grid.add(userTextField, 1, 1);
Label pw = new Label("Password:");
grid.add(pw, 0, 2);
PasswordField pwBox = new PasswordField();
grid.add(pwBox, 1, 2);
Button submitBtn = new Button("Submit");
HBox hbBtn = new HBox(10);
hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
hbBtn.getChildren().add(submitBtn);
grid.add(hbBtn, 1, 4);
submitBtn.setOnAction(new EventHandler<ActionEvent>() {
String inputUser = "";
String inputPass = "";
int count = 0;
boolean validLogin = false;

@Overridepublic

void handle(ActionEvent event) {inputUser = userTextField.getText();
inputPass = pwBox.getText();

if (correctUser.equals(inputUser)  && correctPass.equals(inputPass)) {
        JOptionPane.showMessageDialog(null, "Welcome " + userTextField.getText() + "!");
	        validLogin = true;}
		else {
		        validLogin = false;
			        count++;}
				
				if ((!validLogin) && (count >= LIMIT)) {
				        JOptionPane.showMessageDialog(null, "Please contact your administrator to unlock your account!");
					}
					}
					});
					
					Scene scene = new Scene(grid, 500, 500);
					primaryStage.setScene(scene);
					primaryStage.show();
					}
					}
					
