class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int numsLength = nums.length;
        int[] products = new int[numsLength];
        int leftProduct = 1;
        for (int leftProductIndex = 0; leftProductIndex < numsLength; leftProductIndex++) {
            products[leftProductIndex] = leftProduct;
            leftProduct *= nums[leftProductIndex];
        }
        int rightProduct = 1;
        for(int rightProductIndex=numsLength - 1; rightProductIndex >= 0;rightProductIndex--){
            products[rightProductIndex] = rightProduct * products[rightProductIndex];
            rightProduct *= nums[rightProductIndex];
        }
        return products;
    }
}