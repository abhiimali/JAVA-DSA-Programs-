class Solution {
    public int numUniqueEmails(String[] emails) {
        
        
        HashSet<String> hset = new HashSet<>(); 
        
        for(String emailStr : emails)
        {
            
            int indexOfAt = emailStr.indexOf('@');
            
            String front = emailStr.substring(0,indexOfAt);
            
            int indexOfPlus = front.indexOf('+');
            
           // front = front.substring(0,indexOfPlus);
            
            if(indexOfPlus > 0)
            {
                front = front.substring(0,indexOfPlus);
                
            }
            
            front = front.replaceAll("\\.", "");
            
            String finalStr = front + emailStr.substring(indexOfAt);
            
            hset.add(finalStr);
            
            
            
            
            
        }
        
        return hset.size();
        
        
    }
}