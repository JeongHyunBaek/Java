package workshop2;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first, second, third;
		int max = 0, min = 0;
		
		first = Integer.parseInt(args[0]);
		second = Integer.parseInt(args[1]);
		third = Integer.parseInt(args[2]);
		
		if (first > second) {
			max = first;
			
			if (first < third) {
				max = third;
			}
		}
		else {
			max = second;
			
			if (second < third) {
				max = third;
			}
		}
		
		if (first < second) {
			min = first;
			
			if (first > third) {
				min = third;
			}
		}
		else {
			min = second;
			
			if (second > third) {
				min = third;
			}
		}
		
		System.out.println("입력 값 : " + first + " " + second + " " + third);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
