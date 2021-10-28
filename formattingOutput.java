package week3_Part1;

public class formattingOutput{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//%n is line separator
		//%10s (s)for string formating is important
	int x, c ;
	double y,price;


	x = 10;
	c = 2;
	y = 5.373123;
	price = 17.2999;
	
	System.out.printf("Value of x is %d and value of y is %6.2f and value of c is %d. %n", x, y, c);
	System.out.printf("%-10s","Total:"); //%-10s (s)
	System.out.printf("RM%-10.2f", price);
	
	}

}
