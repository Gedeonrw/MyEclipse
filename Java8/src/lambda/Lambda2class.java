package lambda;

public class Lambda2class{
	public static void main(String[] args) {
		//Lamda2 lmd = () -> System.out.println("Hello"); lets add a parameter in interface
		//Lamda2 lmd = text -> System.out.println(text); //add an other text(parameter) in interface
		
		//Lamda2 lmd = (text1, text2) -> System.out.println(text1 + " + " + text2);
		
		// lets give the interface method return type
		
		
//		Lamda2 lmd = (text1, text2) -> {
//		System.out.println(text1 + " + " + text2);
//		return text1 + " " + text2;
//		};
		
		Lamda2 lmd = (text1, text2) -> {
			System.out.println(text1 + " + " +text2 );
			return text1 + "+" + text2;
		};
		
		String returnLamda = lmd.apply("Helloaa","Hiii");
		System.out.println(returnLamda);
	}
}
