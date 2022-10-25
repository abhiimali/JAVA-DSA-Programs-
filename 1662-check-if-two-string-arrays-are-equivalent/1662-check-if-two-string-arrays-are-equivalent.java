class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder str1 = new StringBuilder();
        
        StringBuilder str2 = new StringBuilder();
        
        for(String word : word1)
        {
            str1.append(word);
        }
         for(String words : word2)
        {
            str2.append(words);
             
             
        }
        System.out.println(str1);
        System.out.println(str2);
        
        return str1.toString().equals(str2.toString());
        
    }
}