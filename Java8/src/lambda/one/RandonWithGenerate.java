package lambda.one;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandonWithGenerate {

	public static void main(String[] args) {
//		List<Double> st = Stream.generate(Math::random).limit(10).collect(Collectors.toList());
//		System.out.println(st);
		
		List<Double> at = Stream.generate(Math::random).limit(2).collect(Collectors.toList());
		System.out.println(at);
		
		
//		var ints = Stream.iterate(1, x->x+2).limit(10).collect(Collectors.toList());
//		System.out.println(ints);
		
		var att = Stream.iterate(1, x ->x +3).limit(13).collect(Collectors.toList());
		System.out.println(att);
		
		var ints2 = Stream.iterate(1, x->x+2).skip(4).limit(4).collect(Collectors.toList());
		System.out.println(ints2);
				

	}

}
