package math;
import java.util.Scanner;
public class Palindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to check given number is a palindron or not
		int number;
		int temp;
		int reversed=0 ;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		temp=number;
		while(number!=0)
		{
			int remainder =number%10;
			reversed=reversed*10+remainder;
			number/=10;
			
		}
		if(reversed==temp)
		{
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
