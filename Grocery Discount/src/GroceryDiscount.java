import java.util.Scanner;

public class GroceryDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double Discount;
		final double CouponDiscount1 = 0.08;
		final double CouponDiscount2 = 0.10;
		final double CouponDiscount3 = 0.12;
		final double CouponDiscount4 = 0.14;
		double GroceryPrice;
		
		while (true) {
			System.out.println("Enter cost of groceries or press 0 to exit: ");
			GroceryPrice = sc.nextDouble();
			if (GroceryPrice != 0) {
				if (GroceryPrice >210)
				{
					
					Discount = GroceryPrice * CouponDiscount4;
					System.out.println("You earn a discount of $" +Discount + "(" + CouponDiscount4 * 100 + "% of your purchase");
					
				    }
					else if (GroceryPrice >150 && GroceryPrice <=210)
					{
						Discount = GroceryPrice * CouponDiscount3;
					System.out.println("You earn a discount of $" +Discount + "(" + CouponDiscount3 * 100 + "% of your purchase");
					}
					else if (GroceryPrice >60 && GroceryPrice <=60)
					{
						Discount = GroceryPrice * CouponDiscount2;
					System.out.println("You earn a discount of $" +Discount + "(" + CouponDiscount2 * 100 + "% of your purchase");
					}
		else if (GroceryPrice >=10 && GroceryPrice <=60)
		{
						Discount = GroceryPrice * CouponDiscount1;
					System.out.println("You earn a discount of $" +Discount + "(" + CouponDiscount1 * 100 + "% of your purchase");
		}
					else 
					{
						System.out.println("You are not eligible for a discount at this time.");
					}
		            }
			        else {
		            break;
			        }
	}
}

	}	

						
		
	


