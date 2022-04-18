// { Driver Code Starts

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int k = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.karyTree(k,m));
        }
    }
}// } Driver Code Ends



class Solution {
    static Long karyTree(int k, int m) {
        // code here
        long sol = 1L;
        while(m>0){
            sol = sol*k;
            sol = sol%1000000007L;
            m--;
        }
        
        return sol;
    }
};