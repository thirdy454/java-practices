
public class dec11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.print("thirdy world");
		
		int [] numbers = {10,20,30,40,50};
		
		//sample of dimentional two arrays 
		String record[][] = {{"James", "10"}, {"larry", "20"}, {"tom", "30"}};
		System.out.println("record[0][0] + " " + record[0][1]");
		
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print( numbers[i] );
			System.out.print(",");
		}
		System.out.print("\n");
		
		for(int x: numbers) {
		System.out.print(x);
		System.out.print(",");
		}
		
		System.out.print("\n");
		String [] names = {"thirdy","Mhalonnie","reynan","renan","raiden"};
		
		for(String name: names) {
			System.out.print(name);
			System.out.print(",");
		}
		
		
		}
}
