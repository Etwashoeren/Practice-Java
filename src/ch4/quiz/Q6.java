package ch4.quiz;

// for 문을 이용하여 다음과 같은 실행 결과가 나오는 코드를 작성
//*
//**
//***
//****
//*****

public class Q6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i ++) {
            for (int j = 0; j < i; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
