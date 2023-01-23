
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int newArray[]={ 0 , 0};

        for(int i = 0 ; i<nums.length ; i++){
            for(int j  =  1 + i; j<nums.length ; j++){
               if(nums[i] + nums[j] == target){
                    newArray[0] = i;
                    newArray[1] = j;
                    System.out.println(java.util.Arrays.toString(newArray));               }
            }
        }
        return newArray;
    }


     public static void main(String[] args) {
	int arr[] = {1 ,2 ,3, 4, 5};
        int target = 3;
        twoSum(arr , target);
        System.out.println(twoSum(arr , target));
	}
}

