class Solution {
    public int search(int[] arr, int target) {
        
        int ans = searchB(arr,target,0 , arr.length -1);
        return ans ; 
    }
    
    int searchB(int[] arr, int target , int start , int end ) {


        // BASE CONDITION
        if (start>end)
        {
            return  -1 ;
        }

        int mid = start + (end-start) / 2 ;

        if (arr[mid] == target)
        {
            return  mid ;

        }
        // if target is in left part Of Array Then Do Following

        if (target < arr[mid])
        {
            return  searchB(arr, target, start, mid-1);
        }

        // if target is In Right Part Of array  Then Do Following

        return  searchB(arr, target, mid+1, end);


    }
    
}