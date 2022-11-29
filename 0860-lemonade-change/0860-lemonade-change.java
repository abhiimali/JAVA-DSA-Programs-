class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int five=0 , ten = 0 ;
     for(int i : bills)
     {
         
         if(i==5)
         {
             five++ ;
         }
         else if(i==10)
         {
             ten++;
             five--;
         }
         else if(i==20)
         {  
             if(ten>0 && five > 0)
             {
                 ten--;
                 five--;
             }
             else
                 
             {
                 five = five - 3 ;
             }
             
             
         }
         if(five < 0) return false ;
      }
        return true ;
    }
}