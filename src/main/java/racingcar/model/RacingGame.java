package racingcar.model;

import java.util.List;
import racingcar.JudgeWinner;

public class RacingGame {

    private final Cars cars;
    private final JudgeWinner judgeWinner;

    public RacingGame(List<String> names, JudgeWinner judgeWinner){
        this.cars = new Cars(names);
        this.judgeWinner = judgeWinner;
    }

    public void moveOneStep() {
        cars.moveOneStep();
    }

    public List<Car> getStatus(){
        return cars.getCars();
    }

    public List<String> judge(){
        return judgeWinner.judge(cars.getCars());
    }
}
