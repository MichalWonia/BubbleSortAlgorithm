public class BubbleSortAlgorithm {

    public static void main(String[] args) {

        int[] unsortedArray = {5, 13, 1, 6, 98, 0, 12, 23, 65, 11, 12};
        int[] sortedArray;

        System.out.println("Unsorted array:");
        for (Integer integer : unsortedArray) {
            System.out.print(integer + " ");
        }

        sortedArray = bubbleSort(unsortedArray);

        System.out.println("\nSorted array: ");
        for (Integer integer : sortedArray) {
            System.out.print(integer + " ");
        }
    }

    public static int[] bubbleSort(int[] inputArray) {

        int storage;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length - i - 1; j++) {
                if (inputArray[j + 1] > inputArray[j]) {
                    storage = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = storage;
                }
            }
        }
        return inputArray;
    }
}
