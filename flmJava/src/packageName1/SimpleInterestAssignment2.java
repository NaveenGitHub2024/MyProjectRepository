package packageName1;

import java.util.Scanner;

public class SimpleInterestAssignment2 {

	public static void main(String[] args) {
		System.out.println("Enter the values of P,T,R");
	Scanner sc=	new Scanner(System.in);
	int P=sc.nextInt();
	int T=sc.nextInt();
	int R=sc.nextInt();
	SimpleInterestAssignment2 obj=new SimpleInterestAssignment2();
	obj.SimInt2( P, T, R);
	}
	public void SimInt2(int P, int T, int R) {
		double SI=((P*T*R)/100);
		System.out.println("Simple Interest is"+SI);
		
	}

}
