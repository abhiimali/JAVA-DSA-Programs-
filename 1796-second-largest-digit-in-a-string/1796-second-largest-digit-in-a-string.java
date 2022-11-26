class Solution {
    public int secondHighest(String s) {
     
        int k= 0 ;
        //int[] ans = new int[s.length()];
        HashSet<Integer> ans = new HashSet<>();
        
        for(char c : s.toCharArray())
        {
            if(Character.isDigit(c))
            {     int a  = c - '0' ;
             //System.out.println(a);
               // ans[k++]=a;
             ans.add(a);
            }
        }
        //System.out.println(Arrays.toString(ans));
        // int m = ans[0];
        int largest=-1;
        int secondLargest=-1;
        
        for( int digit : ans)
        {
            if(digit > largest)
            {   secondLargest = largest ;
                largest = digit ;
            }else if(digit > secondLargest)
            {
                secondLargest = digit ; 
            }
        }
        
        return secondLargest ;
        
    }
}