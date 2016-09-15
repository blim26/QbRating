import java.util.Scanner;

public class QbRating {
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	String name;
	
	Scanner scanner1 = new Scanner(System.in);
	
	System.out.println("Enter name of quarterback: ");
	name = scanner1.nextLine();
	
	System.out.println("Enter amount of touchdowns(TD) thrown: ");
	double TD = input.nextDouble();
	
	System.out.println("Enter total amount of yards thrown: ");
	double yards = input.nextDouble();
	
	System.out.println("Enter number of interceptions(INT) thrown: ");
	double INT = input.nextDouble();
	
	System.out.println("Enter number of completions(comp) thrown: ");
	double comp = input.nextDouble();
	
	System.out.println("Enter number of passes attempted(ATT): ");
	double ATT = input.nextDouble();
	
	double a = (comp/ATT-0.3)*5; 
    
	double b = (yards/ATT-3)*0.25;
	
	double c = (TD/ATT*20); 
	
	double d = (2.375 - (INT/ATT*25));
	
	double Passer_Rating = (a + b + c + d)/6*100;
	//This will give the total QBR
	Passer_Rating = Math.round(10*Passer_Rating)/((double)10);
	System.out.println(name + "'s QBR is " + Passer_Rating);
	}
}
	
	
	

