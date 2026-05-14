package com.pluralsight;

public abstract class Contract {
    private String date;
    private String customerName;
    private String email;
    private Vehicle vehicleSold;
    private double totalPrice;
    private double monthlyPayment;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Vehicle getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(Vehicle vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public abstract double getTotalPrice();

    public abstract double getMonthlyPayment();





}



//A Contract will hold information common to all contacts. It should be an abstract
//class as you can't create a generic contract.
//        • Date (as string) of contract
//• Customer name
//• Customer email
//• Vehicle sold
//• Total price
//• Monthly payment
//Methods will include a constructor and getters and setters for all fields except total
//price and monthly payment.
//You should define abstract methods for getTotalPrice() and
//getMonthlyPayment() that will return computed values based on contract type.





//A LeaseContract will include the following additional information:
//        • Expected Ending Value (50% of the original price)
//• Lease Fee (7% of the original price)
//• Monthly payment based on
//• All leases are financed at 4.0% for 36 months
//Methods will include a constructor and getters and setters for all fields except total
//price and monthly payment.
//You should provide overrides for getTotalPrice() and getMonthlyPayment()
//that will return computed values based on the rules above