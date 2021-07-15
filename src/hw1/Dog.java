package hw1;

public class Dog extends Animal {
	private String name;

	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public Dog(String ration, String color, int weight) {
		super(ration, color, weight);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", " + super.toString() + "]";
	}

	public String getVoice() {
		return "bark";
	}

	public void eat() {
		System.out.println("I want meat!");
	}

	public void sleep() {
		System.out.println("I want to sleep hrrr");
	}

}
