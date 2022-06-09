package fizzBuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		//Stampa numero da 1 a 100
		//Multipli di 3 stampa fizz
		//Multipli di 5 stampa buzz
		//Multipli di 3 e 5 stampa fizzBuzz
		System.out.println("Giochiamo a FizzBuzz");
		for(int i =1;i<101;i++) 
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
		    }
		
        
	    }

}
