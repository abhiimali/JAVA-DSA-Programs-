class Solution {
    public String kthDistinct(String[] arr, int k) {
        String distinctString = "";
        int x = 0;
        int y = 0;
        
        for(int i = 0; i <= arr.length - 1; i++) {
            x = 0;
            for(int j = 0; j <= arr.length - 1; j++) {
            
                  if(!arr[i].equals(arr[j])){
                      x++;
                  }
                
                  if(x == arr.length - 1){
                      y++;
                  }
                     
                  if(y == k){
                      distinctString = arr[i];
                      return distinctString;
                     
                  } 
            
             }
            
        }
        
        return distinctString;
    }
}