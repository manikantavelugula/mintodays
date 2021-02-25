package helloworld;
import java.util.*;
public class min_to_days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double minutesinyear = 60*24*365;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes : ");
		double min = input.nextDouble();
		long year = (long)(min/minutesinyear);
		int days = (int)(min/60/24)%365;
		System.out.println((int)min+" Minutes is approxmately "+year+" years and "+days+" days");
	}

}
