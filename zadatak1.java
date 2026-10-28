package zadacisaprosllogkolokvijumavjezbe;

import java.util.Scanner;

public class zadatak1 {
	public static void main (String []args ) {
		int N;
		Scanner u = new Scanner(System.in);
		System.out.println("unesi N:");
		N=u.nextInt();
		
		while(N<=0){
			System.out.println("Unesi N ponovo N je <0:" );
			N = u.nextInt();
			u.close();
		}
		for(int i=1; i <=N; i++) {
			for (int j = 1; j<=i;j++)
				System.out.print("*");// print koristimo zato sto hocemo red a ne da nam se stampa * jedna ispod druge
			System.out.print("\n");
			
		}
	}

}
