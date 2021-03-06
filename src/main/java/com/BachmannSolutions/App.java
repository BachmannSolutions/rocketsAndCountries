package com.BachmannSolutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    private static final String OUTPUT_LOCATION = "outputData.csv";
    private static List<String> results = new ArrayList<>();
    private static List<String> results2 = new ArrayList<>();

    public static void main(String[] args) {

        //User screen, once app is ran
        System.out.println();
        System.out.println("Rocket Launch sites in the United States");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("With the news surrounding SpaceX and other companies competing to ");
        System.out.println("acquire the final bids from NASA, I have compiled data of every ");
        System.out.println("country and launch site around the globe, then compared to see all ");
        System.out.println("launch sites located in the United States.");
        System.out.println("\n");

        //isolate the countries to only pull the United States
        String csv = "countries.csv";
        String line = "";
        String csvSplit = ",";
        String[] country = new String[0];
        try {
            BufferedReader br = new BufferedReader(new FileReader(csv));
            String headerLine = br.readLine();

            while ((line = br.readLine()) != null) {
                country = line.split(csvSplit);
                if(country[0].equals("US")) {
                    System.out.println("Did you know the initials, " + country[0] +  ", is for this country: " + country[3]);
                    System.out.println("The entire row consists of: ");
                    for(int i = 0; i < country.length; i++) {
                        System.out.print(country[i] + " ");
                    }
                    System.out.println("\n" +"\n");
                }
            }
            results2.add(Arrays.toString(country));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //bump the pull above where you found the index for US and find rocket launch sites in the United States
        String csv2 = "rocketLaunchSites.csv";
        String line2 = "";
        String csvSplit2 = ",";
        String[] country2 = new String[0];
        try {
            BufferedReader br = new BufferedReader(new FileReader(csv2));
            String headerLine = br.readLine();

            while ((line2 = br.readLine()) != null) {
                country2 = line2.split(csvSplit2);
                results.add(Arrays.toString(country2));
                if(country2[2].equals(country[0].equals("US"))) {
                    System.out.println("Did you know there is a rocket launch site in " + country2[2] +  ", is: " + country2[1]);
                    System.out.println("The entire row consists of: ");
                    for(int i = 0; i < country2.length; i++) {
                        System.out.print(country2[i] + " ");
                    }
                    System.out.println("\n" +"\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        //writes output file once rocket sites and countries are compared
        try {
            FileWriter fw = new FileWriter(OUTPUT_LOCATION);
            fw.write("Rocket Launch sites in United States" + "\n" +
                "-----------------------------------------------------------------" + "\n");
            for (String result : results) {
                fw.write(result);
            }            fw.close();
        } catch(Exception e){
            System.out.println(e);
        }

        System.out.println("The file has been successfully loaded to " + OUTPUT_LOCATION);
        System.out.println();
    }
}