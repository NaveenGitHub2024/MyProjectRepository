package packageName1;

import java.util.Scanner;

public class SimpleInterestAssignment3 {

	public static void main(String[] args) {
		System.out.println("Enter the values of P T R");
		Scanner sc=new Scanner(System.in);
		int P=sc.nextInt();
		int T=sc.nextInt();
		int R=sc.nextInt();
		SimpleInterestAssignment3 obj =	new SimpleInterestAssignment3();
		obj.method2(P,T,R);
	}
	public void method2(double P, double T, double R) {
	double	SI=((P*T*R)/100);
		System.out.println(SI);
	}
}
