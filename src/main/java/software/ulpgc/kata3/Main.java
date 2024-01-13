package software.ulpgc.kata3;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    CSVCarLoader carLoader = new CSVCarLoader(new File("CarDatabase.csv"));
    List<Car> cars = carLoader.load();
    double[] horsepowerOrganized = new HorsepowerCarOrganizer().organize(cars);

}
}
