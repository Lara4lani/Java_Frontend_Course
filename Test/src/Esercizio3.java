import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3;
		
		
		Scanner input;
		input =new Scanner(System.in);
		
		System.out.println("Scegli il primo numero");
		num1 = input.nextInt();
		
		System.out.println("Scegli il secondo numero");
		num2 = input.nextInt();
		
		System.out.println("Scegli il terzo numero");
		num3 = input.nextInt();
		
		
		if(num1>num2 && num1>num3) {
			System.out.println("Il numero maggiore e' " +num1); 
			
		}else if(num2>num1 && num2>num3) {
			System.out.println("Il numero maggiore e' " +num2);
			
		}else if(num3>num2 && num3>num1){
			System.out.println("Il numero maggiore e' " +num3);
			
		}
		
		
	    if(num1<num2 && num1<num3) {
			System.out.println("Il numero minore e' " +num1);
				
		}else if(num2<num1 && num2<num3) {
			System.out.println("Il numero minore e' " +num2);
				
		}else if(num3>num1 && num3<num2){
			System.out.println("Il numero minore e' " +num3);
		}
			
	
		
		input.close();
		
	}

}
