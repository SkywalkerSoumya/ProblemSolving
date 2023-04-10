package arrayRotation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int n = sc.nextInt();
//		int [] arr = new int [n];
//		
//		for(int i=0;i<n;i++) {
//			arr[i]= sc.nextInt();
//		}
//		
		int [] arr = {1,2,3,4,5};
		System.out.println("d input: ");
		int d = sc.nextInt();
		
		Deque<Integer> deq = new ArrayDeque<>();
		
		for(int i:arr) {
			deq.add(i);
		}
		
		for(int i=0;i<d;i++) {
			int temp = deq.remove();
			deq.addLast(temp);
		}
		
		System.out.println(deq);
		

	}

}
