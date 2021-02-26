package InterfaceClash;

public interface Interface1 {
	default int myMethod(int x) {
	return x * 2;
	}

}

interface Interface2{
//	default int myMethod(int x) {
//		return 2 * x;
//	public int myMethod(int x);
//	}
	
	static int myMethod(int x) {
		return x * 3;
		}
	}
	

// CASE 1 (WHEN CLASS BODY IS EMPTY WHILE 2 INTERFACES HAVE DEFAULT METHODS THERE COMES AN ERROR)

//class Imp implements Interface1, Interface2{ //when left empty for both interface have same default methods there is an error, we have to 
//                                            //to override the method 
//	public int myMethod(int x) {
//		return x*3;
//	}
	
// Case 2 (when one interface has unimmplemented method we have to override it else is error)
	//class Imp implements Interface1, Interface2{ 
	
// Case 3(when one interface has static method) here static method can not be overriden here..print is 4.

class Imp implements Interface1, Interface2{
	
}
	
