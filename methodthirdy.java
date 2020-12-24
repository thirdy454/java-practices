
public class methodthirdy {
	static String name;
	public static void main(String[] args) {
		name="thirdys";
		myMethod();	
		myMethod();		
		myMethod();		
		myMethod2("alex");	
		myMethod2("novem");
		System.out.println(myMethod3());
		
	}
	
	//creating method
	public static void myMethod() {
		System.out.println("hello world");
	}
	
	public static void myMethod2(String name) {
		
		System.out.println("hello: " + name);
	}
	
	public static String  myMethod3() {
		System.out.println("caled by method 4: ");
		return name;
	}
}
