//16진수로 입력된 정수 1개를 8진수로 바꾸어 출력해보자.
//
//참고
//%x(영문자 소문자) 나 %X(영문자 대문자)로 입력 받으면
//16진수로 인식시켜 저장시킬 수 있다. %o로 출력하면 8진수로 출력된다.
//
//C언어에서 소스 코드 작성시 0으로 시작하는 수는 8진수로 인식된다.
//또한 소스코드 내에서 //로 시작하면 1줄 설명을 넣을 수 있다.
//여러 줄을 설명(주석) 을 넣을 경우 /* 와 */ 사이에 작성하면 된다.
//
//예시
//int n;
//scanf("%x", &n); //소문자로 16진수 입력
//printf("%o", n);


import java.util.Scanner;

public class Question1035 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//1. 16진수를 문자열로 입력받음
		String hexString = input.next();
		
		//2. 문자열로 된 16진수를 10진수로 변환
		int decimal = Integer.parseInt(hexString,16);
		
		//3. 10진수를 8진수로 변환
		String octalNum = Integer.toOctalString(decimal);
		
		//4. 문자열로 된 8진수 출력
		System.out.println(octalNum);
	}
}
