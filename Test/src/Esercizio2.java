import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input;
		input =new Scanner(System.in);
		
		int num;
		
		System.out.println("Scegli un numero");
		num = input.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Il numero inserito " + num + " e' un numero pari");
		}else {
			System.out.println("Il numero inserito " + num + " e' un numero dispari");
		};
		
		input.close();
	}

}
