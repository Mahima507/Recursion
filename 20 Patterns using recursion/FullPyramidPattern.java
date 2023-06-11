// P-9
public class FullPyramidPattern {
    // Stack Building Approach
    static void upperStars(int stars) {
        if (stars == 0) {
            return;
        }
        System.out.print("* ");
        upperStars(stars - 1);
    }

    static void upperSpaces(int spaces) {
        if (spaces == 0) {
            return;
        }

        System.out.print("  ");
        upperSpaces(spaces - 1);
    }

    static void printLines(int rows, int stars) {
        if (rows == 0) {
            return;
        }

        upperSpaces(rows - 1);
        upperStars(2 * stars - 1);
        System.out.println();

        printLines(rows - 1, stars + 1);

    }

    static void printLowerLines(int rows, int spaces) {
        if (rows == 0) {
            return;
        }

        upperSpaces(spaces);
        upperStars(2 * rows - 1);
        System.out.println();
        printLowerLines(rows - 1, spaces + 1);

    }

    // Stack Falling Approach
    static void stars_2(int stars_2) {
        if (stars_2 == 0) {
            return;
        }

        stars_2(stars_2 - 1);
        System.out.print("* ");
    }

    static void spaces_2(int spaces_2) {
        if (spaces_2 == 0) {
            return;
        }

        spaces_2(spaces_2 - 1);
        System.out.print("  ");
        return;
    }

    static void printLines_2(int rows, int spaces_2) {
        if (rows == 0) {
            return;
        }

        printLines_2(rows - 1, spaces_2 + 1);
        spaces_2(spaces_2);
        stars_2(2 * rows - 1);
        System.out.println();
    }

    // For printing lower lines
    static void printDownLines_2(int rows, int stars_2) {
        if (rows == 0) {
            return;
        }

        printDownLines_2(rows - 1, stars_2 + 1);
        spaces_2(rows);
        stars_2(2 * stars_2 - 1);
        System.out.println();
    }

    public static void main(String[] args) {
        printLines(3, 1);
        printLowerLines(2, 1);
        System.out.println();
        printLines_2(3, 0);
        printDownLines_2(2, 1);
    }
}