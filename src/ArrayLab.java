/**
 * Gautam C
 */

public class ArrayLab {

    /**
     * prints a specified int[] to the console
     *
     * @param "int[]" intArray
     */
    public void printArray(int[] intArray) {

        for (int i = 0; i < intArray.length; i++)
            System.out.print(intArray[i]);

    }

    /**
     * makes an int[] with the specified lowest and highest ints as the lowest and highest index respectively,
     * and everything in between, in between.
     *
     * @param "int" low
     * @param "int" high
     *
     * return void
     */
    public void reverseOrder(int low, int high) {

        int[] intArray = new int[high - low + 1];

        for (int i = 0; i < intArray.length; i++) {

            intArray[i] = low + i;

        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
        }

    }

    /**
     * returns five + the element at the specified index of the array
     *
     * @param "int" sample
     * @return int
     */
    public int passingArrayElement(int sample) {

        return sample + 5;

    }

    /**
     * adds five to each element of the array
     *
     * @param "int[]" input
     * @return int[]
     */
    public int[] passingArray(int[] input) {

        for (int i = 0; i < input.length; i++) {

            input[i] += 5;

        }

        return input;
    }

    /**
     * Prints the sum of all the elements,
     * as well as the sum of all the even elements
     * as well as the sum of all the odd elements.
     *
     * @param "int[]" input
     *
     * returns void
     */
    public void sumArray(int[] input) {

        int sum = 0;
        int eSum = 0;
        int oSum = 0;

        for (int i = 0; i < input.length; i++) {

            sum += input[i];

            if (sum % 2 != 0) {

                oSum += input[i];

            } else {

                eSum += input[i];

            }
        }

        System.out.println("Sum : " + sum +" " + "Sum of evens : " + eSum + " " + "Sum of odds : " + oSum);

    }


    /**
     * makes an int array with x length, with each index being the element and then prints it
     * then squares all the elements in the array and prints it
     * then moves all the elements in the array to the left and prints it
     * then sets the array back to being each element being its index and then prints it
     * finally moves all the elements in the array to the right and prints it
     *
     * @param "int" x
     *
     * returns void
     */
    public void moveInts(int x) {

        int[] xA = new int[x];

        for (int i = 0; i < x; i++) {
            xA[i] = i;
        }

        printArray(xA);
        System.out.println();

        for (int i = 0; i < x; i++) {
            xA[i] = (int)(Math.pow(i, 2));
        }

        printArray(xA);
        System.out.println();

        int tmp = 0;

        for (int i = 0; i < x-1; i++) {

            tmp = xA[i];

            xA[i] = xA[(i + 1) % x];

            xA[(i + 1) % x] = tmp;

        }

        printArray(xA);
        System.out.println();

        for (int i = 0; i < x; i++) {
            xA[i] = i;
        }

        printArray(xA);
        System.out.println();

        int tmp2 = 0;

        for (int i = x-1; i > 0; i--) {

            tmp2 = xA[i];

            xA[i] = xA[(i + 1) % x];

            xA[(i + 1) % x] = tmp2;

        }

        printArray(xA);

    }

    /**
     * rolls 2 dice 100 times and gives the distribution of their sum in a bar graph
     *
     * returns void
     */
    public void diceRollBarGraph() {

        int d0 = 0;

        int d1 = 0;

        int[] sum = new int[11];

        for (int i = 0; i < 100; i++) {

            d0 = (int) (Math.random() * 12) + 1;

            d1 = (int) (Math.random() * 12) + 1;

            for (int i1 = 0; i1 < sum.length; i1++) {

                if (d0 == (i1 + 2))
                    sum[i1] += 1;

                if (d1 == (i1 + 2))
                    sum[i1] += 1;
            }

        }

        for (int i3 = 0; i3 < sum.length; i3++) {

            System.out.println();
            System.out.print((i3 + 2) + ": ");
            for(int i4 = 0; i4 < sum[i3]; i4++) {
                System.out.print("*");
            }

        }

    }
}
