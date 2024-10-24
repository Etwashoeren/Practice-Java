package test.apps.caculator2;

import test.apps.caculator2.controller.Controller;
import test.apps.caculator2.model.UserInput;
import test.apps.caculator2.service.Calculator;
import test.apps.caculator2.view.UserView;

public class Application {
    public static void main(String[] args) {

        UserInput model = new UserInput();
        Calculator calculator = new Calculator();
        UserView userView = new UserView();
        Controller controller = new Controller(model, calculator, userView);

        controller.run();

    }
}
