//세 개의 직선이 있다.
//
//숫자의 의미는 직선의 길이를 말한다.
//
//이 직선으로 삼각형을 만들 수 있는지 판단하는 프로그램을 작성하시오.
//
//삼각형의 성립 조건)
//
//a, b, c 가 변의 길이이고 c가 제일 긴 길이라고 한다면
//
//c < a + b 이면 삼각형이 성립됨.
import java.util.Scanner;

public class Question1212 {

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

		//2. 삼각형 판별
		if(validTriangle(max, sum)) {
			type = "yes";
		}else {
			type = "no";
		}
		
		System.out.println(type);
		
	}//main
}//class
