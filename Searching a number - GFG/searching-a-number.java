// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            str = br.readLine().trim().split(" ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().search(arr, n, k);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int search(int arr[], int n, int k) {

        // code here
        
       return  isFound(arr,k,0);
    }
    
    int isFound(int[] arr,int target , int i) {
        if (i == arr.length - 1)
        {
            return  -1 ;
        }
        if (arr[i]==target)
        {
            return  i+1 ;
        }
        else
        {
            return   isFound(arr,target,i+1);
        }

    }
}