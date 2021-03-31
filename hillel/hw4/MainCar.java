package edu.hillel.hw4;

public class MainCar {

    public static void main(String[] args) {

        double fuelCost = Double.valueOf(args[0]);
        double routeCost ;
        double toppedUpFuel = 0;
        double firstStatement = 177.8d;
        double secondStatement = 153.3d;
        double thirdSecond = 148.3d;

        Car bmv = new Car(60.0d, 60.0d, 10.0d);

        System.out.println("Если бак не полон, нужно дозаправится!");
        if (bmv.getVolumeOfTank() != bmv.getTankResidue()) {
            System.out.println("Для полного бака нужно дозаправить - " +
                    (bmv.getVolumeOfTank() - bmv.getTankResidue()) + " на сумму " +
                    (bmv.getVolumeOfTank() - bmv.getTankResidue()) * fuelCost);
            toppedUpFuel = bmv.getVolumeOfTank() - bmv.getTankResidue();
            bmv.fillTank();
        }

        System.out.println("Остановка в Кривом озере для дозаправки. " +
                "Остаток топлива - " + bmv.getReminder(firstStatement));
        System.out.println("Требуется дозоправка - " + bmv.indicationsForRefuling(firstStatement));
        toppedUpFuel += bmv.indicationsForRefuling(firstStatement);

        System.out.println("Остановка в Жашкове для дозаправки. " +
                "Остаток топлива - " + bmv.getReminder(secondStatement));
        System.out.println("Требуется дозоправка - " + bmv.indicationsForRefuling(secondStatement));
        toppedUpFuel += bmv.indicationsForRefuling(secondStatement);

        System.out.println("Остановка в Киеве для дозаправки. " +
                "Остаток топлива - " + bmv.getReminder(thirdSecond));
        System.out.println("Требуется дозоправка - " + bmv.indicationsForRefuling(thirdSecond));
        toppedUpFuel += bmv.indicationsForRefuling(thirdSecond);

        System.out.println("Всего было дозаправлено " + toppedUpFuel + " литров");
        routeCost = toppedUpFuel * fuelCost;
        System.out.println("Стоимость полной поездки составила - " + routeCost);




    }
}
