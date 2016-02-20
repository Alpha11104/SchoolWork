import java.util.ArrayList;
import java.util.Scanner;

public class test_1 {

	public static void main(String[] args) {

		boolean run = true;
		int total = 0;

		Scanner input = new Scanner(System.in);
		// int[] list = new int[10000];
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		int number;

		while (run) {
			System.out.print("Add number " + (sum + 1) + ": ");
			number = input.nextInt();

			if (number == -1) {
				run = false;
			} else {
				// list[sum] = number;
				list.add(number);
				sum++;
			}
		}

		for (Integer i : list) {
			total += i;
		}

		/*
		 * for (int i = 0; i < list.size(); i++) { total += list.get(i); }
		 */

		System.out.println("The sum of the integers are: " + total);

		input.close();

	}
}