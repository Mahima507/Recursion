/* 
Right Pascal Pattern
*
**
***
****
*****
****
***
**
*

 
 */
class RightPascalPattern {
    // Stack Falling
    static void printStars(int stars) {
        if (stars == 0) {
            return;
        }

        System.out.print("*");
        printStars(stars - 1);
    }

    static void printLines(int rows) {
        if (rows == 0) {
            return;
        }

        printLines(rows - 1);
        printStars(rows);
        System.out.println();

    }

    // Stack Building
    static void printDownStars(int downStars) {
        if (downStars == 0) {
            return;
        }
        System.out.print("*");
        printDownStars(downStars - 1);
    }

    static void printDownLines(int rows, int stars) {
        if (rows == 0) {
            return;
        }

        printDownLines(rows - 1, stars + 1);
        printStars(stars);
        System.out.println();
    }

    public static void main(String[] args) {
        printLines(5);
        printDownLines(5, 0);
    }
}