package io.github.sindahera.controlstatements;

public class IfElseifDemo {

	public static void main(String[] args) {
		 
		int testscore = 32;
		char grade;
		
		if (testscore >= 90) {
			grade = 'A';
		}else if (testscore >= 80) {
			grade = 'B';
		}else if (testscore >= 70) {
			grade = 'C';
		}else if (testscore >= 60) {
			grade = 'D';
		}else   {
			grade = 'F';
		}
		
		System.out.println("Grade = " + grade);
		
//		ternary operators
		
//		int a = 4;
//		int b = 2;
//		int result;
//		
//		result = a<b ? a : b;
//		
//		System.out.println(result);
		

	}

}
