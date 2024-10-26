package test.apps.racingcar.view;

import test.apps.racingcar.model.Car;

import java.util.List;
import java.util.Scanner;

public class RaceView {

    Scanner sc = new Scanner(System.in);

    public String[] getCarNames() {

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        return sc.nextLine().split(",");
    }

    public int getRaceRoundCount() {

        System.out.println("시도할 횟수는 몇 회인가요?");

        return sc.nextInt();
    }

    public void displayRaceStatus(List<Car> cars) {

        System.out.println();

        for (Car car : cars) {

            System.out.println(car.getName() + " : " + car.getPosition());

        }

        System.out.println();
    }

    public void displayWinners(List<String> winners) {

        System.out.println("최종 우승자 : " + String.join(",", winners));

    }
}

