public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        String str = "5.12";
        int[] arr = new int[] {2, 6, 8, 3, 7, 4, 1};

        // 1. ArithmeticException
        System.out.println(divide(a, b));

        // 2. NumberFormatException
        //System.out.println(parse(str));

        // 3. ArrayIndexOutOfBoundsException
        // System.out.println(findElement(arr, 1));

    }

    public static int divide(int a, int b) {
        return a/b;
    }

    public static int parse(String str){
        int newString = Integer.parseInt(str);
        return newString;
    }

    public static boolean findElement(int[] arr, int num) {
        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == num){
                flag = true;
            }
        }
        return flag;
    }

}
