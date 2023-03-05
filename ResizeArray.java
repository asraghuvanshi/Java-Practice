/* * 
 *   Author: AS Raghuvanshi
 *   Problem: Resize array
 */


import java.util.Arrays;

class ResizeArray {
    public static void main(String[] args) {
        int arrData[] = { 5, 3, 6, 7, 1 };
        int len = arrData.length;
        Arrays.sort(arrData);
        System.out.println("Original Array is :");
        for (int i : arrData) {
            System.out.print(i + " ");
        }
        System.out.println("\nLength of are is :" + arrData.length);

        int resize_array = resizeArray(arrData, arrData.length * 2);
        System.out.println("After resizing array is: "+ resize_array);
    
    }

    private static int resizeArray(int[] arrData, int capicity) {
        int newArray[] = new int[capicity];
        for (int i = 0; i < arrData.length; i++) {
            newArray[i] = arrData[i];
        }
         arrData = newArray;
         return arrData.length;
    }
}