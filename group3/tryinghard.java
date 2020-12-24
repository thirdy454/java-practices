package group3;
import java.util.Scanner;
public class tryinghard {
	public static Scanner thirdyGayares = new Scanner(System.in);
	public static int leni = 0;
	public static int marcos = 0;
	public static int villar = 0;
	public static String vote;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//System.out.println("first line");
		 //he choose vote
		System.out.println("");
		System.out.println("Presidential elections \n candidates");
		System.out.println(" A. Robredo \n B. Marcos \n C. Villar");
		System.out.println("[Type 'V'-vote, 'R'-result, 'Q'-quit]");
		chooseChoices();
	}
	
	public static void chooseChoices() {

		System.out.print("Enter your choice: ");
		char choose = thirdyGayares.next().charAt(0);
		
		
		switch(choose) {
		case 'V':
		case 'v':
			candidatesList();
		
	
		break;
		case 'R':
		case 'r':
			viewresult();
		break;
		
		case 'q':
		case 'Q':
			
		return;
		
		default:
		System.out.println("Invalid Choices");
		}
		
		}

	public static void candidatesList() {
		
		System.out.print("\nEnter your vote: ");
		String candidates = thirdyGayares.next();
		
		if(candidates.equalsIgnoreCase("a")) {
			++leni;
			//leni = leni + 99;
			chooseChoices();
		}
		else if(candidates.equalsIgnoreCase("b")) {
			++marcos;
			//marcos = marcos + 4;
			chooseChoices();
		}
		else if (candidates.equalsIgnoreCase("c")) {
			++villar;
			//villar = villar + 24;
			chooseChoices();
		}
		
	}
	
	public static void viewresult() {
	double totalofvotes = leni + marcos + villar;
	double lenipercentage = leni/totalofvotes * 100;
	double lenipercentages = Math.round(lenipercentage * 100.0)/100.0;
	double marcospercentage = marcos/totalofvotes * 100;
	double marcospercentages = Math.round(marcospercentage * 100.0)/100.0;
	double villarpercentage = villar/totalofvotes * 100;
	double villarpercentages = Math.round(villarpercentage * 100.0)/100.0;
	String winner = " ";
	System.out.println("\n\t\tPRESEDENTIAL ELECTIONS\n\n");
	System.out.println("CANDIDATES\t\tResults\t\t% of Total Votes");
	System.out.println("ROBREDO\t\t\t  " + leni + "\t\t      " + lenipercentages);
	System.out.println("MARCOS\t\t\t  " + marcos + "\t\t      " + marcospercentages);
	System.out.println("VILLAR\t\t\t  " + villar + "\t\t      " + villarpercentages);
	int totalofvotess = (int) totalofvotes;
	System.out.println("\nTOTAL VOTES: " + totalofvotess);
	
	if(leni > marcos && leni > villar) {
		winner = "ROBREDO";
	}
	else if (marcos > leni && marcos > villar) {
		winner = "MARCOS";
	}
	else if (villar > leni && villar > marcos) {
		winner = "VILLAR";
	}
	
	System.out.println("\nAnd the winner is : " + winner);
	}
	

}




/*

float x = 3.05f;
int y = (int) x;
System.out.println(y);

double a = 123.13698;
double roundoff = Math.round(a * 100.0)/100.0;

System.out.println(roundoff);
*/

/* 	int b = 0;
int c = 0;



for (int i=1; i <= 3; i++) {
	System.out.print("Number" + "[" + i + "]" + ": "  );
}

	int total = 0;
		for(int i = 0; i <= c; i++) {
			total += b;
		}
		//to sum
		System.out.println("\nTotal is " + total); */



//summing all elements
//double total = 0;
//for(int i = 0; i < myList.length; i++) {
	//total += myList[i];
//}
//to sum
//System.out.println("Total is " + total);
//Finding the largest element
//double max = myList[0];
//for (int i = 1; i < myList.length; i++ ) {
	//if (myList[i] > max) max = myList[i];
//}
//System.out.println("Max is " + max);



/*//example 1
int a[] = {33,3,4,5};
for(int i=0; i<a.length; i++) {
	System.out.println(a[i]);
}
System.out.println(a[2]);
*/
