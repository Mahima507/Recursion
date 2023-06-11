/*   
P-3 LeftPyramidPattern

*
* *
* * *
* * * *
* * * * *
 
 */
public class LeftPyramidPattern{
  
    // Stack Building Approach
    static void printStars_2(int stars) {
        if (stars == 0) {
            return;
        }

        System.out.print("* ");
        printStars_2(stars - 1);
    }

    static void printLines_2(int rows, int stars) {
        if (rows == 0) {
            return;
        }

        printStars_2(stars);
        System.out.println();
        printLines_2(rows - 1, stars + 1);
    }

    // Stack Falling Approach
    static void printStars(int rows) {
        if (rows == 0) {
            return;
        }
        printStars(rows - 1);
        System.out.print("* ");
    }

    static void printLines(int rows) {
        if (rows == 0) {
            return;
        }

        printLines(rows - 1);
        printStars(rows);
        System.out.println();
    }

    public static void main(String[] args) {
        printLines(5);
        System.out.println();
        printLines_2(5, 1);
    }
}