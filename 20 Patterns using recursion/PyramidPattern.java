/*
    PyramidPattern 
    
        *    
      *    *    
    *    *    *    
  *    *    *    *    
*    *    *    *    * 
 
*/

public class PyramidPattern {

    // stack building approach
    static void stars(int stars) {
        if (stars == 0) {
            return;
        }

        System.out.print("*    ");
        stars(stars - 1);
    }

    static void spaces(int spaces) {
        if (spaces == 0) {
            return;
        }
        System.out.print("  ");
        spaces(spaces - 1);
    }

    static void printLines(int rows, int stars) {
        if (rows == 0) {
            return;
        }

        spaces(rows - 1);
        stars(stars);
        System.out.println();
        printLines(rows - 1, stars + 1);

    }

    // Stack falling approach

    static void stars_2(int stars) {
        if (stars == 0) {
            return;
        }

        stars_2(stars - 1);
        System.out.print("*   ");
    }

    static void spaces_2(int spaces) {
        if (spaces == 0) {
            return;
        }

        spaces_2(spaces - 1);
        System.out.print("  ");

    }

    static void printLines_2(int rows, int spaces) {
        if (rows == 0) {
            return;
        }

        printLines_2(rows - 1, spaces + 1);
        spaces_2(spaces);
        stars_2(rows);
        System.out.println();
    }

    public static void main(String[] args) {
        printLines(5, 1);
        System.out.println();
        printLines_2(5, 0);
    }
}