package totalSteps;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSteps = 0;

        while (true) {

            System.out.println("걸음 수를 입력하세요!");
            int steps = sc.nextInt();

            if (steps == 0) {
                System.out.println("totalsteps = " + totalSteps);
                break;
            }

            if (steps < 0) {
                System.out.println("잘못된 입력입니다!");
                continue;
            }

            totalSteps += steps;
            System.out.println("현재 totalsteps = " + totalSteps);
        }
        sc.close();
    }
}
