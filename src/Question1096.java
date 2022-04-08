import java.util.Scanner;

class Main {
	public static void main(String args[]) {

		final int COORDINATE_RANGE = 19;// 좌표 범위
		final int WHITE_DOL = 1;// 흰돌을 1로 선언

		// 1.2차원배열로 좌표 생성
		int[][] coordinate = new int[COORDINATE_RANGE][COORDINATE_RANGE];

		Scanner input = new Scanner(System.in);

		// 2.흰돌을 출력 할 갯수
		int white_dol_num = input.nextInt();

		// x좌표 y좌표 초기화
		int x = 0;
		int y = 0;

		// x좌표 y좌표 입력
		for (int h = 0; h < white_dol_num; h++) {

			x = input.nextInt();
			y = input.nextInt();

			coordinate[x - 1][y - 1] = WHITE_DOL;
		}

		// 3.이중 for문으로 좌표평면 구축
		for (int k = 0; k < COORDINATE_RANGE; k++) {
			for (int i = 0; i < COORDINATE_RANGE; i++) {
				System.out.print(coordinate[k][i] + " ");
			}
			System.out.println();
		}
	}
}
