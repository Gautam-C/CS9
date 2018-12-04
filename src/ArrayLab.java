public class ArrayLab {

    public void printArray(int[] intArray) {

        for (int i = 0; i < intArray.length; i++)
            System.out.println(intArray[i]);

    }


    public void reverseOrder(int low, int high) {

        int[] intArray = new int[high - low + 1];

        for (int i = 0; i < intArray.length; i++) {

            intArray[i] = low + i;

        }

        for (int i = 0; i > intArray.length; i--)
            System.out.println(intArray[i]);

    }


    public int passingArrayElement(int sample) { return sample + 5;}


}
