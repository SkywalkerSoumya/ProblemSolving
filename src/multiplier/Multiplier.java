package multiplier;

import java.util.Scanner;

public class Multiplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		int res=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num1 : ");
		num1 = sc.nextInt();
		System.out.print("num2 : ");
		num2 = sc.nextInt();
		
//		for(int i=0; i<num2; i++)
//		{
//			num1++;
//		}
		
		
		
//		code is not efficient as it is rounding the integer total length
//		for(int i=0; (i<num2 || i>num2); i++) {
//			//System.out.println(i);
//			res += num1;
//			//System.out.println(res);
////			if (i==10)
////				break;
//		}
		
		if(num2<0) {
			for(int i=num2; i<0; i++)	res-= num1;
		}
		else {
			for(int i=0; i<num2; i++)	res+= num1;
		}
		
		System.out.println("Result : "+res);
		
		sc.close();
	}
}
