package test.apps.racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Car> cars;

    public Race(String[] carNames) {    // 자동차 이름을 파라미터 값으로 전달 받음
        cars = new ArrayList<>();       // 자동차 이름을 넣을 배열 생성
        for (String name : carNames) {
            cars.add(new Car(name));    // cars 배열에 각 자동차의 이름을 넣기
        }
    }

    public void proceedRace(int roundCount) {
        while (roundCount-- > 0) {
            for (Car car : cars) {
                car.move();
            }
        }
    }

    public List<String> getWinners() {
        int maxPosition = cars.stream()
                .mapToInt(car -> car.getPosition().length())    // 스트림을 IntStream 으로 변환해주는 메서드
                .max()                                          // 최대값 반환
                .orElse(0);

        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition().length() == maxPosition) {
                winners.add(car.getName());
            }
        }
        return winners;
    }

    public List<Car> getCars() {
        return cars;
    }
}

