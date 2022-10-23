class Solution {
    public int minOperations(int n) {
        
        
        if(n%2==0){
            return (int)Math.pow(n/2,2);
        }
        else{
            return ((int)Math.pow(n/2,2))+n/2;
        }
        
        
    }
}