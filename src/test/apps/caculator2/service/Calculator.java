package test.apps.caculator2.service;

public class Calculator {

    public int calculate(String input) {
        // 빈 문자열이면 0 반환
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] tokens = getStrings(input);

        return sum(tokens);
    }

    private String[] getStrings(String input) {
        String delimiter = "[,:]"; // 기본 구분자 쉼표(,) 또는 콜론(:)
        String numbers = input;

        // 커스텀 구분자가 있는지 확인
        if (input.startsWith("//")) {
            int delimiterEndIndex = input.indexOf("\\n");
            if (delimiterEndIndex != -1) {
                // 커스텀 구분자 설정
                delimiter = input.substring(2, delimiterEndIndex);
                // 구분자를 제외한 숫자 문자열 추출
                numbers = input.substring(delimiterEndIndex + 2);
            }
        }

        // 구분자를 기준으로 문자열 분리
        String[] tokens = numbers.split(delimiter);
        return tokens;
    }

    private int sum(String[] tokens) {
        int sum = 0;
        try {
            for (String token : tokens) {
                if (!token.trim().isEmpty()) { // 공백 제거 후 빈 문자열이 아니면 처리
                    sum += Integer.parseInt(token.trim());
                }
            }
        } catch (NumberFormatException e) {
            // 숫자가 아닌 입력이 있을 경우 IllegalArgumentException 발생
            throw new IllegalArgumentException("잘못된 입력값입니다.");
        }

        return sum;
    }

}
