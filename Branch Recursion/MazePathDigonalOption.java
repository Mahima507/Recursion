public class MazePathDigonalOption {
   static void mazePathProblem(int row, int col, int endRow, int endCol, String result) {
    // Termination case: If the current position is the destination, print the result
    if (row == endRow && col == endCol) {
        System.out.println(result);
        return;
    }

    // Step 1: Move to the right
    if (col < endCol) {
        mazePathProblem(row, col + 1, endRow, endCol, result + "R");
    }

    // Step 2: Move down
    if (row < endRow) {
        mazePathProblem(row + 1, col, endRow, endCol, result + "D");
    }

    // Step 3: Move diagonally (right and down)
    if (row < endRow && col < endCol) {
        mazePathProblem(row + 1, col + 1, endRow, endCol, result + "X");
    }
}

public static void main(String[] args) {
    mazePathProblem(0, 0, 2, 2, "");
}

}
