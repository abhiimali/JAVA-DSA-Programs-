class Solution {
    public int numDifferentIntegers(String word) {
     
        
       // HashSet<Integer> set = new HashSet<>();
        HashSet<String> set = new HashSet<>();
        
        StringBuilder sb = new StringBuilder() ;
        
        int n = word.length();
        
        for(int i = 0 ; i < n ; i++ )
        {
            char ch = word.charAt(i);
            
            if(ch >= '0' && ch <= '9')
            {
                if(!sb.isEmpty() && sb.charAt(0) == '0') sb.delete(0, 1);
                sb.append(ch);
              //  System.out.println(sb);
                
            }
            else
            {
                
                if(!sb.isEmpty())
                {
                    set.add(sb.toString());
                    // System.out.println(set);
                    sb.delete(0,sb.length());
                }
            }
            
        
        }
        if(!sb.isEmpty()){
            set.add(sb.toString());
        }
        
        return set.size();
    }
}