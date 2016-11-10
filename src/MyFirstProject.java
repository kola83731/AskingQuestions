import java.util.Scanner;

public class MyFirstProject {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	    
		System.out.println( "enter first double value " );
	    double no1 = sc.nextDouble();

	    System.out.print( "enter Second double value " );
	    double no2 = sc.nextDouble();
	    double maxNo = Math.max(no1,no2);

	    System.out.println("max value is " + maxNo);

	}

}
