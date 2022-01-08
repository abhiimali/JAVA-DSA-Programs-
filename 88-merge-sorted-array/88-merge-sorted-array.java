class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for ( int index=m; index <m+n ; index ++ )
        {
            nums1[index]=nums2[k];
            k++;
        }
        
        for (int i = 0 ; i < nums1.length - 1 ; i ++)
        {
            for (int j = i+ 1;j>0;j--) {

                if (nums1[j] < nums1[j - 1]) {//int temp = arr[j];
                    int temp = nums1[j];
                    nums1[j] = nums1[j - 1];
                    nums1[j - 1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
        // end 
    }
}