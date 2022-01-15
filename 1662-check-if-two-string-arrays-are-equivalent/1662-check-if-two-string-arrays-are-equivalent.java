class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
         int arr1=word1.length;
    int arr2=word2.length;
    StringBuilder sst1=new StringBuilder();
    StringBuilder sst2=new StringBuilder();
    
    for(int i=0;i<arr1;i++){
        sst1.append(word1[i]);
    }
    for(int j=0;j<arr2;j++){
        sst2.append(word2[j]);
    }
    
    String name1=sst1.toString();
    String name2=sst2.toString();
    
    
    
    return name1.equals(name2);
    
}
   
}
