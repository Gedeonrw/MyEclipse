package animals;
public class AnimalFactory {
	public static Animal getAnimalByName(String name) {
		switch (name) {
			case "dog": 
				return new Dog();
			case "dino":
				return new Dinasour();
			case "cat":
				return new Cat();
			default:
				throw new IllegalArgumentException("Unexpected value: " + name);
		}
	}
}
