public class MinimumNumber
{
    public static int findMinimum(int arr[]){
        int min = arr[0];
        for( int i = 1; i<arr.length; i++){
           if(arr[i] > min){
            min = arr[i];
           }
        }
        return min;
    }
    public static void main(String[] args) {
		
        int arr[] = {5, 2 ,1, 6, 7, 8 , 25 , 12};
        System.out.println("Size of array is :"+ arr.length);
        int minArr = MinimumNumber.findMinimum(arr);
        System.out.println(minArr);


	}
}