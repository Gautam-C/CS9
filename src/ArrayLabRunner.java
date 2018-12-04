public class ArrayLabRunner {

    public static void main(String[] args) {

        ArrayLab a = new ArrayLab();

        int[] a1 = {0, 1, 2, 3};

        a.reverseOrder(1, 5);

        for (int i = 0; i < a1.length; i++)
            System.out.println(a1[i]);

        System.out.println(a.passingArrayElement(a1[1]));
    }

}
