package test.apps.racingcar.controller;

import test.apps.racingcar.view.RaceView;
import test.apps.racingcar.model.Race;

public class RaceController {
    private Race race;
    private RaceView view;

    public RaceController(RaceView view) {
        this.view = view;
    }

    public void start() {
        String[] carNames = view.getCarNames();
        int roundCount = view.getRaceRoundCount();

        race = new Race(carNames);
        race.proceedRace(roundCount);

        view.displayRaceStatus(race.getCars());
        view.displayWinners(race.getWinners());
    }
}

