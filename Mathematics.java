package math;

import java.util.Scanner;

public class Mathematics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to calculate factorial of any number
		int number;
       Factorial factorial=new Factorial();
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        int result1=factorial.factorail1(number);
        System.out.println(result1);
	}

}
   class Factorial{
	   int number;
       int result=1;
       public int factorail1(int n) {
    	   this.number=n;
    	   for(int i=1;i<=number;i++) {
           	result=result*i;
           }
    	   return result;
       }
	
}
