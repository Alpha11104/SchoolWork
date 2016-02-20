import javax.swing.JOptionPane;

public class Guessing {

	public static void main(String[] args) {

		boolean run = true; // Boolean loop control
		while (run) {

			int raai = 11;
			String getal = JOptionPane
					.showInputDialog("Sleutel getal tussen 1 en 40");
			int get = Integer.parseInt(getal);

			if (get == raai)
				System.out.println(get + " Is die korrekte getal");
			else if (get <= 11)
				System.out.println("+");
			else if (get >= 11)
				System.out.println("-");

			if (get == raai)
				run = false; // loop closing statement

		}

	}

}
