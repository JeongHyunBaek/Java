package workshop1;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		double sum = 0, mul = 1;

		num = Integer.parseInt(args[0]);

		if (num < 5 || num > 10) {
			System.out.println("다시 입력하세요");
			return;
		} else {
			for (int i = 1; i <= num; i++) {
				sum += i;
				mul *= i;
			}
		}
		System.out.println("합 : " + sum);
		System.out.println("곱 : " + mul);
		System.out.println("평균 : " + sum / num);
	}

}
