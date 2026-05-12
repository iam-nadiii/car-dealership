package com.pluralsight;

public class App {
    public static void main(String[] args) {
        DealershipFileManager myDealershipFileManger = new DealershipFileManager();
        Dealership dealership = myDealershipFileManger.getDealershiP();
        UserInterface myApp = new UserInterface();
        myApp.setDealership(dealership);

//        myApp.processAddVehicleRequest();
//        myApp.processAddVehicleRequest();
//        myApp.display();
//        myApp.processRemoveVehicleRequest();

        myApp.display();
    }
}
