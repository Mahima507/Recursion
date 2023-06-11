// P-16
public class HollowInverted {

    static void printStarsOrSpaces(int rows, int starsOrSpaces) {
        if (starsOrSpaces == 0) {
            return;
        }

        printStarsOrSpaces(rows, starsOrSpaces - 1);
        if (rows == 1) {
            System.out.print("* ");
        }

        else if (rows == starsOrSpaces || rows + starsOrSpaces == 10) {
            System.out.print("* ");
        }

        else {
            System.out.print("  ");
        }

    }

    static void printLines(int rows, int starOrSpaces) {
        if (rows == 0) {
            return;
        }

        printLines(rows - 1, starOrSpaces);
        printStarsOrSpaces(rows, starOrSpaces);
        System.out.println();
    }

    public static void main(String[] args) {
        // int n = 5 2rows - 1;
        printLines(5, 9);
    }
}