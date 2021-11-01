package numericData;

public class cgpaCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sem1, sem2, sem3, sem4, sem5, sem6,cgpa;
		sem1 = 3.69;
		sem2 = 3.83;
		sem3 = 3.67;
		sem4 = 3.72;
		sem5 = 3.94;
		sem6 = 4.00;
		String poli = "POLITEKNIK SEBERANG PERAI";
		String diploma = "Diploma in Information Technology (Technology Digital) Majoring in Software";
		String nama = "William Ng Wei Yi";
		cgpa=((sem1+sem2+sem3+sem4+sem5+sem6)/24)*4.0 ;
		
		System.out.println(poli);
		System.out.println(diploma);
		System.out.println("Name : " + nama);
		System.out.println("\nGPA Semester 1 / 2018 : "+sem1);
		System.out.println("GPA Semester 2 / 2018 : "+sem2);
		System.out.println("GPA Semester 3 / 2019 : "+sem3);
		System.out.println("GPA Semester 4 / 2019 : "+sem4);
		System.out.println("GPA Semester 5 / 2019 : "+sem5);
		System.out.println("GPA Semester 6 / 2019 : "+sem6);
		System.out.printf("\nCGPA of my Diploma : %.2f With First Class Honor",cgpa);
		System.out.println("\nDone Internship at Western Digital,Bayan Lepas, Penang");
	}

}
