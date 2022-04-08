//삼각형의 3변의 길이 a, b, c가 입력으로 주어진다.
//
//여기서 입력되는 변의 관계는 a ≤ b ≤ c 이다. 
//
//그 삼각형이 무슨 삼각형인지 출력하시오.
//
//조건에 따라 삼각형을 출력한다.
//
//조건)
//
//세 변의 길이가 같은 경우 : 정삼각형
//
//두 변의 길이가 같은 경우 : 이등변삼각형
//
//a2 + b2 = c2일 경우(피타고라스 정리) : 직각삼각형
//
//위의 조건에 맞지 않는 일반 삼각형일 경우 : 삼각형
//
//삼각형이 아닐 경우 : 삼각형아님
//
//을 출력한다.
import java.util.Scanner;

public class Question1218 {

	//최댓값 찾는 함수
	static int maxOf(int[] len) {

		int max = 0;//최댓값 초기화

		for(int k = 0; k < len.length; k++) {	
			//max보다 크면 그값을 max에 저장
			if(max <= len[k]) {
				max = len[k];
			}
		}

		return max;
	}
	//최소값 찾는 함수
	static int minOf(int[] len) {

		int min = len[0];//최댓값 초기화

		for(int k = 0; k < len.length; k++) {	
			//max보다 크면 그값을 max에 저장
			if(min >= len[k]) {
				min = len[k];
			}
		}

		return min;
	}

	//삼각형 판별 함수
	//파라미터 : 정수형 배열, 정수형 --> 최댓값,세변의 합
	static boolean validTriangle(int max,int sum) {

		//삼각형 조건 판별
		//ex)3,5,6이면 max는 6 sum은 14
		// 6 < 3 + 5 -->true
		//ex)3,5,10이면 max는 10 sum은 18
		// 10 < 3 + 5 -->false
		if(max < (sum - max)) {
			return true;//true -> 삼각형
		}else {//삼각형 조건에 맞지않을때 삼각형아님을 출력하고 리턴 시켜 함수종료
			return false;//false -> 삼각형아님
		}

	}

	//피타고라스식 성립 하는지 판별하는 함수
	static boolean pythaGorean(int[] len) {
		int max = maxOf(len);
		long pythaLeft = (long) Math.pow(max, 2);//좌변
		long pythaRight = 0;//우변
		for (int i = 0; i < len.length; i++) {
			if(max != len[i]) {
				pythaRight += (long)Math.pow(len[i], 2);
			}
		}

		if(pythaLeft == pythaRight) {
			return true;
		}else {
			return false;
		}
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String type = "";//삼각형 종류를 저장하는 변수

		int[] len = new int[3];//세변의 길이를 저장 할 배열
		int sum = 0;//세변의 합 -->초기화

		//1. 변의 길이 입력
		for(int i = 0; i < len.length; i++) {
			len[i] = input.nextInt();
			sum+=len[i];//세변의 합
		}
		
		int max = maxOf(len);//세변 중 최대인 값
		int min = minOf(len);//세변 중 최소인 값
	
		//2. 삼각형 판별
		if(validTriangle(max, sum)) {
			type = "삼각형";
		}else {
			type = "삼각형아님";
			System.out.println(type);
			return;
		}
		//----------------------------------------------------------------


		//3. 정삼각형 이등변삼각형 판별
		int key = 0;
		int count = 0;
		for(int k = 0; k < len.length; k++) {
			key = min;
			if(key == len[k]) {
				count++;
			}

			key = max;
			if(key == len[k]) {
				count++;
			}
	
		}
		
		
		if(count == 6) {
			type = "정삼각형";
			System.out.println(type);
			return;
		}else if(count == 3) {
			type = "이등변삼각형";
			System.out.println(type);
			return;
		}else if(count < 3) {
			if(pythaGorean(len)) {
				type = "직각삼각형";
			}
			System.out.println(type);
			return;
		}




	}//main
}//class
