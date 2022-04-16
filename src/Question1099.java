import java.util.Scanner;

// 영일이는 생명과학에 관심이 생겨 왕개미를 연구하고 있었다.

// 왕개미를 유심히 살펴보던 중 특별히 성실해 보이는 개미가 있었는데,
// 그 개미는 개미굴에서 나와 먹이까지 가장 빠른 길로 이동하는 것이었다.

// 개미는 오른쪽으로 움직이다가 벽을 만나면 아래쪽으로 움직여 가장 빠른 길로 움직였다.
// (오른쪽에 길이 나타나면 다시 오른쪽으로 움직인다.)

// 이에 호기심이 생긴 영일이는 그 개미를 미로 상자에 넣고 살펴보기 시작하였다.

// 미로 상자에 넣은 개미는 먹이를 찾았거나, 더 이상 움직일 수 없을 때까지
// 오른쪽 또는 아래쪽으로만 움직였다.

// 미로 상자의 구조가 0(갈 수 있는 곳), 1(벽 또는 장애물)로 주어지고,
// 먹이가 2로 주어질 때, 성실한 개미의 이동 경로를 예상해보자.

// 단, 맨 아래의 가장 오른쪽에 도착한 경우, 더 이상 움직일 수 없는 경우, 먹이를 찾은 경우에는
// 더이상 이동하지 않고 그 곳에 머무른다고 가정한다.

// 미로 상자의 테두리는 모두 벽으로 되어 있으며,
// 개미집은 반드시 (2, 2)에 존재하기 때문에 개미는 (2, 2)에서 출발한다.

// 입력
// 10*10 크기의 미로 상자의 구조와 먹이의 위치가 입력된다.

// 출력
// 성실한 개미가 이동한 경로를 9로 표시해 출력한다.

// 입력 예시   
// 1 1 1 1 1 1 1 1 1 1
// 1 0 0 1 0 0 0 0 0 1
// 1 0 0 1 1 1 0 0 0 1
// 1 0 0 0 0 0 0 1 0 1
// 1 0 0 0 0 0 0 1 0 1
// 1 0 0 0 0 1 0 1 0 1
// 1 0 0 0 0 1 2 1 0 1
// 1 0 0 0 0 1 0 0 0 1
// 1 0 0 0 0 0 0 0 0 1
// 1 1 1 1 1 1 1 1 1 1

// 출력 예시
// 1 1 1 1 1 1 1 1 1 1
// 1 9 9 1 0 0 0 0 0 1
// 1 0 9 1 1 1 0 0 0 1
// 1 0 9 9 9 9 9 1 0 1
// 1 0 0 0 0 0 9 1 0 1
// 1 0 0 0 0 1 9 1 0 1
// 1 0 0 0 0 1 9 1 0 1
// 1 0 0 0 0 1 0 0 0 1
// 1 0 0 0 0 0 0 0 0 1
// 1 1 1 1 1 1 1 1 1 1

public class Question1099 {
    public static void main(String[] args) {

        final int COORDINATE_RANGE = 10;// 좌표 범위
        final int MOVE_PATH = 9;// 개미가 이동한 경로
        final int START_PLACE_X = 1;// 배열기준으로 시작 x좌표
        final int START_PLACE_Y = 1;// 배열기준으로 시작 y좌표

        // 1. by Caramel1004, 2차원배열로 좌표 생성 -> 각 요소들의 초기값은 0
        int[][] coordinate = new int[COORDINATE_RANGE][COORDINATE_RANGE];

        Scanner input = new Scanner(System.in);

        // 2. by Caramel1004, 미로 구조와 먹이 위치 입력
        for (int y = 0; y < COORDINATE_RANGE; y++) {
            for (int x = 0; x < COORDINATE_RANGE; x++) {
                coordinate[y][x] = input.nextInt();
            }
        }

        // 테스트 용
        // for (int y = 0; y < COORDINATE_RANGE; y++) {
        // coordinate[y][0] = 1;
        // coordinate[y][9] = 1;
        // for (int x = 0; x < COORDINATE_RANGE; x++) {
        // if (y == 0 || y == 9) {
        // coordinate[y][x] = 1;
        // }
        // }
        // }

        input.close();

        // 3. by Caramel1004, 이동경로 좌표 찍기
        int x = START_PLACE_X;// 초기 x위치
        int y = START_PLACE_Y;// 초기 y위치

        while ((x > 0 && x < (COORDINATE_RANGE - 2)) || (y > 0 && y < COORDINATE_RANGE - 1)) {

            // 먹이 검사 조건문
            if (coordinate[y][x + 1] == 2 || coordinate[y + 1][x] == 2
                    || coordinate[START_PLACE_X][START_PLACE_Y] == 2) {
                if (coordinate[y][x + 1] == 2) {// 오른쪽에 먹이가 있는경우
                    coordinate[y][x] = MOVE_PATH;
                    coordinate[y][++x] = MOVE_PATH;// 오른쪽으로 이동
                    // 반복문 종료
                    break;
                } else if (coordinate[y + 1][x] == 2 && coordinate[y][x + 1] == 1) {// 장애물 때문에 오른쪽으로 이동하지 못하고 아랫쪽에 먹이가
                                                                                    // 있는 경우
                    // 경로찍고
                    coordinate[y][x] = MOVE_PATH;
                    coordinate[++y][x] = MOVE_PATH;// 아래쪽으로 이동
                    // 반복문 종료
                    break;
                } else if (coordinate[START_PLACE_X][START_PLACE_Y] == 2) {// 시작위치에 먹이가 있는 경우
                    // 경로찍고
                    coordinate[y][x] = MOVE_PATH;
                    // 반복문 종료
                    break;
                }
            }

            coordinate[y][x] = MOVE_PATH;

            // 오른쪽 장애물 검사, 있으면 y값증가 즉 아래로 이동
            if (coordinate[y][x + 1] == 1) {
                y++;
            } else if (coordinate[y][x + 1] == 0) {
                x++;
            }
        }

        // 4. by Caramel1004, 미로판 출력
        for (int k = 0; k < COORDINATE_RANGE; k++) {
            for (int i = 0; i < COORDINATE_RANGE; i++) {
                System.out.print(coordinate[k][i] + " ");
            }
            System.out.println();
        }

    }// main

}
