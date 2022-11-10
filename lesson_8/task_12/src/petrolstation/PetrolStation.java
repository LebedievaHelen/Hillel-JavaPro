package petrolstation;

import java.util.concurrent.Semaphore;

public class PetrolStation {

    private static double amount;
    private final Semaphore semaphore = new Semaphore(3);

    public PetrolStation() {
        amount = 100;
    }

    int sleepTime = (int) (Math.random() * (10000 - 3000) + 3000);

    public void runThreads() throws InterruptedException {
        RefuelThread thread1 = new RefuelThread("Car1", 30);
        RefuelThread thread2 = new RefuelThread("Car2", 15);
        RefuelThread thread3 = new RefuelThread("Car3", 40);
        RefuelThread thread4 = new RefuelThread("Car4", 10);
        RefuelThread thread5 = new RefuelThread("Car5", 25);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
    }

    public class RefuelThread extends Thread {

        private final double request;
        private final String name;

        RefuelThread(String name, double request) {
            this.name = name;
            this.request = request;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                doRefuel(request);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }

        synchronized void doRefuel(double request) throws InterruptedException {
            boolean isRefuel = false;
            System.out.println(name + ": Available amount of fuel: " + amount + ". Requested amount of fuel: " + request);
            if (amount >= request) {
                amount -= request;
                isRefuel = true;
            } else {
                System.out.println(name + ": Insufficient amount of fuel");
            }
            if (isRefuel) {
                Thread.sleep(sleepTime);
                System.out.println(name + " Refueling time: " + sleepTime + ". Available amount of fuel after refuel: " + amount);
            }
        }
    }
}
