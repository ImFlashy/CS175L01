import java.util.Scanner;

public class CarDecisionProject2 {
	
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	Scanner in1 = new Scanner(System.in);
	
	System.out.println("Enter the Information for the regular car (format make, model, cost, MPG :");
	String regInfo= in.nextLine();
	
	System.out.println("Enter the Information for the hybrid car (format make, model, cost, MPG :");
	String Hybinfo= in.nextLine();
	
	System.out.println("Enter miles traveled in a year: ");
	double MilesTraveled = in.nextDouble();
	System.out.println("Enter cost per gallon of gas: ");
	double CostPerGallon = in.nextDouble();
	
	
	
	String[] arrReginf = regInfo.split(",");
	String mmReg = arrReginf[0];
	int costReg = Integer.parseInt(arrReginf[1]);
	int mpgreg = Integer.parseInt(arrReginf[2]);
	
	String[] arrHybinfo = Hybinfo.split(",");
	String mmHyb = arrHybinfo[0];
	int costHyb = Integer.parseInt(arrHybinfo[1]);
	int mpgHyb = Integer.parseInt(arrHybinfo[2]);
	
	
	double yearGasreg = (MilesTraveled /mpgreg) * CostPerGallon;
	double yearReg = costReg + yearGasreg;
    double  year2Reg = yearGasreg+ yearReg;
    double  year3Reg = yearGasreg+ year2Reg;
    double  year4Reg = yearGasreg+ year3Reg;
    double  year5Reg = yearGasreg+ year4Reg;
    double yearGashyb = (MilesTraveled /mpgHyb) * CostPerGallon;
    double yearHyb = costHyb + yearGashyb;
    double year2hyb = yearGashyb +yearHyb;
    double year3hyb = yearGashyb +year2hyb;
    double year4hyb = yearGashyb +year3hyb;
    double year5hyb = yearGashyb +year4hyb;
    
    System.out.println("Cost to own after year 1 for " + mmReg + ": " +yearReg + "for "+ mmHyb + ": ");
    System.out.println("Cost to own after year 2 for " + mmReg + ": " +year2Reg + "for "+ mmHyb + ": "); 
    System.out.println("Cost to own after year 3 for " + mmReg + ": " +year3Reg + "for "+ mmHyb + ": "); 
    System.out.println("Cost to own after year 4 for " + mmReg + ": " +year4Reg + "for "+ mmHyb + ": "); 
    System.out.println("Cost to own after year 5 for " + mmReg + ": " +year5Reg + "for "+ mmHyb + ": "); 
    
    if (year5hyb < year5Reg)
    {
    	
    	System.out.println("The " +mmHyb + "Pays back after 5 years");
    }
	
	
	
	}
}
	
	
