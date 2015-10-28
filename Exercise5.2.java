public class Person {

private String name;
private int age;

public Person(){
	name = "Bill";
	age = 58;
	}

public Person(String newName, int newAge){
	name = newName;
	age = newAge;
	}

public void setName(String newName){
	name = newName;
	}

public void setAge(int newAge){
	if(newAge >= 0)
		age = newAge;
	else{
		System.out.println("ERROR: Age is " + "negative.");
		System.exit(0);
		}
		}

public void setPerson(String newName, int newAge){
	setName(newName);
	setAge(newAge);
	}

public String getName(){
	return name;
	}

public int getAge(){
	return age;
	}

public String toString() {
	return "My name is " + name + " and I am " + age + " years old." ;
	}

public boolean equals(Person otherPerson){
	return(name.equals(otherPerson.name)) && (age == otherPerson.age);
	}

public boolean isOlder(Person otherPerson){
	return(age >(otherPerson.age));
	}

public boolean isYounger(Person otherPerson){
	return(age <(otherPerson.age));
	}
	}

import java.util.Scanner;

public class PersonDriver {

public static void main(String[] args) {
	// TODO Auto-generated method stub

	Person person = new Person();
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter your name");
	String name = keyboard.next();
	person.setName(name);
	System.out.println(person.getName());
	System.out.println("Enter your age");
	int age = keyboard.nextInt();
	person.setAge(age);
	System.out.println(person.getAge());
	System.out.println(person.toString());

//*************************************************
//Create person 2
//*************************************************

	System.out.println(" ");
	System.out.println("Create and set person two's name and age.");
	Person person2 = new Person("Emma", 19);
	System.out.println(person2.toString());
	
//*************************************************
//Create person 3
//*************************************************

	System.out.println(" ");
	System.out.println("Create and set person three's name and age.");
	Person person3 = new Person();
	System.out.println(person3.toString());
	
//*************************************************
//Create person 4
//*************************************************

	System.out.println(" ");
	System.out.println("Create and set person four's name and age.");
	Person person4 = new Person("Emma", 19);
	System.out.println(person4.toString());
	
//************************************************
//Does person 2 have the same name as person 4
//************************************************

	System.out.println("");
	System.out.println("Does person 2 have the same name and age as person 4? Useing the equals method.");
	if(person2.getName().equals(person4.getName()))
		System.out.println("Person 2: " + person2.getName() + " and Person 4: " + person4.getName() + " have the same name and age.");
	else
		System.out.println("Person 2: " + person2.getName() + " and Person 4: " + person4.getName() + "  do not have the same name and age.");
		
//************************************************
//Does person 3 have the same name as person 4
//************************************************

	System.out.println("");
	System.out.println("Does person 3 have the same name and age as person 4? Useing the equals method.");
	if(person3.getName().equals(person4.getName()))
		System.out.println("Person 3: " + person3.getName() + " and Person 4: " + person4.getName() + " have the same name and age.");
	else
		System.out.println("Person 3: " + person3.getName() + " and Person 4: " + person4.getName() + "  do not have the same name and age.");
		
//************************************************
//Is person 2 older than person 4
//************************************************

	System.out.println("");
	System.out.println("Is person 2 older than person 4? Using the is older method.");
	if(person2.isOlder(person4))
		System.out.println("Person 2 is older than person 4");
	else
		System.out.println("Person 2 is not older than person 4");
		
//************************************************
//Is person 3 older than person 4
//************************************************

	System.out.println("");
	System.out.println("Is person 3 older than person 4? Using the is older method.");
	if(person3.isOlder(person4))
		System.out.println("Person 3 is older than person 4");
	else
		System.out.println("Person 3 is not older than person 4");
		
//************************************************
//Is person 2 younger than person 4
//************************************************		

	System.out.println("");
	System.out.println("Is person 2 older than person 4? Using the is younger method.");
	if(person2.isYounger(person4))
		System.out.println("Person 2 is younger than person 4");
	else
		System.out.println("Person 2 is not younger than person 4");	

//************************************************
//Is person 4 younger than person 3
//************************************************	

	System.out.println("");
	System.out.println("Is person 3 younger than person 4? Using the is younger method.");
	if(person4.isYounger(person3))
		System.out.println("Person 4 is younger than person 3");
	else
		System.out.println("Person 4 is not younger than person 3");
	}
}

