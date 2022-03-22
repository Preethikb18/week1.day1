package week1.day2;


//Class to find the factorial of number
public class FactorialClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =3;
		int fact =1;
		
		// Multiply fact with i till i is less than or equal to num
		for(int i=1;i<=num;i++)
		{
		 fact= fact * i;
		 
		}
		System.out.println("Factorial of "+num+" is: "+fact);
	}

}
