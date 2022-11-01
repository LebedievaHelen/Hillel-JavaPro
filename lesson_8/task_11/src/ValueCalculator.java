public class ValueCalculator {

    private static float[] array;
    private static final int size = 1000000;
    private static final int halfSize = size / 2;

    public void doCalc() {
        long start = System.currentTimeMillis();

        array = new float[size];
        for (int i = 0; i < size; i++) {
            array[i] = 1;
        }

        float[] newArray1 = new float[halfSize];
        float[] newArray2 = new float[halfSize];

        System.arraycopy(array, 0, newArray1, 0, halfSize);
        System.arraycopy(array, halfSize, newArray2, 0, halfSize);

        ArrayThread thread1 = new ArrayThread("newArray1", newArray1);
        ArrayThread thread2 = new ArrayThread("newArray2", newArray2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        newArray1 = thread1.getArray();
        newArray2 = thread2.getArray();

        System.arraycopy(newArray1, 0, array, 0, halfSize);
        System.arraycopy(newArray2, 0, array, halfSize, halfSize);

        long doCalcTime = System.currentTimeMillis() - start;

        System.out.printf("Time from start to end of program = %d%n", doCalcTime);
    }
}

class ArrayThread extends Thread {

    private final float[] array;

    ArrayThread(String name, float[] array) {
        super(name);
        this.array = array;
    }

    @Override
    public void run() {
        calculate();
    }

    private void calculate() {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    float[] getArray() {
        return array;
    }
}

