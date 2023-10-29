package racingcar;

import java.util.ArrayList;
import java.util.List;
import racingcar.model.Car;

public class JudgeWinnerImpl implements JudgeWinner {
    @Override
    public List<String> judge(List<Car> cars) {
        int maxStep = getMaxStep(cars);

        return cars.stream()
                .filter(car -> car.getStep() == maxStep)
                .map(Car::getName)
                .toList();
    }

    private int getMaxStep(List<Car> cars) {
        return cars.stream()
                .mapToInt(Car::getStep)
                .max()
                .orElse(0);
    }
}
