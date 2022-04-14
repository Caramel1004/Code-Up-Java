// 정수 2개(a, b)를 입력받아 a를 2^b배 곱한 값으로 출력해보자.
// 0 <= a <= 10, 0 <= b <= 10

// 참고
// 예를 들어 1 3 이 입력되면 1을 2^3(8)배 하여 출력한다.

// 예시
// int a=1, b=10;
// printf("%d", a << b); //210 = 1024 가 출력된다.

// 입력
// 정수 2개가 공백을 두고 입력된다.
// 0 <= a, b <= 10

// 출력
// a 를 2^b배 만큼 곱한 값을 출력한다.

// 입력 예시   
// 1 3

// 출력 예시
// 8

import java.util.Scanner;

public class Question1048 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int integ = input.nextInt();// 피연산자
        int exponent = input.nextInt();// 지수

        input.close();

        int power = 1 << exponent;// 2의 거듭제곱 수

        int resultValue = integ * power;// 결과 값

        System.out.println(resultValue);
    }
}
