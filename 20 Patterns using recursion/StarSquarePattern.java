 /*
P-1
StarSquarePattern 

* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
 
*/
class StarSquarePattern {
   
    // Stack Building Approach
    static void printStar(int stars) {
        if (stars == 0) {
            return;
        }

        printStar(stars - 1);
        System.out.print("* ");
        return;
    }

    static void printLine(int rows, int stars) {
        if (rows == 0) {
            return;
        }

        printLine(rows - 1, stars);
        printStar(stars);
        System.out.println();
    }

    // Stack Falling Approach
    static void printStar_2(int stars) {
        if (stars == 0) {
            return;
        }

        printStar_2(stars - 1);
        System.out.print("* ");
    }

    static void printLines_2(int rows, int stars) {
        if (rows == 0) {
            return;
        }

        printLines_2(rows - 1, stars);
        printStar_2(stars);
        System.out.println();
    }

    public static void main(String[] args) {
        printLine(5, 5);
        System.out.println();
        printLines_2(5, 5);
    }
}