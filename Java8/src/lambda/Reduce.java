package lambda;

import java.util.stream.Stream;

public class Reduce {
	//Use the reduce method to produce a single space-separated String
	public static void main(String[] args) {
		Stream strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
		
		Stream<String> result1 = Stream.of("A", "good", "day");
		String results2 = result1.reduce("",(s1, s2) -> s1 + " " + s2);
		
		System.out.println(results2);
		
//		String results = (String)strings.reduce((s1, s2) -> s1 + " " + s2).orElse("");
//		System.out.println(results);
//		
	}

}
