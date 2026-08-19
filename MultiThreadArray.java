import java.util.Arrays;
import java.util.Random;

class ArrayGeneration implements Runnable {
    private int[] arr;

    public ArrayGeneration(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        System.out.println("Generated Array: " + Arrays.toString(arr));
    }
}

class AscendingSorter implements Runnable {
    private int[] arr;

    public AscendingSorter(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int[] copy = Arrays.copyOf(arr, arr.length);

        Arrays.sort(copy);

        System.out.println("Ascending Order: " + Arrays.toString(copy));
    }
}

class DescendingSorter implements Runnable {
    private int[] arr;

    public DescendingSorter(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int[] copy = Arrays.copyOf(arr, arr.length);

        Arrays.sort(copy);

        // Reverse the sorted array
        for (int i = 0; i < copy.length / 2; i++) {
            int temp = copy[i];
            copy[i] = copy[copy.length - 1 - i];
            copy[copy.length - 1 - i] = temp;
        }

        System.out.println("Descending Order: " + Arrays.toString(copy));
    }
}

public class MultiThreadArray {
    public static void main(String[] args) throws InterruptedException {

        int[] arr = new int[10];

        // Thread for generating the array
        Thread generator = new Thread(new ArrayGeneration(arr));
        generator.start();

        // Wait for array generation to finish
        generator.join();

        // Threads for sorting
        Thread ascSorter = new Thread(new AscendingSorter(arr));
        Thread descSorter = new Thread(new DescendingSorter(arr));

        ascSorter.start();
        descSorter.start();

        // Wait for sorting threads to finish
        ascSorter.join();
        descSorter.join();
    }
}
