public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{6, 6, 6, 6, 6, 6, 6};
        int[] arr2 = new int[]{3, 3, 3, 3, 3, 3};

        int[] arr3 = arrayDivider(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

    }

    public static int[] arrayDivider(int[] arr1, int[] arr2){
        int[] newArr = new int[arr1.length];
        if (arr1.length != arr2.length){
            throw new RuntimeException("Different length of arrays");
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[i] = arr1[i] / arr2[i];
        }
        return newArr;
    }
}
