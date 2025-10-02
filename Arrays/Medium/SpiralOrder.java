import java.util.*;

public class SpiralOrder {
    public static List<Integer> spiralOrder(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        if (arr == null || arr.length == 0)
            return list;
        int firstRow = 0, firstCol = 0;
        int lastRow = arr.length - 1;
        int lastCol = arr[0].length - 1;
        while (firstRow <= lastRow && firstCol <= lastCol) {
            // Traverse right
            for (int i = firstCol; i <= lastCol; i++) {
                list.add(arr[firstRow][i]);
            }
            firstRow++;
            // Traverse down
            for (int i = firstRow; i <= lastRow; i++) {
                list.add(arr[i][lastCol]);
            }
            lastCol--;
            // Traverse left (if row exists)
            if (firstRow <= lastRow) {
                for (int i = lastCol; i >= firstCol; i--) {
                    list.add(arr[lastRow][i]);
                }
                lastRow--;
            }
            // Traverse up (if column exists)
            if (firstCol <= lastCol) {
                for (int i = lastRow; i >= firstRow; i--) {
                    list.add(arr[i][firstCol]);
                }
                firstCol++;
            }
        }
        return list;
    }
}