import java.util.Scanner;

public class Lab {

	//attributo, variabile globale. Tutti i metodi possono accedervi.
	Scanner input = new Scanner(System.in);

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
		int num=0;
		boolean flag;
		do
		{
			flag= false;
			System.out.println(s);
			try 
			{
				num= Integer.parseInt(input.nextLine());
			} 
			catch (NumberFormatException e)
			{
				//System.out.println(e);
				System.out.println("non hai inserito un numero");
				flag=true;
			}
			catch(Exception e)
			{
				
			}
			finally //eseguito sia in caso di eccezione sia no. opzionale.
			{
				
			}
		}while(flag);
	
		return num;
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
		return input.nextLine();
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
	
	public void array()
	{
		int[] array = new int[leggiNumero("Scegli quanti valori inserire")];
		for(int i=0; i<array.length; i++)
		{
			array[i]=leggiNumero("inserisci il " + (i+1) + " numero.");
			//i= indice dell'array, da 0 fino all'ultimo cassetto.
		}

		System.out.println("i numeri inseriti sono:");
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	public int[] inizVet(int celle)
	{
		int[] array = new int[celle];
		for(int i=0; i<array.length; i++)
		{
			array[i]=leggiNumero("inserisci il " + (i+1) + " numero.");
		}
		return array;
	}
	
	public void menuVet()
	{
		System.out.println("1) somma numeri pari");
		System.out.println("2) trova valore massimo");
		System.out.println("3) media dei numeri pari");
		int scelta = leggiNumero("scegli");
		
		if(scelta==1)
		{
			int[] vet = inizVet(leggiNumero("scegli quanti numeri inserire"));
			int somma = sommaPari(vet);
			stampaInfo("La somma dei numeri pari inseriti e' " + somma);
		}
		else if(scelta==2)
		{
			int[] vet = inizVet(leggiNumero("scegli quanti numeri inserire"));
			int max = trovaMax(vet);
			stampaInfo("Tra i numeri inseriti il valore massimo e' " + max);
		}
		else if(scelta==3)
		{
			int[] vet = inizVet(leggiNumero("scegli quanti numeri inserire"));
			 double media = mediaPari(vet);
			 stampaInfo("La media dei numeri pari inseriti e' " + media);
		}
	}

	public int sommaPari(int vet[])
	{
		int somma=0;
		for(int i=0; i<vet.length; i++)
		{
			if(vet[i]%2==0)
			{
				somma+= vet[i];
			}
		}
		return somma;
	}
	
	public int trovaMax(int vet[])
	{
		int max = vet[0]; //il valore nel primo cassetto e' il massimo
		for(int i=1; i<vet.length; i++)
		{
			if(vet[i]>max)
			{
				max = vet[i]; //se i valori dal 2 cassetto in poi sono maggiori del primo allora sono il massimo loro
			}
		}
		return max;
	}
	
	public double mediaPari(int vet[])
	{
		double media=0;
		int tot = 0;
		int count =0;
		for(int i=0; i<vet.length; i++)
		{
			if(vet[i]%2==0)
			{
				tot+=vet[i];
				count++;
			}
			media = tot / count;
		}
		return media;
	}
	
	public void stampaInfo(String s)
	{
		System.out.println(s);
	}
	
	public String[] inizVetString(int celle)
	{
		String[] array = new String[celle];
		for(int i=0; i<array.length; i++)
		{
			array[i]= leggiStringa("Inserisci un nome della "+ (i+1) + " persona");
		}
		return array;
	}
	
	public int trovaNome(String[] array, String parola)
	{
		int count = 0;
		for(int i=0; i<array.length; i++)
		{
			if(array[i].equalsIgnoreCase(parola))
			{
				count++;
			}
		}
			return count;
	}
	
	public void contaConsVoc(String s)
	{
		int countA =0;
		int countE =0;
		int countI =0;
		int countO =0;
		int countU =0;
		int cons = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			if (s.charAt(i) == 'a')
			{
				countA++;
			}
			else if(s.charAt(i) == 'e')
			{
				countE++;
			}
			else if(s.charAt(i) == 'i')
			{
				countI++;
			}
			else if(s.charAt(i) == 'o')
			{
				countO++;
			}
			else if(s.charAt(i) == 'u')
			{
				countU++;
			}
			else
			{
				cons++;
			}
		}
		System.out.println("a: "+countA);
		System.out.println("e: "+countE);
		System.out.println("i: "+countI);
		System.out.println("o: "+countO);
		System.out.println("u: "+countU);
		System.out.println("consonanti: "+cons);
	}
	
	//public palindromo(String s)
	{
		
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
		System.out.println("8) array");
		System.out.println("9) menu vettori");
		System.out.println("10) trova ralph");
		System.out.println("11) conta lettere");
		System.out.println("12) palindromo?");
		System.out.println("0) fine programma");
		return leggiNumero("fai una scelta");
	}






}
