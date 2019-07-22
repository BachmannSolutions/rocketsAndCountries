package com.BachmannSolutions.Rockets;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;


public class RocketDataReader {
    public RocketDataReader(FileReader s) throws FileNotFoundException {
        String[] row = null;
        String csvFilename = "RocketLaunchSites.csv";

        RocketDataReader countriesDataReader = new RocketDataReader(new FileReader(csvFilename));
        List records = countriesDataReader.readAll();

        for (Object record : records) {
            row = (String[]) record;

            System.out.println(
                    row[1] +
                    " is located in  " + row[2]
                    + " (SATCAT Designation: " + row[0]
                    + "). It is at latitude: " + row[3]
                    + " and longitude: " + row[4]
                    + "the Launch Log Abbreviated Designation is: " + row[5]);
        }
        countriesDataReader.close();
    }

    public List<RocketDataReader> getData() {
        return data;
    }

}