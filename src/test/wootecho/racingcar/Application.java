package test.wootecho.racingcar;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = sc.nextLine();   // 자동차 이름 생성

        System.out.println("시도할 횟수는 몇 회인가요?");
        int count = sc.nextInt();       // 전진 횟수 입력

        String[] cars = input.split(",");   // 입력 받은 자동차를 ,로 구분하여 분리

        for (String car : cars) {                   // 자동차 이름은 5글자 이하로 설정
            if (car.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5글자 이하이어야 합니다.");
            }
        }

        int countOfCars = cars.length;              // split() 메소드를 사용하여 분리한 이름의 개수 -> 자동차 개수

        String[][] carArray = new String[countOfCars][2];   // 자동차 이름과 전진 상태를 2차원 배열로 선언

        for (int i = 0 ; i < countOfCars ; i++) {           // 자동차 이름과 전진 상태 초기화
            carArray[i][0] = cars[i];
            carArray[i][1] = "";
        }

        while (count-- > 0) {                               // 입력한 전진 횟수만큼 자동차 경주 시행
            for (int i = 0; i < countOfCars; i++) {         // 랜덤값이 4이상이면 전진
                int randNum = (int)(Math.random() * 10);
                if (randNum >= 4) {
                    carArray[i][1] += "-";
                }
                System.out.println(carArray[i][0] + " : " + carArray[i][1]);    // 자동차 이름과 전진 상태 출력
            }
            System.out.println();
        }

        int result = 0;       // 배열 내 최대값 초기화

        for (int i = 0; i < countOfCars; i++) {     // 배열 내 최대값 찾기
            if (carArray[i][1].length() > result) {
                result = carArray[i][1].length();
            }
        }

        List<String> winners = new ArrayList<>();

        for (int i = 0; i < countOfCars; i++) {
            if (carArray[i][1].length() == result) {
                winners.add(carArray[i][0]);
            }
        }

        System.out.println(String.join(", ", winners));

    }
}
