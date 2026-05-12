package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);

    public Dealership getDealership() {
        return dealership;
    }

    public void setDealership(Dealership dealership) {
        this.dealership = dealership;
    }

    Dealership dealership;
    DealershipFileManager myFile = new DealershipFileManager();

    UserInterface(){

    }

    public void display(){
        do {

            System.out.println();
            System.out.println("=== Menu ===");
            System.out.println("1 - Find vehicles within a price range\n" +
                    "2 - Find vehicles by make / model\n" +
                    "3 - Find vehicles by year range\n" +
                    "4 - Find vehicles by color\n" +
                    "5 - Find vehicles by mileage range\n" +
                    "6 - Find vehicles by type (car, truck, SUV, van)\n" +
                    "7 - List ALL vehicles\n" +
                    "8 - Add a vehicle\n" +
                    "9 - Remove a vehicle\n" +
                    "99 - Quit");

            System.out.print("Make your selection: ");
            int userChoice = scanner.nextInt();

            switch (userChoice){
                case 1 -> processGetByPriceRequest();
                case 2 -> processGetByMakeModelRequest();
                case 3 -> processGetByYearRequest();
                case 4 -> processGetByColorRequest();
                case 5 -> processGetByMIleageRequest();
                case 6 -> processGetByVehicleTypeRequest();
                case 7 -> processGetAllVehiclest();
                case 8 -> processAddVehicleRequest();
                case 9 -> processRemoveVehicleRequest();
                case 99 -> {
                    return;
                }

            }

        } while(true);
    }

    public void processGetByPriceRequest(){
        System.out.println("Enter the maximum price of the vehicle you can afford: ");
        double max = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the minimum price of the vehicle you want to buy: ");
        double min = scanner.nextDouble();
        scanner.nextLine();

        dealership.getVehiclesByPrice(min, max);
    }

    public void processGetByMakeModelRequest(){
        System.out.println("Enter the make of the vehicle you want displayed: ");
        String make = scanner.nextLine();

        System.out.println("Enter the model of hte vehicle you want displayed: ");
        String model = scanner.nextLine();

        dealership.getVehiclesByMakeModel(make, model);
    }

    public void processGetByYearRequest(){
        System.out.println("Enter the year of the vehicles you want displayed: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        dealership.getVehiclesByYear(year);
    }

    public void processGetByColorRequest(){
        System.out.println("Enter the color of the vehicles you want displayed: ");
        String color = scanner.nextLine();

        dealership.getVehiclesByColor(color);
    }

    public void processGetByMIleageRequest(){
        System.out.println("Enter the mileage of the vehicles you want displayed: ");
        int mileage = scanner.nextInt();
        scanner.nextLine();

        dealership.getVehiclesByMileage(mileage);
    }

    public void processGetByVehicleTypeRequest() {
        System.out.println("Enter the color of the vehicles you want displayed: ");
        String vehicleType = scanner.nextLine();

        dealership.getVehiclesByType(vehicleType);
    }

    public void processGetAllVehiclest(){


        myFile.getDealershiP();
        dealership.getAllVehicles();
    }

    public void processAddVehicleRequest(){
        dealership.addVehicle();
    }

    public void processRemoveVehicleRequest(){
        System.out.println("Enter the vin number of the vehicle to be removed: ");
        int vin = scanner.nextInt();
        for(Vehicle vehicle: dealership.vehicles){
            if(vehicle.getVin() == vin){
                dealership.removeVehicle(vehicle);
            }
        }

    }

}
