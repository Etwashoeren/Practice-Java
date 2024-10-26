package test.apps.racingcar.model;

public class Car {
    private String name;
    private String position;

    public Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이하이어야 합니다.");
        }
        this.name = name;
        this.position = "";
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void move() {
        int randNum = (int) (Math.random() * 10);
        if (randNum >= 4) {
            position += "-";
        }
    }
}
