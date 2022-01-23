class Solution {
    public boolean areNumbersAscending(String str) {
        
        //String ans = extractInt(s);
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        
        String[] stringArray = str.split(" ");
        
        int [] intArray = new int[stringArray.length];
      for(int i = 0; i < stringArray.length; i++) {
         intArray[i] = Integer.parseInt(stringArray[i]);
      }
        
        for (int j = 1; j < intArray.length ; j++) {
                // Swap if J Is Small Than J-1

                if (intArray[j] < intArray[j - 1]) {
                    
                    return false ;
                }
            
                if (intArray[j] == intArray[j - 1]) {
                    
                    return false ;
                }
            
            
                
            }
        return true ;
    }
    
      //String extractInt(String str)
  //  {
        // Replacing every non-digit number
        // with a space(" ")
        //str = str.replaceAll("[^\\d]", " ");
  
        // Remove extra spaces from the beginning
        // and the ending of the string
       // str = str.trim();
  
        // Replace all the consecutive white
        // spaces with a single space
       // str = str.replaceAll(" +", " ");
  
       // if (str.equals(""))
        //    return "-1";
  
//return str;
  //  }
}