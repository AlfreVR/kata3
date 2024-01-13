package software.ulpgc.kata3;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        CSVCarLoader carLoader = new CSVCarLoader(new File("CarDatabase.csv"));
        List<Car> cars = carLoader.load();
        double[] horsepowerOrganized = new HorsepowerCarOrganizer().organize(cars);

        MainFrame mainFrame = new MainFrame();
        mainFrame.histogramDisplay().show(histogram(horsepowerOrganized));
        mainFrame.setVisible(true);

    }

    private static Histogram histogram(double[] horsepowerOrganized) {
        return new Histogram() {
            @Override
            public int bins() {
                return 10;
            }

            @Override
            public double[] values() {
                return horsepowerOrganized;
            }
        };
    }

}
