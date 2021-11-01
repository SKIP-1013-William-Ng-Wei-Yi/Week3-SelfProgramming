package numericData;
import java.util.Scanner; // Method Scanner is used to keyin data from keyboard from user


public class mySaving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double mySaving;
		double withAmount;
		double saving;
		String name;
		char y,n;
		
		Scanner scanMe = new Scanner(System.in);// scanMe is the create new object for scanner input
		System.out.println("Please Enter your name : ");
	    name = scanMe.nextLine();
	    System.out.println("Please Enter Your Saving Amount");
	    mySaving = scanMe.nextDouble();
	    System.out.println("Please Enter Your withdraw amount");
	    withAmount = scanMe.nextDouble();
	    saving = mySaving - withAmount;
	    
	    System.out.println("\nHi "+name);
	    System.out.println("Your saving Left : RM"+saving);
	    System.out.println("Do you want to proceed ? Yes for y, No for n");
	    y=scanMe.next().charAt(0);
	    System.out.println("Yes Welcome!"+name);
	    n=scanMe.next().charAt(0);
	    System.out.println("No Thank You!");
		
	    
	}

}
