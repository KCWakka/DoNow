public class FunWith2DArrays {
    private FunWith2DArrays() {
    }


    public static int totalElements(int[][] array) {
        return array.length * array[0].length;
    }


    public static void fourCorners(String[][] array) {
        System.out.println(array[0][0]);
        System.out.println(array[0][array[0].length - 1]);
        System.out.println(array[array.length - 1][0]);
        System.out.println(array[array.length - 1][array[0].length - 1]);
    }


    public static void swapFrontAndBackRows(String[][] array) {
        String[] temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }

    public static double average(int[][] array) {
        double number = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                number += array[row][col];
            }
        }
        return number / totalElements(array);
    }

    public static int edgeSum(int[][] array) {
        int number = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (row == 0 || col == 0|| col == array[row].length - 1 || row == array.length - 1) {
                    number += array[row][col];
                }
            }
        }
        return number;
    }

    public static int[] indexFound(String[][] array, String target) {
        int[] index = new int[2];
        for (int col = 0; col < array[0].length; col++) {
            for (int row = 0; row < array.length; row++) {
                if (array[row][col].equals(target)) {
                    index[0] = row;
                    index[1] = col;
                    return index;
                }
            }
        }
        index[0] = - 1;
        index[1] = -1;
        return index;
    }

    public static int[][] split(int[][] array, int rowNumber, int colNumber) {
        if (rowNumber > array.length - 1 || colNumber > array[0].length - 1) {
            int[][] newArray = new int[0][0];
            return newArray;
        } else {
            int[][] newArray = new int[rowNumber + 1][colNumber + 1];
            for (int row = 0; row <= rowNumber; row++) {
                for (int col = 0; col <= colNumber; col++) {
                    newArray[row][col] = array[row][col];
                }
            }
            return newArray;
        }
    }

    public static int[][] invert(int[][] array) {
        int[][] newArray = new int[array[0].length][array.length];
        for (int col = 0; col < array[0].length; col++) {
            for (int row = 0; row < array.length; row++) {
                newArray[col][row] = array[row][col];
            }
        }
        return newArray;
    }
}

