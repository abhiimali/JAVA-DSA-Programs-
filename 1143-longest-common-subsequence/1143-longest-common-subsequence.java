class Solution {
    public int longestCommonSubsequence(String text1, String text2) 
    {
        int arr[][] = new int[1001][1001];
        for(int[] x:arr)
        Arrays.fill(x,  -1);
        return lcs(text1,text2,text1.length(),text2.length(),arr);
    }
    public int lcs(String s1,String s2,int m,int n,int [][] arr)
    {
        if(arr[m][n]!=-1)
            return arr[m][n];
        if(m==0||n==0)
        return 0;
        else
        {
            if(s1.charAt(m-1)==s2.charAt(n-1))
            arr[m][n] = 1+lcs(s1,s2,m-1,n-1,arr);
            else
            arr[m][n] = Math.max(lcs(s1,s2,m-1,n,arr),lcs(s1,s2,m,n-1,arr));
        }
        return arr[m][n];
    }
}