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
    


	
}
