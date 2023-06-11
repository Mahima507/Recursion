
public class CharPattern {
    // P-14
    static void printChars(int chars, int value) {
        if (chars == 0) {
            return;
        }

        System.out.print(value + " ");
        printChars(chars - 1, value + 1);
    }

    static void printLines(int rows, int incrementFact) {
        if (rows == 5) {
            return;
        }

        printChars(rows, incrementFact);
        System.out.println();
        printLines(rows + 1, rows + incrementFact);
    }

    public static void main(String[] args) {
        printLines(1, 1);
    }

}