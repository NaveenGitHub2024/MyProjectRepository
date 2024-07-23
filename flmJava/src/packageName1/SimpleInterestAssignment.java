package packageName1;

import java.util.Scanner;

public class SimpleInterestAssignment {

	public static void main(String[] args) {
		
		System.out.println("Enter the value of P");
		System.out.println("Enter the value of T");
		System.out.println("Enter the value of R");
		Scanner input=new Scanner(System.in);

		int P=input.nextInt();
		double T=input.nextInt();
		int R=input.nextInt();
		System.out.println(SimpleInterestAssignment.SimInt(P, T, R));
	}
	public static double SimInt(int P, double T, int R ) {
		
	double res=((P*T*R)/100);
	return res;
		
	}

}
