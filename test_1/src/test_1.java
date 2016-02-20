import javax.swing.JOptionPane;

public class test_1 {

	public static void main(String[] args) {
		Boolean check = true;
		while (true) {

			String produk1 = JOptionPane.showInputDialog("Sleutel n produk1");
			String pryss1 = JOptionPane.showInputDialog("sleutel prys");

			System.out.println(produk1);
			System.out.println(pryss1);

			String produk2 = JOptionPane.showInputDialog("Sleutel n produk2");
			String pryss2 = JOptionPane.showInputDialog("sleutel prys");

			System.out.println(produk2);
			System.out.println(pryss2);

			String produk3 = JOptionPane.showInputDialog("Sleutel n produk3");
			String pryss3 = JOptionPane.showInputDialog("sleutel prys");

			System.out.println(produk3);
			System.out.println(pryss3);

			JOptionPane.showMessageDialog(null, "Produkte " + produk1 + produk2
					+ produk3);
			JOptionPane.showMessageDialog(null, "Pryslys " + pryss1 + pryss2
					+ pryss3);

			double prys1 = Double.parseDouble(pryss1);
			double prys2 = Double.parseDouble(pryss2);
			double prys3 = Double.parseDouble(pryss3);

			double fprice = prys1 + prys2 + prys3;

			System.out.println("Totaal " + fprice);

			JOptionPane.showMessageDialog(null, "Totaal" + fprice);

			String totalin = JOptionPane.showInputDialog("Betaling");

			double totalin1 = Double.parseDouble(totalin);

			double ftotal = totalin1 - fprice;

			System.out.println("kleingeld " + ftotal);

			JOptionPane.showMessageDialog(null, "Jou kleingeld is " + ftotal);

		}

	}

}
