
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int newArray[]  = new int[nums.length];

        for(int i = 0 ; i<nums.length ; i++){
            for(int j  =  1; j<nums.length ; j++){
               if(nums[i] + nums[j] == target){
                    System.out.println(" "+ nums[i] +" "+ nums[j]+"target"+ target +"nums");
                    newArray[i] = newArray[i , j];
               }
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
