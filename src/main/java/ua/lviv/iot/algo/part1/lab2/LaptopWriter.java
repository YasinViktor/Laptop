package ua.lviv.iot.algo.part1.lab2;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class LaptopWriter {
    public void writeToFile(List<AbstractLaptop> abstractLaptops) {
        try {
            if (!abstractLaptops.isEmpty() && !(new Scanner("addingFile.csv").hasNext())) {
                CSVWriter csvWriter = new CSVWriter(new FileWriter("addingFile.csv"));
                for (var object : abstractLaptops) {
                    csvWriter.writeNext(new String[]{
                            object.getHeaders()
                    });
                    csvWriter.writeNext(new String[]{
                            object.toCSV()
                    });
                }
                csvWriter.close();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}