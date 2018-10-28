import java.util.Random;

public class Main {

    public static void main(String[] args) {

        var size = 20000;
        var range = 10000;

        BubbleSort bubble = new BubbleSort();
        var a1 = generateArr(size, range);
        long start = System.currentTimeMillis();
        bubble.bubbleSort(a1);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Bubble took " + timeElapsed);

        CountSort count = new CountSort();
        var a2 = generateArr(size, range);
        start = System.currentTimeMillis();
        count.sort(a2, range + 1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Count took " + timeElapsed);
        //printArr(count.sort(generateArr(size, range), range + 1));

        HeapSort heapSort = new HeapSort();
        var a3 = generateArr(size, range);
        start = System.currentTimeMillis();
        heapSort.sort(a3);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("HEAP took " + timeElapsed);
        //printArr(heapSort.sort(generateArr(size, range)));

        InsertionSort insertionSort = new InsertionSort();
        var a4 = generateArr(size, range);
        start = System.currentTimeMillis();
        insertionSort.sort(a4);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Insertion took " + timeElapsed);
        //printArr(insertionSort.sort(generateArr(size, range)));

        MergeSort mergeSort = new MergeSort();
        var a = generateArr(size, range);
        start = System.currentTimeMillis();
        mergeSort.sort(a, 0, size - 1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Merge took " + timeElapsed);
        //printArr(a);

        QuickSort quick = new QuickSort();
        var b = generateArr(size, range);
        start = System.currentTimeMillis();
        quick.sort(b, 0, size - 1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("quick took " + timeElapsed);
        //printArr(b);

        SelectionSort selectionSort = new SelectionSort();
        var a5 = generateArr(size, range);
        start = System.currentTimeMillis();
        selectionSort.sort(a5);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("selection took " + timeElapsed);
        //printArr(selectionSort.sort(generateArr(size, range)));

    }

    static int[] generateArr(int size, int range) {
        int[] arr = new int[size];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(range) + 1;
        }
        return arr;
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
