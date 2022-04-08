// 문제 : 학교를 탈출 하다 발각되어 우물에 갇힌 영재!
// 영재는 하루에 b만큼 올라가고 밤에 자는 동안 머리가 무거워 c만큼 추락한다.
// 우물의 총 높이가 a일 때 영재는 며칠 만에 탈출 할 수 있는가?

// 700 45 32
// 1일동안 13 올라가므로 수학적으로 접근하면 
// 첫날에는 높이 0부터 출발 하기 때문에 첫날에는 45 만큼 올라갑니다 두쨋날 부터  영재의 수면시간을 포함 하면 하루에 13 올라가는 것 이지요. 13만큼 올라가는 일수를 quota로 놓으면  45 + 13 x quota >= 700
// 부등식을 정리하면 quota >= 50.3xxxx 로 나오고 여기서 13만큼 올라간 일 수의 최솟값인 51을 얻을 수 있습니다. 여기서 주의 45만큼 올라간 1일도 더해야겠죠^^ 따라서 52일에 탈출하는 것이지요.
// 수식을 일반화 하면 b + (b - c) x quota >= a
// 따라서 코드는 이렇게 쓸 수 있겠네요.
// 여기서 주의할 점이 하나 있는데요. 나머지가 0인 경우가 있는데 이경우에는 1만 더해 주셔야 됩니다.

import java.util.Scanner;

public class Question2745 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        input.close();

        int totalDay = 0;

        int quota = (a - b) / (b - c);
        int rest = (a - b) % (b - c);

        if (rest > 0) {
            totalDay = (quota + 2);
        } else {
            totalDay = (quota + 1);
        }

        System.out.print(totalDay);
    }
}