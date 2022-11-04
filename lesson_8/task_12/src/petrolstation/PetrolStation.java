package petrolstation;

public class PetrolStation {

    private static double amount;

    PetrolStation(double amount) {
        PetrolStation.amount = amount;
    }

    public static class RefuelThread extends Thread {

        private final PetrolStation station;
        private final double request;

        RefuelThread(PetrolStation station, double request) {
            this.station = station;
            this.request = request;
        }

        @Override
        public void run() {
            try {
                sleep((long) (Math.random() * 7000 + 3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            station.doRefuel(request);
        }
    }

    synchronized void doRefuel(double request) {
        System.out.println(Thread.currentThread().getName() + ": available amount of fuel: " + amount);
        if (amount >= request) {
            amount -= request;
            System.out.println(Thread.currentThread().getName() + ": available amount of fuel: " + amount);
        } else {
            System.out.println(Thread.currentThread().getName() + ": insufficient amount of fuel");
        }
    }
}
