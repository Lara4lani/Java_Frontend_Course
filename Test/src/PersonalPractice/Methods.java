package PersonalPractice;

import java.util.Scanner;

public class Methods {

	Scanner input = new Scanner(System.in);
	
	static void Triangle(int asterisks){

        for( int y=0 ; y<asterisks ; y++ ){

            for( int x=0 ; x<=y ; x++ ){

                System.out.print("*");

            }

            System.out.println();

        }
   
    }
    
    
    public int scegliNumero(String s)
    {
    	System.out.println(s);
    	return input.nextInt();
    }
    
    public void massimoMinimo() 
    {
    	int numeri = 0;
    	String scelta;
    	int max=numeri;
		int min=numeri;
    	
    	do
    	{
    		numeri=scegliNumero("scegli un numero");
    		System.out.println("vuoi continuare? y o n");
    		scelta=input.next();
    		if(numeri<min)
    		{
    			min=numeri;
    		}
    	
    	}while(scelta.equals("y"));
    	System.out.println("Il valore massimo e' " + max + " e il valore minimo e' " + min);
    }

	
}
