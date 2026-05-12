package com.pluralsight;

import java.io.*;

public class DealershipFileManager {
    public Dealership getDealershiP(){
        Dealership dealership = new Dealership();
        try{
            FileReader fileReader = new FileReader("inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            bufferedReader.readLine();



            String input;

            while((input = bufferedReader.readLine()) != null){
                String[] attributes = input.split("\\|");

                int vin = Integer.parseInt(attributes[0]);
                int year = Integer.parseInt(attributes[1]);
                String make = attributes[2];
                String model = attributes[3];
                String vehicleType = attributes[4];
                String color = attributes[5];
                int odometer = Integer.parseInt(attributes[6]);
                double price = Double.parseDouble(attributes[7]);

                dealership.vehicles.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));



            }


        } catch (IOException e){
            e.printStackTrace();
        }

        return dealership;
    }


    public void saveDealership(Dealership dealership){

        try {
            FileWriter fileWriter = new FileWriter("inventory.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }




}
