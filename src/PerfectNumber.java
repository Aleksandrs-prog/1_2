import java.io.PrintWriter;
import java.lang.Thread.State;
import java.util.Scanner;
import java.util.Set;

public class PerfectNumber {
	public static String detect(int n) {

		int summa = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				summa += i;
		}
		if (summa == n)
			return "perfect";
		else {
			if (summa < n) {
				return "deficient";
			} else {
				return "abundant";
			}
		}
	}

	/* public static Set<Integer> divisors(int n) {
		return null;
	}

	public static State process(int n) {
		return null;
	} */

	public static void main(String[] args) {

		int a;
		System.out.println("Aleksandrs Olehnovics");
		System.out.println(" ");
		while (true) {
			System.out.print("Enter number: ");

			Scanner scn = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
			try {
				a = scn.nextInt();
				if (a < 0) {
					out.println("error, a<0");
				} else {
					out.println("This number is " + detect(a));
				}
			} catch (Exception e) {
				out.println("input-output error");
			}

			out.flush();
		}
	}
}
