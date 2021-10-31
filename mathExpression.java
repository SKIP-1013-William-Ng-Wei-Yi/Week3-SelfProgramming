package selfProgramming;

public class mathExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		double expression;
		a=20;
		b=30;
		c=3;
		
		expression = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
		
		System.out.printf("%.2f",expression);
	}

}
