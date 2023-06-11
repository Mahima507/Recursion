public class HollowInvertedPyramidPattern {

    public static void printPattern(int n, int spaces) {
        if (n <= 0) {
            return;
        } else {
            printSpaces(spaces);
            printStars(n);
            System.out.println();
            printPattern(n - 2, spaces + 1);
            printSpaces(spaces);
            printStars(n);
            System.out.println();
        }
    }

    public static void printSpaces(int count) {
        if (count <= 0) {
            return;
        } else {
            System.out.print(" ");
            printSpaces(count - 1);
        }
    }

    public static void printStars(int count) {
        if (count <= 0) {
            return;
        } else {
            System.out.print("*");
            printStars(count - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5; // Number of rows

        printPattern(n * 2 - 1, 0);
    }
}
