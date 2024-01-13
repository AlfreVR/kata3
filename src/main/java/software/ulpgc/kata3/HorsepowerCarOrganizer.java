package software.ulpgc.kata3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HorsepowerCarOrganizer implements CarOrganizer{
    @Override
    public double[] organize(List<Car> carList) {
        double[] horsepower = new double[carList.size()];
        int i = 0;
        for (Car car : carList ) {
            double hp = car.getHp();
            horsepower[i]=hp;
            i++;
        }

        return horsepower;
    }

    private Integer minimun(int hp) {
        return (hp / 50) *50;
    }
}
