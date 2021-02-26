import animals.AnimalFactory;

public class Main {

	public static void main(String[] args) {
		String[] animalNames = {
				"cat",
				"cat",
				"cat",
				"cat",
				"cat",
				"dino",
				"dog",
		};
		
		
		for(String animalName: animalNames)
			AnimalFactory.getAnimalByName(animalName).feed();
		
	}

}
