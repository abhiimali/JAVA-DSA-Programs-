class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        
        int A = rec1[0];
        int B = rec1[1];
        int C = rec1[2];
        int D = rec1[3];
        
        int E = rec2[0];
        int F = rec2[1];
        int G = rec2[2];
        int H = rec2[3];
        
        if(C <= E || G <= A || H <= B || F >= D)
        {
            return false;
        }
        
        return true;
    }
}