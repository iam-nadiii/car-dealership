package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String address;
    private String phone;
    public ArrayList<Vehicle> vehicles;

    public Dealership(){
        vehicles = new ArrayList<>();
    }



    Dealership(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
        vehicles = new ArrayList<>();

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }


    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        ArrayList<Vehicle> desiredVehiclesList = new ArrayList<>();

        for(Vehicle vehicle: vehicles){
            if(vehicle.getPrice() >= min && vehicle.getPrice() <= max){
                desiredVehiclesList.add(vehicle);
            }
        }
        return desiredVehiclesList;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        ArrayList<Vehicle> desiredVehiclesList = new ArrayList<>();

        for(Vehicle vehicle: vehicles){
            if(vehicle.getMake().equalsIgnoreCase(make)
                    && vehicle.getModel().equalsIgnoreCase(model)){
                desiredVehiclesList.add(vehicle);
            }
        }
        return desiredVehiclesList;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int year){
        ArrayList<Vehicle> desiredVehiclesList = new ArrayList<>();

        for(Vehicle vehicle: vehicles){
            if(vehicle.getYear() == year){
                desiredVehiclesList.add(vehicle);
            }
        }
        return desiredVehiclesList;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color){
        ArrayList<Vehicle> desiredVehiclesList = new ArrayList<>();

        for(Vehicle vehicle: vehicles){
            if(vehicle.getColor().equalsIgnoreCase(color)){
                desiredVehiclesList.add(vehicle);
            }
        }
        return desiredVehiclesList;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int mileage){
        ArrayList<Vehicle> desiredVehiclesList = new ArrayList<>();

        for(Vehicle vehicle: vehicles){
            if(vehicle.getOdometer() == mileage){
                desiredVehiclesList.add(vehicle);
            }
        }
        return desiredVehiclesList;
    }

    public ArrayList<Vehicle> getVehiclesByType(String type){
        ArrayList<Vehicle> desiredVehiclesList = new ArrayList<>();

        for(Vehicle vehicle: vehicles){
            if(vehicle.getVehicleType().equalsIgnoreCase(type)){
                desiredVehiclesList.add(vehicle);
            }
        }
        return desiredVehiclesList;
    }

    public ArrayList<Vehicle> getAllVehicles(){

        return vehicles;
    }

    public void addVehicle(){
        System.out.println("Enter vehicle make: ");
        String make = scanner.nextLine();

        System.out.println("Enter vehicle model: ");
        String model= scanner.nextLine();

        System.out.println("Enter vin number: ");
        int vin = scanner.nextInt();

        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter vehicle type: ");
        String vehicleType = scanner.nextLine();

        System.out.println("Enter vehicle color: ");
        String color = scanner.nextLine();

        System.out.println("Enter mileage: ");
        int odometer = scanner.nextInt();

        System.out.println("Enter vehicle price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        vehicles.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));

        try {
            FileWriter fileWriter = new FileWriter("inventory.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //            D & B Used Cars|111 Old Benbrook Rd|817-555-5555
//            10112|1993|Ford|Explorer|SUV|Red|525123|995.00
//            37846|2001|Ford|Ranger|truck|Yellow|172544|1995.00
//            44901|2012|Honda|Civic|SUV|Gray|103221|6995.00

            bufferedWriter.write(vin + "|" + year + "|" + make + "|" + model + "|" + vehicleType + "|"
                + color + "|" + odometer + "|" + price);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
        System.out.println("Vehicle successfully removed!");
    }


}
