import javax.swing.JOptionPane;

public class test_2 {

	public static void main(String[] args) {

		String num1 = JOptionPane.showInputDialog("Sleutel n nommer");

		double numm1 = Double.parseDouble(num1);

		double fnum1 = (numm1 / 10 * 100) + numm1;

		System.out.print(fnum1);

	}

}
