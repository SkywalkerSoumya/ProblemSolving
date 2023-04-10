package customException;

public class Main {

	public void check_Age(int age) throws  CustomException{
		if(age < 60) {
			throw new CustomException("Not Eligible for free pass");
		}
		else {
			System.out.println("Eligible for free pass");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 19;
		
		Main obj = new Main();
		
		try {
			obj.check_Age(age);
			
		}
		catch(CustomException ce) {
			System.out.println("new custom exception: "+ce+" ...has occured");
		}

	}

}
