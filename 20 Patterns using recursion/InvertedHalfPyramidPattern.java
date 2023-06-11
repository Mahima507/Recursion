// P-4

public class InvertedHalfPyramidPattern {

    static void printStars(int stars) {
        if (stars == 0) {
            return;
        }

        System.out.print("* ");
        printStars(stars - 1);
    }

    static void printLines(int rows) {
        if (rows == 0) {
            return;
        }

        printStars(rows);
        System.out.println();
        printLines(rows - 1);
    }

    // Stack Falling Approach
    static void printStars_2(int stars) {
        if (stars == 0) {
            return;
        }

        printStars_2(stars - 1);
        System.out.print("* ");
    }

    static void printLines_2(int rows, int stars) {
        if (rows == 0) {
            return;
        }

        printLines_2(rows - 1, stars + 1);
        printStars_2(stars);
        System.out.println();
    }

    public static void main(String[] args) {
        printLines(5);
        System.out.println();
        printLines_2(5, 1);
    }

}