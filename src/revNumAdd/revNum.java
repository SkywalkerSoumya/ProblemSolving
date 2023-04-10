package revNumAdd;

import java.util.Scanner;

public class revNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  int num = sc.nextInt();
		 
		//int num = -12;
		int rev = 0, rem;
		int temp = num, sumOfEachDigit=0;
		while(num!=0) {
			rem = num%10;
			sumOfEachDigit+=rem;
			rev = rev*10+rem;
			num/=10;
		}
		
		System.out.println(rev);
		System.out.println(sumOfEachDigit);
		System.out.println(temp+=rev);

	}

}
