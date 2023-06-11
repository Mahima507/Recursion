/*   
p-15 
Inverted Pyramid Pattern
 
 * * * * * *
  * * * * *
   * * * *
    * * *
     * *
      *
  
 */

public class InvertedPyramidPattern {
    // Stack Building Approach
    static void printStars(int stars) {
        if (stars <= 0) {
            return;
        }

        System.out.print("* ");
        printStars(stars - 1);
    }

    static void printSpaces(int spaces) {
        if (spaces == 0) {
            return;
        }

        System.out.print("  ");
        printSpaces(spaces - 1);
    }

    static void printLines(int rows, int spaces) {
        if (rows == 0) {
            return;
        }

        printSpaces(spaces);
        printStars(2 * rows - 3);
        System.out.println();
        printLines(rows - 1, spaces + 1);

    }

    // Stack Falling Approach
    static void printStars_2(int stars_2) {
        if (stars_2 == 0) {
            return;
        }

        printStars_2(stars_2 - 1);
        System.out.print("* ");
    }

    static void printSpaces_2(int spaces_2) {
        if (spaces_2 == 0) {
            return;
        }

        printSpaces_2(spaces_2 - 1);
        System.out.print("  ");

    }

    static void printLines_2(int rows, int stars) {
        if (rows == 0) {
            return;
        }

        printLines_2(rows - 1, stars + 2);
        printSpaces_2(rows - 1);
        printStars_2(stars);
        System.out.println();
    }

    public static void main(String[] args) {
        printLines(5, 0);
        System.out.println();
        printLines_2(5, 1);
    }
}