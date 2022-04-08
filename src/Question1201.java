//정수 하나를 입력받아 양수이면 "양수", 음수이면 "음수", 0이면 0을 출력하시오.


import java.util.Scanner;

public class Question1201 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		String result = "결과";
		if(num > 0) {
			result = "양수";
		}else if(num < 0) {
			result = "음수";
		}else {
			result = "0";
		}
		
		System.out.println(result);
	}
}
