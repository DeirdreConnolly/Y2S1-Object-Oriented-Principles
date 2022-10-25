public class Car {
	 
	//Attributes
	private int age;
	private String model;
	
	//Constructor
	public Car(int year,int manu, String model) {
		this.age = year - manu;
		this.model = model;
	}
	
	//Setters & Getters	
	public int getAge() {
		return age;
	}

	public void setAge(int year) {
		this.age = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {	
		this.model = model;
	}
	
	public String getState(int age) {
		
		String state = null;
		
		if (1 <= age && age <= 3) {
			state =  "shiney new.";
		}
		else if (4 <= age && age <= 6) {
			state = "slightly worn.";
		}
		else if (7 <= age && age <= 9) {
			state = "past its best.";
		}
		else if (age >= 10) {
			state = "showing signs of age.";
		}
		return state;
		
	}
	
	//Functionality
	public String toString() {
		String myString = "This is a " + this.model + " and it's " + getState(this.age);
		
		return myString;
	}
}
