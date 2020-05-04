import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y, x, soma;
		
		
		System.out.println("Digite um valor:");
		x = sc.nextInt();
		
		System.out.println("Digite um valor:");
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("A soma de " + x + "+" + y + "= " + soma );
		
		sc.close();
	}

}
