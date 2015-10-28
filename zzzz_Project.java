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

public class zzzz_Project extends Application {
public static void main(String[] args) {
launch(args);
}
@Overridepublic 
void start(Stage primaryStage)  {
String studentUser = "ekg2611";
String studentPass = "student!";
String staffUser = "pfg2611";
String staffPass = "staff!";
String adminUser = "wsg2611";
String adminPass = "admin!";
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
PasswordField pwBox = new PasswordField();grid.add(pwBox, 1, 2);
Button submitBtn = new Button("Submit");
HBox hbBtn = new HBox(10);
hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
hbBtn.getChildren().add(submitBtn);
grid.add(hbBtn, 1, 4);
submitBtn.setOnAction(new EventHandler<ActionEvent>() {
String inputUser = "";
String inputPass = "";
String inputAcct = "";
String[] choices = { "Admin", "Student", "Staff"};
boolean validLogin = false;
boolean validAcct = false;
boolean validStudent = false;
boolean validStaff = false;
boolean validAdmin = false;
@Overridepublic 
void handle(ActionEvent event) {
validLogin = false;
validAcct = false;
validStudent = false;
validStaff = false;
validAdmin = false;
inputUser = userTextField.getText();inputPass = pwBox.getText();
if (studentUser.equals(inputUser)  && studentPass.equals(inputPass)) {
validLogin = true;
validStudent = true;
}
else if (staffUser.equals(inputUser)  && staffPass.equals(inputPass)){
validLogin = true;
validStaff = true;
}
else if (adminUser.equals(inputUser) && adminPass.equals(inputPass)) {
validLogin = true;
validAdmin = true;
}
else {
JOptionPane.showMessageDialog(null, "Invalid Username or password");
validLogin = false;
validAcct = false;
} 
//end of if
if ((!validAcct) && (validLogin)){
do {inputAcct = (String) 
JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]);
switch (inputAcct){case "Admin":
if (validAdmin) {JOptionPane.showMessageDialog(null, "Welcome " + userTextField.getText() + "!");
validAcct = true;
}
break;
case "Student":
if (validStudent) {JOptionPane.showMessageDialog(null, "Welcome " + userTextField.getText() + "!");
validAcct = true;
}
break;
case "Staff":
if (validStaff) {JOptionPane.showMessageDialog(null, "Welcome " + userTextField.getText() + "!");
validAcct = true;
}
break;
default:
JOptionPane.showMessageDialog(null, "Contact Admin");System.out.println("acct " + inputAcct);
validAcct = false;
}
// end switch
}  
//end  dowhile
(!validAcct);
validAcct = false;
}
// end of if
}
});
Scene scene = new Scene(grid, 500, 500);
primaryStage.setScene(scene);
primaryStage.show();
}
}

