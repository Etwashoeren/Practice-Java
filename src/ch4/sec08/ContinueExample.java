package ch4.sec08;

public class ContinueExample {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i<=10; i++) {
            if(i % 2 != 0) { // 홀수인 경우
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
