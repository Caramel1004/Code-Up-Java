//10진 정수 1개를 입력받아 아스키 문자로 출력해보자.
//단, 0 ~ 255 범위의 정수만 입력된다.

import java.util.Scanner;

public class Question1037 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 1. 정수를 입력받음
		int code = input.nextInt();

		input.close();
		// 2. 아스키코드를 해당 문자로 변환
		char cha = (char) code;

		// 3. 문자 출력
		System.out.println(cha);
	}
}
