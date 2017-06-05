package Chapter6;

import java.util.Scanner;

public class DistanceBetweenPoints 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter two points of cartesian, to find distance");
		System.out.print("1. point x-coordinate: ");
		double pointAx = input.nextDouble();
		System.out.print("1. point y-coordinate: ");
		double pointAy = input.nextDouble();
		System.out.print("2. point x-coordinate: ");
		double pointBx = input.nextDouble();
		System.out.print("2. point y-coordinate: ");
		double pointBy = input.nextDouble();
			
		double distance = distance(pointAx, pointAy, pointBx, pointBy);
		
		System.out.printf("distace between two points: %f",distance);		

	}
	
	public static double distance(double Ax, double Ay, double Bx, double By)
	{	
		return Math.sqrt(Math.pow(Math.abs(Ax-Bx), 2) + Math.pow(Math.abs(Ay-By), 2));
	}
}
