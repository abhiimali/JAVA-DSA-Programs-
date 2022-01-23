class Solution {
    public double myPow(double x, int n) {
        if(n < 0)
          return 1.0/helper(x, Math.abs(n));
 
      return helper(x, n);
    }
     public double helper(double x, int n){
 
     if(n == 0) return 1;
 
     if(n == 1) return x;
 
     if(n % 2 == 0)
         return helper(x * x, n/2);
 
      return x * helper(x * x, n/2);
}
}


// https://www.youtube.com/watch?v=GyL7FJn0gso 