package group3;
import java.util.Scanner;

public class Voting {
	public static int vpleni, totalleni = 0;
	public static char b, c;
	public static Scanner thirdyGayares = new Scanner(System.in);
	public static void main(String[] args) {
		
		tryGet1();
		
	}

	public static void tryGet1() {

		System.out.println("Presidential elections \n candidates");
		System.out.println(" A. Robredo \n B. Marcos \n C. Villar");
		System.out.println("V-vote, R- result, Q-quit");
		
	
		System.out.print("Enter your choose: ");
		b = thirdyGayares.next().charAt(0);
		
		switch(b) {
		case 'v':
		case 'V':
			
			System.out.print("Enter your vote: ");
			c = thirdyGayares.next().charAt(0);
			
			switch(c) {
			case 'a':
			case 'A':
				tryGet();
				break;
			}
					
		
		
		case 'r':
		case 'R':
			resultView();
			break;
		
		case 'q':
		case 'Q':
			System.out.println("you are quit");
		break;
		default: 
			System.out.println("you choose Invalid");	
			
		}
	}
	
	
	public static void tryGet() {
		int d = (int) c;
		for(int vp=0; vp<=d; vp++) {
			++totalleni;
		}

		 tryGet1();
	}
		
	
	public static void resultView() {
		System.out.println(totalleni);
	}
		
	
	
}	

	
	
	
