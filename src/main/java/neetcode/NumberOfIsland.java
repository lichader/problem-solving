package neetcode;

import java.util.LinkedList;

public class NumberOfIsland {

    public int result(String[][] input) {
        if (input.length == 0) {
            return 0;
        }

        int row = input.length;
        System.out.println("rows: " + row);
        int col = input[0].length;
        System.out.println("cols: " + col);

        int numberOfIsland = 0;

        var visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (input[i][j].equals("1") && !visited[i][j]) {
                    numberOfIsland++;
                    System.out.println("Found island [" + i + "," + j + "]");

                    var queue = new LinkedList<Cell>();
                    queue.push(new Cell(i, j));

                    while (!queue.isEmpty()) {
                        var node = queue.pop();

                        var currentCol = node.col;
                        var currentRow = node.row;
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
                                && input[currentRow][left].equals("1")) {
                            System.out.println("Found left island [" + left + "," + currentRow + "]");
                            queue.push(new Cell(currentRow, left));
                        }

                        // check right cell
                        if (right < col
                                && !visited[currentRow][right]
                                && input[currentRow][right].equals("1")) {
                            System.out.println("Found right island [" + right + "," + currentRow + "]");
                            queue.push(new Cell(currentRow, right));
                        }

                        if (up >= 0
                                && !visited[up][currentCol]
                                && input[up][currentCol].equals("1")) {
                            System.out.println("Found above island [" + currentCol + "," + up + "]");
                            queue.push(new Cell(up, currentCol));
                        }

                        // check down
                        if (down < row
                                && !visited[down][currentCol]
                                && input[down][currentCol].equals("1")) {
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

class Cell {

    final int col;
    final int row;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

