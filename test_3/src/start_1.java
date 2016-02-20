import javax.swing.JOptionPane;

//public class Start1
public class start_1 {

	public static void main(String[] args) {
		double fprice = 0;
		double prys1;

		for (int i = 1; i < 3; i++) {

			String produk1 = JOptionPane.showInputDialog("Sleutel n produk1");
			String pryss1 = JOptionPane.showInputDialog("sleutel prys");

			prys1 = Double.parseDouble(pryss1);

			fprice += prys1;
			// fprice = fprice + prys1;

		}

		System.out.println("Totaal " + fprice);

		JOptionPane.showMessageDialog(null, "Totaal" + fprice);

		String totalin = JOptionPane.showInputDialog("Betaling");

		double totalin1 = Double.parseDouble(totalin);

		double ftotal = totalin1 - fprice;

		System.out.println("kleingeld " + ftotal);

		JOptionPane.showMessageDialog(null, "Jou kleingeld is " + ftotal);

	}

}
