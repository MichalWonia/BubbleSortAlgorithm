public class BubbleSortAlgorithm {

    public static void main(String[] args) {

    }

    public static int[] bubbleSort(int[] inputArray) {

        int storage;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length - i; j++) {
                if(inputArray[j+1] > inputArray[j]){
                    storage = inputArray[j+1];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j] = storage;
                }
            }
        }
        return inputArray;
    }
}
