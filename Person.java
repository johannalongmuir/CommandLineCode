public class Person{

  private String name;
  private int height;

  public Person(String name, int height){
	this.name = name;
	this.height = height;
  }

  public String getName(){
	return name;
  }

  public String getHeightMessage(){
	if(height >= 182){
	   return "Woahhhh you are taller than 6 foot!";
	} else {
	   return "I heard you were " + height + "cms tall!";
	}
  }
}
