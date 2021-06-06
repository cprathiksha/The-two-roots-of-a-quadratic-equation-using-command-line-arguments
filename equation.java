


import java.util.*;

public class equation {
	public static void main(String[] args) {

		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		double discriminant = Math.pow(b, 2) - 4 * a * c;

		if (discriminant > 0)
		{
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);  
			double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);  
			System.out.println("Two roots " + root1 + " and " + root2);
		}
		else if (discriminant == 0)
		{
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.println("Only one root " + root1);
		}
		else
		{
			System.out.println("Roots are imaginary");
		}
			
	}
}


