import java.util.*;

public class consoleApp{

  public static void main (String[] args){
	System.out.println("This is way too fun!");
	Scanner scanner = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = scanner.nextLine();
	System.out.println("How tall are you?");
	int height = scanner.nextInt();
	scanner.nextLine();
	Person person = new Person(name, height);
	System.out.println("Nice to meet you " + person.getName());
	System.out.println(person.getHeightMessage());
	scanner.close();

  } 
}

