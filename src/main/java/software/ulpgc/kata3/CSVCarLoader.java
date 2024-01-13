package software.ulpgc.kata3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSVCarLoader implements CarLoader{
    private final File file;

    public CSVCarLoader(File file) {
        this.file = file;
    }


    @Override
    public List<Car> load() {
        try {
            return load(new FileReader(file));
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }

    private List<Car> load(FileReader fileReader) throws IOException {
        return load(new BufferedReader(fileReader));
    }

    private List<Car> load(BufferedReader bufferedReader) throws IOException {
        List<Car> cars = new ArrayList<>();
        String line = bufferedReader.readLine();
        while((line = bufferedReader.readLine())!= null){
            Car car = toCar(line);
            cars.add(car);

        }
        return cars;
    }

    private Car toCar(String line) {
        return toCar(line.split(";"));
    }

    private Car toCar(String[] split) {
        return new Car(
                split[0],
                Double.parseDouble(split[1]),
                Integer.parseInt(split[2]),
                Double.parseDouble(split[3]),
                Integer.parseInt(split[4]),
                Double.parseDouble(split[5]),
                Double.parseDouble(split[6]),
                Double.parseDouble(split[7]),
                Integer.parseInt(split[8]),
                Integer.parseInt(split[9]),
                Integer.parseInt(split[10]),
                Integer.parseInt(split[11])
        );
    }
}
