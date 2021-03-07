package exo11;

public class Person {
	
	String firstName; 
	String lastName;
	Integer age;
	
	
	public Person() {
		
	}

	//Constructor
	public Person(String fisrtName, String lastName, Integer age) {
		this.firstName = fisrtName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	} 
	
	
	
	

	
	
	
	
	

}
