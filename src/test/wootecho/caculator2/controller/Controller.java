package test.wootecho.caculator2.controller;

import test.wootecho.caculator2.service.Calculator;
import test.wootecho.caculator2.model.UserInput;
import test.wootecho.caculator2.view.UserView;

public class Controller {
    private UserInput model;
    private Calculator calculator;
    private UserView userView;

    public Controller(UserInput model, Calculator calculator, UserView userView) {
        this.model = model;
        this.calculator = calculator;
        this.userView = userView;
    }

    public void run() {
        System.out.println("덧셈할 문자열을 입력.");

        String userInput = model.getInput();

        int result = calculator.calculate(userInput);

        userView.printOutput(result);
    }
}
