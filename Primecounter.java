package math;

import java.util.Arrays;

public class Primecounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     boolean h[]=primecount(1,30);
    for(int i=0;i<=20;i++) {
    	System.out.println(h[i]+" "+i);
    }
	}
	public static boolean[] primecount(int a,int b) {
		boolean bol[]=new boolean[b+1];
		Arrays.fill(bol, true);
		bol[0]=false;
		bol[1]=false;
		for(int i=2;i*i<=b;i++) {
			for(int j=i+i;j<=b;j=j+i) {
				bol[j]=false;
			}
		}
		return bol;
	}

}
