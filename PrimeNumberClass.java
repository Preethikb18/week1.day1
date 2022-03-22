package week1.day2;

public class PrimeNumberClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int input = 12;
       boolean flag = false;
       for(int i=2;i<input/2;++i)
       {
    	  if(input % i ==0)
    	  {
    		  flag= true;
    		  break;
    		  
    	  }
       }
    	   if(!flag)
    	   
    		   System.out.println(input + " " + " is prime number");
    	   
    	   else 
    	   
    		   System.out.println(input + " " + "is not prime number");
    	   
    	   
    	   }
       }


	


