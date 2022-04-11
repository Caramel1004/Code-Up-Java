import java.util.Scanner;

public class Question1180 {

    static void swap(int idx1, int idx2, int[] arr) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1. 휴지통의 압축파일 갯수 최대치 -> 정수로 입력
        int max = input.nextInt();

        input.close();

        // 2. 숫자 -> 문자열로 형변환
        String str_max = Integer.toString(max);// ex) 정수 70으로 입력되고 문자열 70으로 형변환

        int digit = str_max.length();// 자릿수 -> 문자열의 길이가 곧 자리수가 됨
        int[] integ = new int[digit];// 자릿수의 배열 -> 각 자리의 숫자를 배열로 저장

        int parsingNum = 0;// char ->int 로 형 변환한 수
        int power = 0;// 거듭제곱 수

        // 3. 문자 -> 숫자로 형변환하여 정수형 배열에 저장
        for (int k = 0; k < str_max.length(); k++) {
            parsingNum = Character.getNumericValue(str_max.charAt(k));
            integ[k] = parsingNum;
        }

        // 4. 십의 자리수와 일의 자리수 자리바꿈
        for (int k = 1; k < digit; k++) {
            swap(k - 1, k, integ);
        }

        int sum = 0;// 자리숫자가 자리바꿈 한 후의 자리수 -> 배열 요소의 총합

        // 5. 자리숫자가 바뀐 자리수
        for (int k = 0; k < digit; k++) {
            power = (int) Math.pow(10, digit - (k + 1));// 10의 거듭제곱
            sum += (integ[k] * power); // ex) 5 7 -> 5 x 10 + 7 x 1 = 57
        }

        int comp_figure = sum * 2;// 압축 파일 수치
        String result = "오류";

        // 6. 압축 파일 수치로 결과 판단
        if (comp_figure >= 100) {
            comp_figure -= 100;
            result = (comp_figure <= 50) ? "GOOD" : "OH MY GOD";
        } else {
            result = (comp_figure <= 50) ? "GOOD" : "OH MY GOD";
        }

        System.out.println(comp_figure);
        System.out.println(result);

    }
}
