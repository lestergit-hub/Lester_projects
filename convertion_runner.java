
import java.util.Scanner;

public class convertion_runner {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in); 
			// TODO Auto-generated method stub
		System.out.println("What is the percent");
	    double percent = scan.nextDouble();
	    System.out.println("What is given?");
	    double given = scan.nextDouble();
	    System.out.println(given*100/percent);
	    
		}

}
