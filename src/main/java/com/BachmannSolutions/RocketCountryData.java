//package com.BachmannSolutions;
//
//import com.opencsv.CSVReader;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class RocketCountryData {
//    public static void main(String[] args) {
//        //CSVReader obj = new CSVReader;
//        //obj run;
//    }
//
//    public void run() {
//        String csv = "countries.csv";
//        String line = "";
//        String csvSplit = ",";
//        String[] country = new String[0];
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(csv));
//            String headerLine = br.readLine();
//
//            while ((line = br.readLine()) != null) {
//                country = line.split(csvSplit);
//                if(country[3].equals("United States")) {
//                    System.out.println("I found United States on row with first column equal to " + country[0]);
//                    System.out.println("The entire row consists of: ");
//                    for(int i = 0; i < country.length; i++) {
//                        System.out.print(country[i] + ", ");
//                    }
//                    System.out.println();
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    //writes output file once rocket sites and countries are compared
//    String line = "";
//    String csvSplit = ",";
//    String[] country = new String[0];
//        try {
//                FileWriter fw = new FileWriter(OUTPUT_LOCATION);
//                String headerLine = fw.readLine();
//
//                while ((line = fw.readLine()) != null) {
//                country = line.split(csvSplit);
//                if (country[3].equals("United States")) {
//                System.out.println("I found United States on row with first column equal to " + country[0]);
//                System.out.println("The entire row consists of: ");
//                for (int i = 0; i < country.length; i++) {
//        System.out.print(country[i] + ", ");
//        }
//        System.out.println();
//        }
//        }
//
//
//
//        fw.write("Rocket Launch sites in United States" + "\n" +
//        "-----------------------------------------------------------------" + "\n");
//        fw.write("I love dick in Megs!");
//        fw.close();
