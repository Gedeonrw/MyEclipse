package lambda;

import java.util.Comparator;

public class Lambda1 {

	
public static void main(String[] args) {
	Comparator<String> comparator = new Comparator<String>() {

			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
	
			
//Comparator<String> comparator = (o1, o2) -> o1.compareTo(o2);
			
			
				
	};
	
	
	//using normal call
	int comparison = comparator.compare("King", "Queen");
	System.out.println(comparison);
	
	
	//using lamda expression
	//Comparator<String> compareWithLambda = //(String o1, String o2) -> {return o1.compareTo(o2); };
	//this one can also be like.. 
	
	Comparator<String> compareWithLambda =(o1,o2) -> o1.compareTo(o2);  //simplified lamda from the above long expresion
	
	int comparisonn = compareWithLambda.compare("john", "jimy");
	System.out.println(comparisonn);
	

}
}