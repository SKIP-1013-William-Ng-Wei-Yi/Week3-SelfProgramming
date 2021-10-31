package selfProgramming;
import java.util.Scanner;

 class gasMileage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int miles;
		double gallons , mpg;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number of mile : ");
		miles= scan.nextInt();
	
		System.out.println("Enter the gallons fo fuel used : ");
		gallons = scan.nextDouble();
		
		mpg = miles / gallons;
		System.out.printf("Miles per Gallon : %.2f ",mpg);
	}

}
