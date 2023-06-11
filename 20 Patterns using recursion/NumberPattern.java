/* 
 NumberPattern

1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1
 
*/

public class NumberPattern {
    static void printLeftNums(int nums) {
        if (nums == 0) {
            return;
        }

        printLeftNums(nums - 1);
        System.out.print(nums + " ");
    }

    static void printSpaces(int spaces) {
        if (spaces == 0) {
            return;
        }

        System.out.print("  ");
        printSpaces(spaces - 1);
    }

    static void printRightNums(int nums) {
        if (nums == 0) {
            return;
        }

        System.out.print(nums + " ");
        printRightNums(nums - 1);
    }

    static void printLines(int lines, int spaces) {
        if (lines == 0) {
            return;
        }

        printLines(lines - 1, spaces + 1);
        printLeftNums(lines);
        printSpaces(spaces);
        printSpaces(spaces);
        printRightNums(lines);
        System.out.println();

    }

    public static void main(String[] args) {
        printLines(5, 0);
    }
}
