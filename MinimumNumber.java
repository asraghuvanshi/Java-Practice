import java.util.Arrays;

public class MinimumNumber
{
    public static int findMinimum(int arr[]){
        int min = arr[0];
        for( int i = 1; i<arr.length; i++){
           if(arr[i] < min){
            min = arr[i];
           }
        }
        return min;
    }

    public static void findSecondLargest(int arr[]){
        Arrays.sort(arr);
        for(int i = arr.length - 2; i >= 0; --i){
            if (arr[i] != arr[arr.length - 1])
            {
                System.out.println("Second largest number is :" + arr[i]);
            }
        }
    }
        int arr[] = {5, 2 ,1, 6, 7, 8 , 25 , 12};
        for (int i =0 ; i< arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
        int minArr = MinimumNumber.findMinimum(arr);
        System.out.println("\nMinimum number in array is : " + minArr);
        MinimumNumber.findSecondLargest(arr);

	}
}