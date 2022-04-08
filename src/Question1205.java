//두 실수 a, b가 입력되면 그 두수를 더하거나 빼거나 곱하거나 나누거나 제곱을 해서 가장 큰 수를 출력하시오.
//
//예를 들어 1과 2가 입력되면,
//
//1+2 = 3   , 2+1 = 3
//
//1 - 2 = -1,   2 - 1 = 1
//
//1 * 2 = 2,    2 * 1 = 2
//
//1 / 2 = 0.5,   2 / 1 = 2
//
//12=1 ,   21 = 2
//
//따라서 최댓값은 3이다.

import java.util.Scanner;
import java.lang.Math;

public class Question1205 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//1. 두 실수 입력
		double a = input.nextDouble();
		double b = input.nextDouble();

		input.close();
		
		//2. 계산 값 구해서 각 변수에 저장
		double[] add = {a + b, b + a};
		double[] sub = {a - b, b - a};
		double[] multi = {a * b, b * a};
		double[] div = {a / b ,b / a};
		double[] power = {Math.pow(a,b),Math.pow(b,a)};
		
		//3. 계산 값을 2차원 배열로 저장
		double[][] figures = {add,sub,multi,div,power};
		
		//4. for으로 최댓값 판별
		double max = 0;
		for (int i = 0; i < figures.length; i++) {
			for (int k = 0; k < 2; k++) {
				if(max < figures[i][k]) {
					max = figures[i][k];
				}
			}
		}
		
		System.out.printf("%.6f",max);
	}

}
