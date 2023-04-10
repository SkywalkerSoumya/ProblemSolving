package factorial;
import java.util.Scanner;

public class FactRec {

	static int fact(int num) {
		
		if(num==0)
			return 1;
		return(num * fact(num-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			
			System.out.println(fact(num));
	}

}
