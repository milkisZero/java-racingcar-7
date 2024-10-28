package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static racingcar.model.winner_list;
import static racingcar.model.car_list;
import static racingcar.model.totalCount;
import static racingcar.controller.checkInput;
import static racingcar.controller.saveCar;

public class view {
    public static void inputCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = readLine();
        checkInput(input);
        totalCount = Integer.parseInt(input);
    }

    public static void inputCar() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String user_input = readLine();
        saveCar(user_input);
    }

    public static void printWinner() {
        System.out.print("최종 우승자 : ");
        for (int i = 0; i < winner_list.size() - 1; i++) {
            Car tempCar = winner_list.get(i);
            System.out.print(tempCar.name);
            System.out.print(",");
        }
        Car tempCar = winner_list.get(winner_list.size() - 1);
        System.out.println(tempCar.name);
    }

    public static void printGame() {
        String moveStr = "-";
        for (int i = 0; i < car_list.size(); i++) {
            Car tempCar = car_list.get(i);
            System.out.print(tempCar.name + " : ");
            System.out.println(moveStr.repeat(tempCar.move_cnt));
        }
        System.out.println();
    }
}