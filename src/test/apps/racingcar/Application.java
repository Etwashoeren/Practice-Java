package test.apps.racingcar;

import test.apps.racingcar.controller.RaceController;
import test.apps.racingcar.view.RaceView;

public class Application {
    public static void main(String[] args) {
        RaceView view = new RaceView();
        RaceController controller = new RaceController(view);
        controller.start();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
//        String input = sc.nextLine();
//
//        System.out.println("시도할 횟수는 몇 회인가요?");
//
//        int count;
//
//        try {
//            count = sc.nextInt();
//            if (count <= 0) {
//                throw new IllegalArgumentException();
//            }
//        } catch (Exception e) {
//            throw new IllegalArgumentException("잘못된 입력값 입니다.");
//        }
//
//
//        String[] cars = input.split(",");
//
//        for (String car : cars) {
//            if (car.length() > 5) {
//                throw new IllegalArgumentException("자동차 이름은 5글자 이하이어야 합니다.");
//            }
//        }
//
//        for (int i= 0; i < cars.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (cars[i].equals(cars[j])) {
//                    throw new IllegalArgumentException("자동차 이름은 중복될 수 없습니다.");
//                }
//            }
//        }
//
//        int countOfCars = cars.length;
//
//        String[][] carArray = new String[countOfCars][2];
//
//        for (int i = 0 ; i < countOfCars ; i++) {
//            carArray[i][0] = cars[i];
//            carArray[i][1] = "";
//        }
//
//        while (count-- > 0) {
//            for (int i = 0; i < countOfCars; i++) {
//
//                int randNum = (int)(Math.random() * 10);
//                if (randNum >= 4) {
//                    carArray[i][1] += "-";
//                }
//                System.out.println(carArray[i][0] + " : " + carArray[i][1]);
//            }
//            System.out.println();
//        }
//
//        int result = 0;
//
//        for (int i = 0; i < countOfCars; i++) {
//            if (carArray[i][1].length() > result) {
//                result = carArray[i][1].length();
//            }
//        }
//
//        List<String> winners = new ArrayList<>();
//
//        for (int i = 0; i < countOfCars; i++) {
//            if (carArray[i][1].length() == result) {
//                winners.add(carArray[i][0]);
//            }
//        }
//
//        System.out.println("최종 우승자 : " + String.join(",", winners));

    }
}
