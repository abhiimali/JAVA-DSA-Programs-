class Solution {
    public int findJudge(int n, int[][] trust) {
        int indeg[]=new int[n+1];
        int outdeg[]=new int[n+1];
        for(int a[]:trust){
            indeg[a[1]]++;
            outdeg[a[0]]++;
        }
        for(int i=1;i<indeg.length;i++){
            if(indeg[i]==n-1 && outdeg[i]==0)return i;
        }
        return -1;
    }
}