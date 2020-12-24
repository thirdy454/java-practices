package group3;
import javax.swing.*;
public class Group3_Problem1 {

  public static void main(String[] args) {
    JOptionPane.showInputDialog(
      null,
      "Name",
      "Employee name",
      JOptionPane.INFORMATION_MESSAGE
    );
    char workposition = JOptionPane
      .showInputDialog("<m> Manager \n <s> Supervisor \n <e> Employee")
      .charAt(0);
    int rate = 0;
    switch (workposition) {
      case 'm':
      case 'M':
        rate = 500;
        break;
      case 's':
      case 'S':
        rate = 400;
        break;
      case 'e':
      case 'E':
        rate = 300;
        break;
      default:
        System.out.println("Invalid Input, Please Enter Again");
        return;
    }

    double noofdays = Integer.parseInt(
      JOptionPane.showInputDialog(
        null,
        "Your rate is " + rate + "\nNo. of Days Worked:",
        "Your rate",
        JOptionPane.INFORMATION_MESSAGE
      )
    );

    double gross = rate * noofdays;
    int medicare = 100,  bonus = 0;
    double sss = gross * .10, tax = 0, totaldeduction = 0, netincome = 0;

    //this is the statements for gross
    if (gross >= 8000) {
      bonus = 1000;
    } else if (gross >= 5000) {
      bonus = 750;
    } else if (gross >= 3000) {
      bonus = 500;
    } else if (gross < 3000) {
      bonus = 0;
      tax = 0;
    } else {
      System.out.println("invalid Input of number of days");
    }
    int grossnew = (int) gross;
    System.out.print("Gross: " + grossnew);
 
    System.out.println("\t\t\tBonus: " + bonus);
    System.out.println("Deductions: ");

    if (gross >= 7000) {
      tax = gross * .15;
    } else if (gross >= 4000) {
      tax = gross * .10;
    } else if (gross >= 2000) {
      tax = gross * .05;
    }
    
    int taxnew = (int) tax;
    System.out.println("\ttax: " + taxnew);
    int sssnew = (int) sss;
    System.out.println("\tSSS: " + sssnew);
    System.out.println("\tMedicare: " + medicare);
    //computation of total deduction;
    totaldeduction = tax + sss + medicare;
    int totaldeductionnew = (int) totaldeduction;
    System.out.print("Total Deduction: " + totaldeductionnew);
    System.out.print("\t\t");
    //computation of net income
    netincome = (gross + bonus) - totaldeduction;
    int netincomenew = (int) netincome;
    System.out.println("Net Income: " + netincomenew);
  }
}
