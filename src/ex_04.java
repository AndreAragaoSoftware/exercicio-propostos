import java.util.Locale;
import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int cond1, cond2, quant1, quant2;
		double prec1, prec2, total;

		cond1 = sc.nextInt();
		quant1 = sc.nextInt();
		prec1 = sc.nextDouble();

		cond2 = sc.nextInt();
		quant2 = sc.nextInt();
		prec2 = sc.nextDouble();

		total = quant1 * prec1 + quant2 * prec2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		sc.close();

	}

}
