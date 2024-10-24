package test.wootecho.caculator2;

import test.wootecho.caculator2.controller.Controller;
import test.wootecho.caculator2.model.UserInput;
import test.wootecho.caculator2.service.Calculator;
import test.wootecho.caculator2.view.UserView;

public class Application {
    public static void main(String[] args) {

        UserInput model = new UserInput();
        Calculator calculator = new Calculator();
        UserView userView = new UserView();
        Controller controller = new Controller(model, calculator, userView);

        controller.run();

    }
}
