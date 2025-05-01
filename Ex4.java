public class Ex4 {
    public static void main(String[] args) {
        int popuA = 80000, popuB = 200000;
        int anos = 0;

        while (popuA <= popuB) {
            popuA *= 1.03;
            popuB *= 1.015;
            anos++;
        }

        System.out.println("A população de A ultrapassará B em " + anos + " anos.");
    }
}
