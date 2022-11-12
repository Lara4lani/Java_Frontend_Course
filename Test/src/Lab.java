import java.util.Scanner;

public class Lab {

	//attributo, variabile globale. Tutti i metodi possono accedervi.
	Scanner input = new Scanner(System.in);

	//stampare in console in verticale i valori da 1-10
	//definire (dichiarare) un metodo

	public void contatoreVerticale()
	{
		for (int i = 1; i <= 10 ; i++) 
		{
			System.out.println(i);
		}
	}



	public void contatoreOrizzontale()
	{
		for (int i = 1; i <= 10 ; i++)
		{
			System.out.print(i);

			if(i<10)
				System.out.print( ",");
			else
				System.out.print(".");
		}
	}



	public void contaPari()
	{
		for (int i = 10; i >= 0 ; i--)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}



	public int leggiNumero(String s)
	{

		System.out.println(s);
		return input.nextInt();


	}

	public void somma (int num1, int num2)
	{
		System.out.println("La somma dei numeri inseriti e': " + num1+num2);
	}

	public void totalizzatore()
	{
		int totale= 0;
		int numeri = 0;
		double media = 0;

		do
		{
			totale+= leggiNumero("scegli un numero");
			numeri++;
			media = totale / numeri;
			System.out.println("vuoi vontinuare?  y o n");
		}
		while(input.next().equals("y"));
		System.out.println("la somma dei numeri e' " + totale + " e la media dei numeri e' " + media);

	}

	public String leggiStringa(String s)
	{
		System.out.println(s);
		return input.next();
	}

	public void semaforo(String colore)
	{
		if(colore.equals("verde"))
		{
			System.out.println("VAI!");
		}
		else if(colore.equals("giallo"))
		{
			System.out.println("ATTENZIONE!");
		}
		else if(colore.equals("rosso"))
		{
			System.out.println("STOP!");
		}
		else
		{
			System.out.println("non sei al semaforo");
		}
	}

	public void minMax()
	{
		int numeri= 0;
		int min = 0;
		int max = 0;
		int count = 0;

		do
		{
			numeri = leggiNumero("scegli un numero");
			System.out.println("vuoi continuare?  y o n");
			if(numeri > max)
			{
				max = numeri;
				if(count == 0)
				{
					min=numeri;
				}
				count++;
			}
			else if(numeri < min)
			{
				min = numeri;
			}
		}
		while(input.next().equals("y"));
		System.out.println("il valore massimo e' " + max + " il valore minimo e' " + min );

	}

	public int menu()
	{
		System.out.println("***MENU***");
		System.out.println("1) Contatore Verticale");
		System.out.println("2) Contatore Orizzontale");
		System.out.println("3) Contatore Pari");
		System.out.println("4) Somma");
		System.out.println("5) totalizzatore");
		System.out.println("6) semaforo");
		System.out.println("7) min max");
		System.out.println("0) fine programma");
		int scelta=leggiNumero("fai una scelta");
		return scelta;
	}






}
