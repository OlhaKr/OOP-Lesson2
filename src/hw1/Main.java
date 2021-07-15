package hw1;

public class Main {

	public static void main(String[] args) {

		Veterinarian vet = new Veterinarian("Andrew");
		Cat cat = new Cat("milk", "red", 3);
		Dog dog = new Dog("meat", "meat", 10);

		System.out.println(vet.getName());
		System.out.println(dog.toString());
		System.out.println(cat.toString());
		vet.treatment(dog);

	}

}
