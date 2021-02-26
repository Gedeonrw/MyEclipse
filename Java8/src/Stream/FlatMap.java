package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {
		
		List<String> list =
				Arrays.asList ("i", "am", "stupid");
		list.forEach(System.out::print);
//		
//				Stream<Stream<Character>> result
//				=
//				list.stream ()
//				.map(s -> characterStream (s))
//				.collect(Collectors.toList())
//				
//				System.out.println(result);
	}

}
