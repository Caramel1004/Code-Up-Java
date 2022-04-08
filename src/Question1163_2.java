import java.util.Scanner;

public class Question1163_2 {

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

		//3. ex) 1514 = 100 x 15 +14 -> 15의 5는 백의 자리 숫자
		int quota = sum / 100;
		
		//4. 몫으로 짝수 홀수 판별하여 결과 출력
		String result = "오류";
		if(quota % 2 == 0) {
			result = "대박";
		}else {
			result = "그럭저럭";
		}
		
		System.out.println(result);
	}
}

