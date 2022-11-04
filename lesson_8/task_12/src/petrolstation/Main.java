package petrolstation;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        PetrolStation station = new PetrolStation(60);

        Thread thread1 = new PetrolStation.RefuelThread(station, 20);
        Thread thread2 = new PetrolStation.RefuelThread(station, 30);
        Thread thread3 = new PetrolStation.RefuelThread(station, 15);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
    }
}
