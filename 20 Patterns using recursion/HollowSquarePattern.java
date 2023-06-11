// P-2
public class HollowSquarePattern {
    // Stack building approach
    static void printStars(int rows, int stars) {
        if (stars == 0) {
            return;
        }

        if (rows == 5 || rows == 1) {
            System.out.print("* ");
        }

        else {
            if (stars == 5 || stars == 1) {
                System.out.print("* ");
            }

            else {
                System.out.print("  ");
            }
        }

        printStars(rows, stars - 1);
    }

    static void printLines(int rows, int stars) {
        if (rows == 0) {
            return;
        }

        printStars(rows, stars);
        System.out.println();
        printLines(rows - 1, stars);
    }

    // Stack Falling Approach
    static void printStars_2(int rows, int stars) {
        if (stars == 0) {
            return;
        }

        printStars_2(rows, stars - 1);
        if (rows == 5 || rows == 1) {
            System.out.print("* ");
        }

        else {
            if (stars == 5 || stars == 1) {
                System.out.print("* ");
            }

            else {
                System.out.print("  ");
            }
        }

    }

    static void printLines_2(int rows, int stars) {
        if (rows == 0) {
            return;
        }

        printLines_2(rows - 1, stars);
        printStars_2(rows, stars);
        System.out.println();
    }

    public static void main(String[] args) {
        printLines(5, 5);
        System.out.println();
        printLines_2(5, 5);
    }
}