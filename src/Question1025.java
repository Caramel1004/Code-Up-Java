
//공부한 내용
// Char to Int - Ascii code 사용Permalink
// 컴퓨터는 문자를 기억할 수 없기 때문에, 숫자 번호에 문자를 연결하여 기억합니다. 가령 숫자 0은 문자 A, 숫자 1은 문자 B 이런 식으로요.
// Ascii code는 초기에 만들어진 숫자 - 문자 매핑 테이블이라고 생각하시면 됩니다.
// 문자 '0'의 아스키코드는 48이고, 문자 '9'의 아스키코드는 57이죠. 하나씩 커지는 셈입니다.
// 즉, 다음처럼 아스키 코드를 이용해서 연산을 해버리면 char를 Int로 변환한 것과 동일한 결과가 나오게 되죠.
// char c1 = '9';
// int i1 = c1 - '0'; // 57 - 48 = 9
// Character.getNumericValue(c1)를 사용해서 처리하는 방법도 있습니다.
// char c1 = '9';
// Character.getNumericValue(c1) // 9 
import java.util.Scanner;
import java.lang.Math;

public class Question1025 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // 1. 입력값을 문자열 형태로 저장
        String str = input.next();

        input.close();

        // 2. 자리수의 숫자 배열 선언
        int digit = str.length();// 자릿수 ->문자열 길이가 곧 몇자리수가 됨
        int[] integ = new int[digit];// 자릿수의 배열 ->각 자리에있는 숫자를 저장

        int parsingNum = 0;// char ->int 로 형 변환한 수
        int power = 0;// 거듭제곤 수

        // 3. 형변환 한 수와 거듭제곱수를 구해서 자릿수배열에 저장
        for (int k = 0; k < str.length(); k++) {
            parsingNum = Character.getNumericValue(str.charAt(k));
            power = (int) Math.pow(10, digit - (k + 1));
            integ[k] = parsingNum * power;
        }

        // 4. 결과 출력
        for (int i = 0; i < digit; i++) {
            System.out.println("[" + integ[i] + "]");
        }
    }
}
