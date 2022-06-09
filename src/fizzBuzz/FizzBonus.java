package fizzBuzz;
import java.util.Scanner;
public class FizzBonus
{

	public static void main(String[] args) {
	 Scanner scan= new Scanner(System.in);
	 boolean flag=false;
	 
	 while (flag==false) 
	 {
        System.out.println("Inserisci contatore tra 1 e 200");
        int j= scan.nextInt();
        
        
        if (j>1 && j<=200) 
        {
        	flag=true;
        	for(int i =1;i<j;i++) 
    		{
    			//Aggiunta FizzBuzz
    			 if((i%3)==0 &&(i%5)==0) 
    			{
    				System.out.println("FizzBuzz");
    			}
    			//AggiuntaFizz
    			 else if((i%3)==0 ) 
    			{
    				System.out.println("Fizz");
    			}
    			//Aggiunta Buzz
    			else if((i%5)==0) 
    			{
    				System.out.println("Buzz");
    			}
    			else 
    			{
    				System.out.println(i);
    			}
    			 scan.close();
    		  }
    		
        }
	 }
	}
}
