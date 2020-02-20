import java.util.Scanner;

public class GroceryDiscount {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		in = new Scanner(System.in);
		
		
		System.out.println("Please enter the cost of your grocieries or 0 to quit: ");
		String Cost1 = in.nextLine();
		Double Answer1 = Double.parseDouble(Cost1);
		
		System.out.println("Please enter the cost of your grocieries or 0 to quit: ");
		String Cost2 = in.nextLine();
		
		
			
		
		if (Answer1 < 10)
	    {
	    	
	    	System.out.println("You are not eligble for a coupon this time.");
	    	
	    }
	    
		else if (Answer1 <=60)
	{       System.out.println("You win a discount coupon of  ");
	    }
		
		else if (Answer1 <=150);

		
}
	
}
