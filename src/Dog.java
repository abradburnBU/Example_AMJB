/**
 * This is a class that models a dog
 * @author abradburn
 *
 */
public class Dog {

	//Instance fields
	private String name;
	private int age;
	
	//constructors
	public Dog() {
		
		name = "null";
		age = 0;
		
	}//end empty-argument constructor
	
	/**
	 * This is the preferred constructor for this object
	 * @param name
	 * @param age
	 */
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}//end preferred constructor
	
	/**
	 * This method returns a string that represent's the dog's bark
	 * @return
	 */
	public String bark() {
		return "Bark, bark, bark! !!!";
	}//end bark
	
	//Getters/Setters/toString

	public String getName() {
		return name;
	}//end getName
	
	public void setName(String name) {
		this.name = name;
	}//end setName
	
	public int getAge() {
		return age;
	}//end getAge
	
	public void setAge(int age) {
		this.age = age;
	}//end setAge


	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}//end toString
	
	
	
	
	
	
	
	
}//end class
