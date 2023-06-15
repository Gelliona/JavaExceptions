public class Task2 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "2", "3", "4", "5", "6"},{"7", "8", "9", "10", "11", "12"}};
        System.out.println(sum2d(arr));

        // NumberFormatException - в случае, если элементом массива не является строка с целочисленным значением, которое можно привести к типу Integer.
        //String[][] arr = new String[][]{{"1", "2", "3.15", "4", "5", "6"},{"7", "8", "9", "10", "11", "12"}};

        // ArrayIndexOutOfBoundsException - в случае, если в строке или столбце двумерного массива (или и там, и там) менее 5 элементов.
        //String[][] arr = new String[][]{{"1", "2", "3", "4"},{"7", "8", "9", "10", "11", "12"}};

        // NullPointerException - в случае, если массив равен null.
        // String[][] arr = null;


    }

    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}

// NumberFormatException - в случае, если элементом массива не является строка с целочисленным значением, которое можно привести к типу Integer.
// ArrayIndexOutOfBoundsException - в случае, если в строке или столбце двумерного массива (или и там, и там) менее 5 элементов.
