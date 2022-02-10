class Solution {
public int[] sortArray(int[] nums) {
sort(nums , 0 , nums.length -1);
// System.out.println(Arrays.toString(nums));
return nums;

}
public void sort(int[] nums , int low , int hi){
if (low>=hi){
return;
}
int start = low;
int end = hi;
int mid = start + (end - start)/2;
int pivot = nums[mid];
while (start<=end){
while (nums[start]<pivot){
start++;
}
while (nums[end]>pivot){
end--;
}
if (start<=end){
int temp = nums[start];
nums[start] = nums[end];
nums[end] = temp;
start++;
end--;
}
}
sort(nums , low , end);
sort(nums , start , hi);
}
}