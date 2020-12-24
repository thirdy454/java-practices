import javax.swing.JOptionPane;

public class switchclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char sex = JOptionPane.showInputDialog("Enter sex: ").charAt(1);
		String gender;
		switch(sex) {
		case 'M':
		case 'm': gender = "Male"; break;
		case 'f':
		case 'F': gender = "Female"; break;
		default: gender = "Invalid";
		}
		JOptionPane.showMessageDialog(null,"You are: " + gender);
		
	}

}
