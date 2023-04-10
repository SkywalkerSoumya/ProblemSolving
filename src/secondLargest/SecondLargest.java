package secondLargest;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-10,7,9,8,-6,2,3};
		
		int large1=0,large2=0,large3=0;
		
		if(arr[0] > arr[1]) {
			large1 = arr[0];
			large2 = arr[1];
		}
		else {
			large1 = arr[1];
			large2 = arr[0];
		}
		
		if(arr[2] > large1 && arr[2] > large2) {
			large3 = large2;
			large2 = large1;
			large1 = arr[2];
		}
		else if(arr[2] > large2) {
			large3 = large2;
			large2 = arr[2];
		}
		
		for(int i=3; i<arr.length; i++) {
			if(arr[i] > large1) {
				large3 = large2;
				large2 = large1;
				large1 = arr[i];
			}
			else if(arr[i] > large2) {
				large3 = large2;
				large2 = arr[i];
			}
			else if(arr[i] > large3) {
				large3 = arr[i];
			}
		}
			
		System.out.println(large1);
		System.out.println(large2);
		System.out.println(large3);
//
	}

}

