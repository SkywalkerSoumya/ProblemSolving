package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int factNumber = sc.nextInt();
		
		for(int i = factNumber-1; i>0 ; i--) {
			factNumber = factNumber*i;
		}
		
		System.out.println(factNumber);

	}

}
