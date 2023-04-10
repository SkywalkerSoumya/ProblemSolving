package addition;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num1 : ");
		num1 = sc.nextInt();
		System.out.print("num2 : ");
		num2 = sc.nextInt();
		
		int temp = (-1)*num2;
		
		System.out.println("answer>>>"+(num1-temp));
		sc.close();
		
//		if(num1>=0 && num2<0) {
//			num1-=num2;
//			System.out.println("Result : "+num1);
//		}
//		else if(num1<0 && num2>=0) {
//			num2-=num1;
//			System.out.println("Result : "+num2);
//		}
//		else if(num1>0 && num2>0) {
//			for(int i=0; i<num1; i++)	num2++;
//		}
//		else if(num1<0 && num2<0) {
//			for(int i=0; i>num1; i--)	num2--;
//		}
//		
//		System.out.println("Result : "+num2);
//		sc.close();
	}

}
