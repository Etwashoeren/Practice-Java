package ch4.sec02;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        if(score < 90)
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다."); // if 문과는 상관 없는 실행문 -> 중괄호를 생략하고 if 문을 쓰면 이 코드가 그대로 출력된다.
    }
}
