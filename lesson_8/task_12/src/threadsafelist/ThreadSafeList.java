package threadsafelist;

import java.util.ArrayList;

public class ThreadSafeList extends Thread {

    public static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Thread addFlow = new Thread(new AddFlow());
        Thread removeFlow = new Thread(new RemoveFlow());
        Thread getFlow = new Thread(new GetFlow());

        addFlow.start();
        removeFlow.start();
        getFlow.start();

        try {
            addFlow.join();
            removeFlow.join();
            getFlow.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class AddFlow implements Runnable {

        @Override
        public void run() {
            list.add("element 0");
            list.add("element 1");
            System.out.println(list);
        }
    }

    static class RemoveFlow implements Runnable {

        @Override
        public void run() {
            list.remove(0);
            System.out.println(list);
        }
    }

    static class GetFlow implements Runnable {

        @Override
        public void run() {
            System.out.println(list.get(0));
        }
    }
}


