//8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.
//
//참고
//%o로 입력받으면 8진수로 인식시켜 저장시킬 수 있다.
//%d로 출력하면 10진수로 출력된다.
//
//예시
//int n;
//scanf("%o", &n);
//printf("%d", n);
//(C언어에서 소스 코드 작성 시 0으로 시작하는 수는 8진수로 인식된다. int a = 013; // 10진수 11과 같은 값)


import java.util.Scanner;

public class Question1034 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//문자열 형태로 입력받고 문자열+문자열 = 문자열 이므로 0을 더해서 8진수 표기법으로 만든다
		//8진수는 리터럴 앞에 접두사 0을 붙인다.
		String octalString = input.next();
		
		//문자열 -> 숫자로 변환
		int decimal = Integer.parseInt(octalString,8); 
		
		System.out.println(decimal);
	}
}
