package neetcode;

import java.util.LinkedList;

public class NumberOfIsland {

    public int result(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }

        int row = grid.length;
        System.out.println("rows: " + row);
        int col = grid[0].length;
        System.out.println("cols: " + col);

        int numberOfIsland = 0;

        var visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    numberOfIsland++;
                    System.out.println("Found island [" + i + "," + j + "]");

                    var queue = new LinkedList<Cell>();
                    queue.push(new Cell(i, j));

                    while (!queue.isEmpty()) {
                        var node = queue.pop();

                        var currentCol = node.col();
                        var currentRow = node.row();
                        System.out.println("Checking node [" + currentRow + "," + currentCol + "]");

                        if (visited[currentRow][currentCol]) {
                            continue;
                        }

                        System.out.println("Mark [" + currentRow + "," + currentCol + "] as visited");
                        visited[currentRow][currentCol] = true;

                        var left = currentCol - 1;
                        var right = currentCol + 1;
                        var down = currentRow + 1;
                        var up = currentRow - 1;

                        // check left cell
                        if (left >= 0
                                && !visited[currentRow][left]
                                && grid[currentRow][left] == '1') {
                            System.out.println("Found left island [" + left + "," + currentRow + "]");
                            queue.push(new Cell(currentRow, left));
                        }

                        // check right cell
                        if (right < col
                                && !visited[currentRow][right]
                                && grid[currentRow][right] == '1') {
                            System.out.println("Found right island [" + right + "," + currentRow + "]");
                            queue.push(new Cell(currentRow, right));
                        }

                        if (up >= 0
                                && !visited[up][currentCol]
                                && grid[up][currentCol] == '1') {
                            System.out.println("Found above island [" + currentCol + "," + up + "]");
                            queue.push(new Cell(up, currentCol));
                        }

                        // check down
                        if (down < row
                                && !visited[down][currentCol]
                                && grid[down][currentCol] == '1') {
                            System.out.println("Found below island [" + currentCol + "," + down + "]");
                            queue.push(new Cell(down, currentCol));
                        }

                    }

                }
            }
        }

        return numberOfIsland;
    }
}

record Cell(int row, int col) {
}

