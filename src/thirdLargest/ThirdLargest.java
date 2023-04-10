package thirdLargest;

public class ThirdLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,2};
		int temp;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
			//System.out.println(i);
		}
		
//		for(int i=0;i<arr.length;i++)
//			System.out.println(arr[i]);
		System.out.println(arr[arr.length-3]);
	}

}
