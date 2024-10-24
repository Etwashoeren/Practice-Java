package ch4.quiz;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int account = 0;

        while(run) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");

            String input = sc.nextLine();

            if (input.equals("1")) {
                System.out.print("예금액>");
                account = Integer.parseInt(sc.nextLine());
            }
            else if (input.equals("2")) {
                System.out.print("출금액>");
                account -= Integer.parseInt(sc.nextLine());
            }
            else if (input.equals("3")) {
                System.out.println("잔고>" + account);
            }
            else if (input.equals("4")) {
                run = false;
            }

//            switch (input) {
//                case "1" -> {
//                    System.out.print("예금액>");
//                    account = Integer.parseInt(sc.nextLine());
//                    break;
//                }
//                case "2" -> {
//                    System.out.print("출금액>");
//                    account -= Integer.parseInt(sc.nextLine());
//                    break;
//                }
//                case "3" -> {
//                    System.out.println("잔고>" + account);
//                    break;
//                }
//                case "4" -> run = false;
//            }
//            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
