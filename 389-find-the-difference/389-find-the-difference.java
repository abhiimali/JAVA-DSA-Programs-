class Solution {
    public char findTheDifference(String s, String t) {
     
         // Using Bit Manipulation 
        
        
       
        char diffChar = 0;
		for(char c : (s+t).toCharArray()) diffChar ^=c;
		return diffChar;
        
        
        
        
        
//         // using ASKII Values 
        
//         int sumS = 0 ;
//         int sumT = 0 ;
        
//        // // sumS is Sum of String  S
//        // // sumT Is Sum Of String T 
        
//         for (char ch: s.toCharArray()) {

//             sumS = sumS + (int) ch ;

//         }
//         for (char cm : t.toCharArray()) {

//             sumT = sumT + (int) cm ;

//         }

//        // // Now Calculate Diff

//         int ans = sumT - sumS ;

//         char temp =  (char)ans ;

//          return  temp ;
        
        
    }
}