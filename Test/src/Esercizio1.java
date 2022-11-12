import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double num1, num2, somma, sott, molt, div;
		String operazione; /*variabile derivata da classe string scritta sopra*/
	
		
		Scanner input;
		input =new Scanner(System.in); /*viene creato l'oggetto input di tipo scanner con tutti i suoi metodi*/
		
		System.out.println("inserisci un numero");
		num1=Double.parseDouble(input.nextLine());	
		
		System.out.println("inserisci un altro numero");
		num2=Double.parseDouble(input.nextLine());
		
		System.out.println("scegli l'operazione");
		operazione=input.nextLine();
		
		somma = num1+num2;
		sott = num1 - num2;
		molt = num1 * num2;
		div = num1 / num2;
		
		if(operazione.equals("somma")) {
			
			System.out.println("la somma dei numeri e': " + somma);
			
		}else if(operazione.equals("sottrazione")){
			
			System.out.println("la sottrazione dei numeri e': " + sott);
			
		}else if(operazione.equals("moltiplicazione")){
			
			System.out.println("la moltiplicazione dei numeri e': " + molt);
			
		}else if(operazione.equals("divisione")){
			
			System.out.println("la divisione dei numeri e': " + div);
			
		}else{
			System.out.println("non hai scelto un' operazione valida");
		};
		
		
		/*switch(operazione) {
		case "somma": System.out.println("la somma dei numeri e':" + somma);
		break;
		case "sottrazione": System.out.println("la somma dei numeri e':" + somma);
		break;
		case "moltiplicazione": System.out.println("la somma dei numeri e':" + somma);
		break;
		case "divisione" : System.out.println("la somma dei numeri e':" + somma);
		break;
		}*/
		
		
		
		
		
	}

}
