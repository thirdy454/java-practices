import javax.swing.*;
public class swingjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, sum=0;
		JOptionPane jop = new JOptionPane();
		
		do {
	num = Integer.parseInt(jop.showInputDialog("Type non-zero digit to accept and zero to stop"));
		System.out.println("You entered: " + num);
		sum = sum + num;
		}
		while(num!=0);
		jop.showMessageDialog(null,"Sum is: " + sum);
		System.exit(0);
		
	}

}
