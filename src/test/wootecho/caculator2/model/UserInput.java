package test.wootecho.caculator2.model;

import java.util.Scanner;

public class UserInput {

    public String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
