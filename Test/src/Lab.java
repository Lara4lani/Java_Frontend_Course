import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;


public class Lab {

	//attributo, variabile globale. Tutti i metodi possono accedervi.
	Scanner input = new Scanner(System.in);
	Random numR =new Random();
	DecimalFormat df = new DecimalFormat("0.0");

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
		String scelta;

		do
		{
			numeri = leggiNumero("scegli un numero");
			scelta = leggiStringa("vuoi continuare?  y o n");
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
		while(scelta.equalsIgnoreCase("y"));
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

	public boolean palindromo(String str)
	{//charAt ritorna il carattere nella posizione iesima
		boolean risp=true;
		str= str.toLowerCase().replaceAll(" ", "");
		for(int i=str.length()-1,j=0;i>j&&risp;i--,j++) 
		{
			if (str.charAt(i)!=str.charAt(j)) 
				risp=false;
		} 
		return risp;
	}

	public double calcolatrice()
	{
		double ris = leggiNumero("scegli un numero");
		String scelta;
		int num2;

		do
		{
			scelta = leggiStringa("scegli tra +, -, *, /, =");
			if(!"=".equals(scelta))
			{
				num2 = leggiNumero("Scegli un numero");

				if(scelta.equals("+"))
				{
					ris = ris+num2;
				}
				else if(scelta.equals("-"))
				{
					ris = ris-num2;
				}
				else if(scelta.equals("*"))
				{
					ris = ris*num2;
				}
				else if(scelta.equals("/"))
				{
					ris = ris/num2;
				}

				System.out.println(ris);
			}
		}while(!"=".equals(scelta));

		return ris;
	}

	public void ordinamento(String[] array, String ord)
	{
		String temp;
		if(ord.equalsIgnoreCase("crescente"))
		{
			for (int i = 0; i < array.length-1; i++) 
			{
				for (int j = i+1; j < array.length; j++) 
				{
					//vet[i].compareTo(vet[j]) ---> 0 -1  1

					//confronto
					if(array[i].compareTo(array[j])>0)
					{
						//swap - scambio
						temp=array[i];
						array[i]=array[j];  //vet[i]=anna  
						array[j]=temp;  //vet[j]=marco

					}
				}
			}
		}
		else if(ord.equalsIgnoreCase("decrescente"))
		{
			for (int i = 0; i < array.length-1; i++) 
			{
				for (int j = i+1; j < array.length; j++) 
				{
					//vet[i].compareTo(vet[j]) ---> 0 -1  1

					//confronto
					if(array[i].compareTo(array[j])<0)
					{
						//swap - scambio
						temp=array[i];
						array[i]=array[j];  //vet[i]=anna  
						array[j]=temp;  //vet[j]=marco

					}
				}
			}
		}


	}

	public void stampaVet(String[] vet)
	{
		for (int j = 0; j < vet.length; j++)
			System.out.println(vet[j]);


	}

	public void ordinamento(int[] array, String ord)
	{
		if(ord.equalsIgnoreCase("crescente"))
		{
			for(int i=0; i<array.length-1; i++)
			{
				for(int j=i+1; j<array.length; j++)
				{
					if(array[i]>array[j])
					{
						int swap=array[i];
						array[i]=array[j];
						array[j]=swap;
					}
				}
			}
		}
		else if(ord.equalsIgnoreCase("decrescente"))
		{
			for(int i=0; i<array.length-1; i++)
			{
				for(int j=i+1; j<array.length; j++)
				{
					if(array[i]<array[j])
					{
						int swap=array[i];
						array[i]=array[j];
						array[j]=swap;
					}
				}
			}
		}

	}


	public void stampaVet(int[] vet)
	{
		for (int j = 0; j < vet.length; j++)
			System.out.println(vet[j]);


	}

	public int[][] inizMatrice(int riga, int colonna)
	{
		int mat[][] = new int[riga][colonna];

		for(int i=0; i<mat.length; i++)
		{
			for( int j=0; j<mat.length; j++)
			{
				mat[i][j]= leggiNumero("inserisci il " + (j+1)+ " numero della " + (i+1) + " riga nella " + (j+1) + " colonna");
			}
		}
		return mat;
	}

	public void stampaMat(int[][] mat)
	{
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat.length; j++)
			{
				System.out.println(mat[i][j]);
			}
		}
	}

	public void meteo()
	{
		String[][] meteoMatr = new String[8][5];
		for(int j = 0; j<5;j++)
			for(int i = 0; i<8;i++)
			{
				if(j==0)
				{
					if(i==0)
						meteoMatr[0][0] = "   ";
					else if(i==1)
						meteoMatr[i][j]="Lun";
					else if(i==2)
						meteoMatr[i][j]="Mar";
					else if(i==3)
						meteoMatr[i][j]="Mer";
					else if(i==4)
						meteoMatr[i][j]="Gio";
					else if(i==5)
						meteoMatr[i][j]="Ven";
					else if(i==6)
						meteoMatr[i][j]="Sab";
					else
						meteoMatr[i][j]="Dom";
				}
				else if(i==0)
				{
					if(j==1)
						meteoMatr[i][j] = "  6  ";
					if(j==2)
						meteoMatr[i][j] = "  12 ";
					if(j==3)
						meteoMatr[i][j] = "  18 ";
					if(j==4)
						meteoMatr[i][j] = "  24 ";	
				}
				else
				{
					Random r = new Random();
					meteoMatr[i][j] = (" "+(-4 + (40 - (-4)) * r.nextDouble())).substring(0, 5);
				}
			}
		for(int j= 0; j<meteoMatr.length;j++)
		{
			System.out.print("|");
			for(int i = 0; i < meteoMatr[j].length; i++)
			{
				System.out.print(meteoMatr[j][i]);
				if(i != meteoMatr[j].length-1)
					System.out.print("|");
			}
			System.out.println("|");
		}
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
		System.out.println("10) trova nome");
		System.out.println("11) conta lettere");
		System.out.println("12) palindromo?");
		System.out.println("13) calcolatrice");
		System.out.println("14) ordine alfabetico");
		System.out.println("15) ordine numerico");
		System.out.println("16) matrice");
		System.out.println("17) meteo");
		System.out.println("0) fine programma");
		return leggiNumero("fai una scelta");
	}






}
