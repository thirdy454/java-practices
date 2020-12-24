
public class methodthirdy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		star1();
		star3(5, 6);

	}

	
	public static void star3(int r, int c) {
		for(int x = 1; x<=r; x++) {
			for(int y=1; y<=c; y++) {
				System.out.print("*");
			}
		
			System.out.print("");
	}
	System.out.print("\n");
	}
	
	
	
	public static void star1() {
		for(int x = 1; x<=5; x++) {
			System.out.print("*");
	}
	System.out.print("\n");
	}
}