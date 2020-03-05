import java.util.Scanner;
public class StudentGPA {
	
	public static void main (String args[]){
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your number of classes");
		int classes;
		classes = input.nextInt();
		String Grade = "";
		int totalHours = 0;
		int totalHoursEarned = 0;
		int hours;
		double gpa;
		double number=0;
		
		
		if(Grade == "A")
			number = 4.0;
		else if(Grade == "A-")
			number = 3.7;
		else if(Grade == "B+")
			number = 3.33;
		else if(Grade == "B")
			number = 3.0;
		else if(Grade == "B-")
			number = 2.7;
		else if(Grade == "C+")
			number = 2.3;
		else if(Grade == "C")
			number = 2.0;
		else if(Grade == "C-")
			number = 1.7;
		else if(Grade == "D+")
			number = 1.3;
		else if(Grade == "D")
			number = 1.0;
		else if(Grade == "D-")
			number = .7;
		else if(Grade == "F")
			number = 0;
		
		
		for(int count = 0; count < classes; count++)
		{
			
			
			
			
			Scanner input2 = new Scanner (System.in);
			System.out.println("Please enter the number of hours this course was");
			hours = input2.nextInt();
			
			Scanner input3 = new Scanner(System.in);
			System.out.println("Please enter your grade for this class");
			Grade = input3.next();
			
			
			totalHours += hours;
			totalHoursEarned += (hours * number);
			
			
			
		}
	//for loop ends
		
		
		gpa = totalHoursEarned / totalHours;
		
		
		System.out.println(gpa);
		
		
	
	}
	
}