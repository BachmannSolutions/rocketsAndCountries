package com.BachmannSolutions.Country;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class CountriesDataReader {
    private ArrayList<CountryRecord > data = new ArrayList<>();

    public CountriesDataReader(FileReader csvFilename) throws FileNotFoundException {
        String[] row = null;

        CountriesDataReader countriesDataReader = new CountriesDataReader(new FileReader("countries.csv"));
        List records = countriesDataReader.readAll();

        for (Object record : records) {
            row = (String[]) record;

            CountryRecord ufoSighting = new CountryRecord();

            data.add(ufoSighting);

            System.out.println(
                    "the country, " + row[3]
                    + " (" + row[0]
                    + "), is at latitude: " + row[1]
                    + " and longitude: " + row[2]);
        }
        countriesDataReader.close();
    }

    public List<CountriesDataReader> getData() {
        return data;
    }

}