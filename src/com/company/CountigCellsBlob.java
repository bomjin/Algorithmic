package com.company;

public class CountigCellsBlob {


    private static int[][] grid = {
            {1, 0, 0, 0, 0, 0, 0, 1}, //8x8 셀
            {1, 0, 1, 0, 0, 0, 1, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 0},
            {0, 0, 1, 1, 0, 1, 0, 0},
            {0, 1, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
    };
    private static int BACKGROUND_COLOR = 0;
    private static int IMAGE_COLOR = 1;
    private static int ALREADY_COUNTED = 2;
    private static int N = 8;



public int countCells(int x, int y) {
    if (x < 0 || x >= N || y < 0 || y >= N)   // 0~  N-1
        return 0;
    else if (grid[x][y] != IMAGE_COLOR)
        return 0;
    else
        grid[x][y] = ALREADY_COUNTED;
    return 1 + countCells(x - 1, y + 1) + countCells(x, y + 1) + countCells(x + 1, y + 1) + countCells(x - 1, y + 1) +
            countCells(x - 1, y) + countCells(x + 1, y) + countCells(x - 1, y - 1) + countCells(x, y - 1) +
            countCells(x + 1, y - 1);

}
public static void main(String[] args) {
    CountigCellsBlob blob = new CountigCellsBlob();
    int result = blob.countCells(1,2);
    System.out.println(result);

}

}
