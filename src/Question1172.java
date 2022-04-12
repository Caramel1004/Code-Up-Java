// 세 수를 오름차순으로 정렬하려고 한다. (낮은 숫자 -> 높은 숫자)

// 예)

// 5 8 2   ====> 2 5 8    로 출력

// 입력
// 세 정수가 입력된다.

// 출력
// 낮은 숫자 부터 출력한다.

// 입력 예시   
// 8 7 6

// 출력 예시
// 6 7 8

import java.util.Scanner;

public class Question1172 {

    // 자리교환 메소드
    static void swap(int idx1, int idx2, int[] arr) {
        int tmp = 0;

        tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    // 버블정렬 오름차순
    static void bubbleSort(int[] arr) {

        for (int k = 0; k < 3; k++) {
            for (int i = 1; i < (3 - k); i++) {
                if (arr[i - 1] > arr[i]) {
                    swap(i - 1, i, arr);
                }
            }
        }
    }

    public static void main(String[] args) {

        // 1. 세 정수 입력
        Scanner input = new Scanner(System.in);

        int[] integ = new int[3];

        for (int k = 0; k < 3; k++) {
            integ[k] = input.nextInt();
        }

        input.close();

        // 2. 오름차순으로 정렬
        bubbleSort(integ);

        // 3. 정렬된 배열요소 출력
        for (int k = 0; k < 3; k++) {
            System.out.print(integ[k] + " ");
        }
    }
}