package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Dealership dealership;

    UserInterface(){
        dealership = new Dealership();
    }

    public void display(){
        System.out.println(dealership.vehicles);
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

    public void processGetByPriceRequest(){
        System.out.println("Enter the maximum price of the vehicle you can afford: ");
        double max = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the minimum price of the vehicle you want to buy: ");
        double min = scanner.nextDouble();
        scanner.nextLine();

        dealership.getVehiclesByPrice(min, max);
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
