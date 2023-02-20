public class ReverseArray {
    public static void main(String[] args) {
        System.out.print("reverse array");
        int[] arr = { 5, 1, 4, 6, 7 };
        ReverseArray obj = new ReverseArray();
        obj.reverseArray(arr);
    }

    private void reverseArray(int arr[]) {
        int start = 3, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
