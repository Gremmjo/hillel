package edu.hillel.hw4;

public class Car {

    private double volumeOfTank;
    private double tankResidue;
    private double fuelСonsumption;


    public Car(double volumeOfTank, double tankResidue, double fuelСonsumption) {
        this.volumeOfTank = volumeOfTank;
        this.tankResidue = tankResidue;
        this.fuelСonsumption = fuelСonsumption;
    }


    public void fillTank(){

       tankResidue += (volumeOfTank - tankResidue);
    }


    public double getReminder(double distance){

        return tankResidue - (distance * fuelСonsumption / 100);
    }

    public double indicationsForRefuling(double distance){

        return volumeOfTank - (tankResidue - distance * fuelСonsumption / 100.0);
    }



    public double getVolumeOfTank() {
        return volumeOfTank;
    }

    public double getTankResidue() {
        return tankResidue;
    }

    public double getFuelСonsumption() {
        return fuelСonsumption;
    }
}
