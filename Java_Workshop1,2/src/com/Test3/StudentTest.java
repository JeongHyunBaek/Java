package com.Test3;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] maxAge = new int[2];
		int[] minAge = new int[2];
		int[] maxHeight = new int[2];
		int[] minHeight = new int[2];
		int[] maxWeight = new int[2];
		int[] minWeight = new int[2];
		double sumAge = 0, sumHeight = 0, sumWeight = 0;
		Student[] studentArray = new Student[3];
		studentArray[0] = new Student("홍길동", 15, 170, 80);
		studentArray[1] = new Student("한사람", 13, 180, 70);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		System.out.println("이름 나이 신장 몸무게");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i].studentInfo());
			sumAge += studentArray[i].getAge();
			sumHeight += studentArray[i].getHeight();
			sumWeight += studentArray[i].getWeight();
		}
		System.out.println();
		
		System.out.printf("나이 평균 : %.3f\n", sumAge / studentArray.length);
		System.out.printf("신장 평균 : %.3f\n", sumHeight / studentArray.length);
		System.out.printf("몸무게 평균 : %.3f\n", sumWeight / studentArray.length);
		System.out.println();
		
		maxAge[0] = minAge[0] = studentArray[0].getAge();
		maxHeight[0] = minHeight[0] = studentArray[0].getHeight();
		maxWeight[0] = minWeight[0] = studentArray[0].getWeight();
		maxAge[1] = minAge[1] = maxHeight[1] = minHeight[1] = maxWeight[1] = maxWeight[1] = 0;
		
		for (int i = 1; i < studentArray.length; i++) {
			if (maxAge[0] < studentArray[i].getAge()) {
				maxAge[0] = studentArray[i].getAge();
				maxAge[1] = i;
			}
			if (minAge[0] > studentArray[i].getAge()) {
				minAge[0] = studentArray[i].getAge();
				minAge[1] = i;
			}
			if (maxHeight[0] < studentArray[i].getHeight()) {
				maxHeight[0] = studentArray[i].getHeight();
				maxHeight[1] = i;
			}
			if (minHeight[0] > studentArray[i].getHeight()) {
				minHeight[0] = studentArray[i].getHeight();
				minHeight[1] = i;
			}
			if (maxWeight[0] < studentArray[i].getWeight()) {
				maxWeight[0] = studentArray[i].getWeight();
				maxWeight[1] = i;
			}
			if (minWeight[0] > studentArray[i].getWeight()) {
				minWeight[0] = studentArray[i].getWeight();
				minWeight[1] = i;
			}
		}
		System.out.println("나이가 가장 많은 학생 : " + studentArray[maxAge[1]].getName());
		System.out.println("나이가 가장 적은 학생 : " + studentArray[minAge[1]].getName());
		System.out.println("신장이 가장 큰 학생 : " + studentArray[maxHeight[1]].getName());
		System.out.println("신장이 가장 작은 학생 : " + studentArray[minHeight[1]].getName());
		System.out.println("몸무게가 가장 많이 나가는 학생 : " + studentArray[maxWeight[1]].getName());
		System.out.println("몸무게가 가장 적게 나가는 학생 : " + studentArray[minWeight[1]].getName());
	}

}
