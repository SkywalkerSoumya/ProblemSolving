package abc;

import java.util.Scanner;

public class Main {


	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String x = sc.nextLine();
//		String ans ="";
//		
//		for(int i=0; i< x.length(); i++) {
//			if(x.charAt(i)>= 'a' && x.charAt(i) <= 'z') {
//				ans += x.charAt(i);
//			}
//		}		
		
		//System.out.println(ans);
		System.out.println(x.replaceAll("[0-9@$%a-zA-D]", ""));
		
		
	}
}
