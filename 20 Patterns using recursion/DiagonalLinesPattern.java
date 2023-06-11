
// P-10

public class DiagonalLinesPattern {
    static void printSpacesOrStars(int spaces) {
        if (spaces == 0) {
            return;
        }

        System.out.print("  ");
        printSpacesOrStars(spaces - 1);
    }

    static void printLines(int rows) {
        if (rows == 0) {
            return;
        }

        printSpacesOrStars(rows - 1);
        System.out.print("* ");
        System.out.println();
        printLines(rows - 1);
    }

    // Stack Falling Approach
    static void printSpacesOrStars_2(int spaces_2) {
        if (spaces_2 == 0) {
            return;
        }

        printSpacesOrStars_2(spaces_2 - 1);
        System.out.print("  ");
    }

    static void printLines_2(int rows, int spaces_2) {
        if (rows == 0) {
            return;
        }

        printLines_2(rows - 1, spaces_2 + 1);
        printSpacesOrStars_2(spaces_2);
        System.out.print("* ");
        System.out.println();
    }

    public static void main(String[] args) {
        printLines(5);
        printLines_2(5, 0);
    }
}