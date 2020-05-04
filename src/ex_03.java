import java.util.Locale;
import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		double H, vH, S;
		
		N = sc.nextInt();
		H = sc.nextDouble();
		vH = sc.nextDouble();
		
		S = H * vH;
		
		System.out.println("NUMBER = " + N);
		System.out.printf("SALARY = %.2f%n", S);
		
		
		sc.close();

	}

}
