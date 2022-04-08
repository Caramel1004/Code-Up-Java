import java.util.Scanner;

public class Question1163 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] integ = new int[3];

		//1. 세 정수를 배열로 저장
		for (int i = 0; i < integ.length; i++) {
			integ[i] = input.nextInt();
		}

		input.close();

		//2. 세 정수의 합 구하기
		int sum = 0;

		for (int k = 0; k < integ.length; k++) {
			sum += integ[k];
		}

		//3. 숫자 -> 문자열로 형변환 하여 백의 자리 숫자 구하기
		String str = Integer.toString(sum);//세 정수의 합을 문자열로 변환

		int leng = str.length();

		// 2014 4-3 = 1
		// 25892 5-3 = 2
		// 123233 6-3 = 3
		char digit = str.charAt(leng - 3);//백의 자리 숫자를 문자형으로 저장

		int hundred_digit = Character.getNumericValue(digit);//wrapper class사용 문자 -> 숫자

		String result = "오류";
		if(hundred_digit % 2 ==0) {
			result = "대박";
		}else {
			result = "그럭저럭";
		}

		System.out.println(result);
	}
}
