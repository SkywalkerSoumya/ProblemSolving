package missingNum;

import java.util.Arrays;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,5,3};
		int len = arr.length;
		
/*------------with unsorted array input------------*/
		int max=0;
		int low=0;
		for(int i=0; i<len; i++) {
			if(max < arr[i])
				max = arr[i];
			if(low > arr[i])
				low = arr[i];
		}
		
		//System.out.println(low+","+max);
		if(low<0) {
			int size = max+1+(low*(-1));
			int [] count = new int[size];
			
			for(int i=0; i<len; i++) {
				count[arr[i]+(size-max-1)] = 1;
			}
			
			for(int i=0; i<size; i++) {
				if(count[i] == 0)
					System.out.println(i-(size-max-1));
			}
		}
		else {
			int [] count = new int[max+1];
			for(int i=0; i<len; i++) {
				count[arr[i]] = 1;
			}
			
			for(int i=0; i <= max; i++) {
				if(count[i] == 0)
					System.out.println(i);
			}
		}
		
/*---------with using array sort-------------*/
//		Arrays.sort(arr);
//		int missing_num=arr[0]+1;
//		//System.out.println(missing_num);
//		
//		for(int i=1; i<len; i++) {
//			
//			while(missing_num != arr[i]) {
//				System.out.println(missing_num);
//				missing_num++;
//			}
//			missing_num++;
//			
//		}
		
		
	}

}
