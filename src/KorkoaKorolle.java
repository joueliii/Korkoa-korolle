	import java.util.Scanner;

	public class KorkoaKorolle {

	   public static double laskeTulos (double principal, double rate, double time)
	   {
	    

	      double compoundInterest = 0;

	      
	      compoundInterest = principal * Math.pow((1 + rate/100),time); 
	  
	      return compoundInterest;
	  
	   }

	}


