package racingcar.view;


import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String INPUT_CAR_NAMES = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)";
    private static final String INPUT_NUM_OF_ROUND = "시도할 회수";

    public static String[] scanCarNames() {
        System.out.println(INPUT_CAR_NAMES);
        String carNames = Console.readLine();

        return carNames.split(",");
    }

    public static Integer scanNumOfRound() {
        System.out.println(INPUT_NUM_OF_ROUND);
        String numOfRound = Console.readLine();

        return Integer.parseInt(numOfRound);
    }
}
