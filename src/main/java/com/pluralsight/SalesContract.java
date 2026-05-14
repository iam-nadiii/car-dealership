package com.pluralsight;

public class SalesContract extends Contract {

    private double salesTaxAmount = .05;
    private double recordingFee = 100;
    private double processingFee;

    public boolean isWantsToFinance() {
        return wantsToFinance;
    }

    public void setWantsToFinance(boolean wantsToFinance) {
        this.wantsToFinance = wantsToFinance;
    }

    private boolean wantsToFinance;


    public SalesContract(double salesTaxAmount, double recordingFee, double processingFee){
        setSalesTaxAmount();
        setRecordingFee();
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(Vehicle vehicle) {
        if (vehicle.getPrice() < 10_000) this.processingFee = 295;
        else {
            this.processingFee = 495;
        }
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee() {
        this.recordingFee = 100;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount() {
        this.salesTaxAmount = .05;
    }




    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}




//A SalesContract will include the following additional information:
//        • Sales Tax Amount (5%)
//• Recording Fee ($100)
//• Processing fee ($295 for vehicles under $10,000 and $495 for all others

//        • Whether they want to finance (yes/no)


//• Monthly payment (if financed) based on:
//        • All loans are at 4.25% for 48 months if the price is $10,000 or more
//• Otherwise they are at 5.25% for 24 month
//4
//Methods will include a constructor and getters and setters for all fields except total
//price and monthly payment.
//You should provide overrides for getTotalPrice() and getMonthlyPayment() that will
//return computed values based on the rules above. It is possible that
//getMonthlyPayment() would return 0 if they chose the NO loan option.