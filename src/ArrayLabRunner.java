/**
 * Gautam C
 */

public class ArrayLabRunner {

    public static void main(String[] args) {

        ArrayLab a = new ArrayLab();

        int[] a1 = {0, 1, 2, 3};


        /**
         * Testing reverseOrder
         */
        System.out.println("Testing reverseOrder ...");

        a.reverseOrder(1, 5);

        System.out.println(System.lineSeparator());


        /**
         * Testing passingArrayElement
         */
        System.out.println("Testing passingArrayElement ...");

        a.printArray(a1);

        System.out.println(a.passingArrayElement(a1[1]));

        System.out.println(System.lineSeparator());


        /**
         * Testing passingArray
         */
        System.out.println("Testing passingArray ...");

        int[] a2 = {0, 1, 2, 3, 4, 5};

        a.printArray(a2);

        System.out.println();

        a.printArray(a.passingArray(a2));

        System.out.println(System.lineSeparator());


        /**
         * Testing sumArray
         */
        System.out.println("Testing sumArray ...");

        int[] a3 = {0, 1, 2, 3, 4, 5};

        a.sumArray(a3);

        System.out.println(System.lineSeparator());

        /**
         * Testing moveInts
         */
        System.out.println("Testing moveInts ...");

        a.moveInts(5);

        System.out.println();
        System.out.println();

        a.moveInts(6);

        System.out.println();
        System.out.println();

        a.moveInts(7);

        System.out.println(System.lineSeparator());

        /**
         * Testing diceRollBarGraph
         */
        System.out.println("Testing diceRollBarGraph ...");

        a.diceRollBarGraph();

    }

}
