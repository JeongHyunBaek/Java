package workshop1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double molecular, denominator;
		
		molecular = Double.parseDouble(args[0]);
		denominator = Double.parseDouble(args[1]);

		if (molecular % denominator > 1) {
			System.out.println("나머지가 1보다 크다!");
		} else {
			System.out.println("나머지가 1보다 작거나 같다!");
		}

	}

}
