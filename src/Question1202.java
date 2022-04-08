//정수 하나를 입력받아 양수이면 "양수", 음수이면 "음수", 0이면 0을 출력하시오.


import java.util.Scanner;

public class Question1202 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//1. 점수 입력
		int score = input.nextInt();
		
		//2. 결과 저장하는 변수
		String grade = "";
		
		//3. 점수에 따른 등급 판단
		if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println(grade);
	}
}
