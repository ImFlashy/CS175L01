import java.util.Scanner;

public class CarCostCalculation {

	//User Input
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	System.out.print("Enter Cost of regular car:  ");
	double RegularCarCost =  scan.nextDouble();
	System.out.print("Enter Miles per gallon of regular car: ");
	double RegularCarMPG =  scan.nextDouble();
	System.out.print("Enter Cost of hybrid car: ");
	double HybridCarCost =  scan.nextDouble();
	System.out.print("Enter Miles per gallon of hybrid car: ");
	double HybridCarMPG =  scan.nextDouble();
	System.out.print("Enter miles traveled in a year: ");
	double MilesTraveled =  scan.nextDouble();
	System.out.print("Enter cost per gallon of gas: : ");
	double CostPerGallon =  scan.nextDouble();
	
	//Calculations (Regular Car)
	double RegularCarYear1 = ( CostPerGallon* (MilesTraveled / RegularCarMPG) + RegularCarCost);
	System.out.println("Cost to own after 1 year for Regular Car" + RegularCarYear1);
	double RegularCarYear2 = ( CostPerGallon* (2*(MilesTraveled) / RegularCarMPG) + RegularCarCost);
	System.out.println("Cost to own after 2 years for Regular Car" + RegularCarYear2);
	double RegularCarYear3 = ( CostPerGallon* (3*(MilesTraveled) / RegularCarMPG) + RegularCarCost);
	System.out.println("Cost to own after 3 years for Regular Car" + RegularCarYear3);
	double RegularCarYear4 = ( CostPerGallon* (4*(MilesTraveled) / RegularCarMPG) + RegularCarCost);
	System.out.println("Cost to own after 4 years for Regular Car" + RegularCarYear4);
	double RegularCarYear5 = ( CostPerGallon* (5*(MilesTraveled) / RegularCarMPG) + RegularCarCost);
	System.out.println("Cost to own after 5 years for Regular Car" + RegularCarYear5);
	
	//Calculations (Hybrid Car)
	double HybridCarYear1 = ( CostPerGallon* (MilesTraveled / HybridCarMPG) + HybridCarCost);
	System.out.println("Cost to own after 1 year for HybridCar Car" + HybridCarYear1);
	double HybridCarYear2 = ( CostPerGallon* (2*(MilesTraveled) / HybridCarMPG) + HybridCarCost);
	System.out.println("Cost to own after 2 years for HybridCar Car" + HybridCarYear2);
	double HybridCarYear3 = ( CostPerGallon* (3*(MilesTraveled) / HybridCarMPG) + HybridCarCost);
	System.out.println("Cost to own after 3 years for HybridCar Car" + HybridCarYear3);
	double HybridCarYear4 = ( CostPerGallon* (4*(MilesTraveled) / HybridCarMPG) + HybridCarCost);
	System.out.println("Cost to own after 4 years for HybridCar Car" + HybridCarYear4);
	double HybridCarYear5 = ( CostPerGallon* (5*(MilesTraveled) / HybridCarMPG) + HybridCarCost);
	System.out.println("Cost to own after 5 years for HybridCar Car" + HybridCarYear5);
	
	//If Statement
	System.out.println("The Hybrid Car Pays Back");
	if (HybridCarYear5 < RegularCarYear5)
	{
	
	}
	else 
		
	System.out.println("The Regular Car Pays Back");
	
	
	
		

	}

}
