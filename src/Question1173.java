import java.util.Scanner;

public class Question1173 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int currentHour = input.nextInt();
        int currentMin = input.nextInt();

        input.close();

        // 2. 30을 빼서 음수면 시에서 1시간 감소
        int pastHour = currentHour;
        int pastMin = currentMin - 30;

        if (pastMin < 0) {
            pastHour = (currentHour - 1);
            pastMin = 60 + pastMin;
        }

        if (pastHour < 0) {
            pastHour = 23;
        }

        System.out.println(pastHour + " " + pastMin);
    }
}
