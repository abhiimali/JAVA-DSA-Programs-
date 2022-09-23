class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String s: words) if( isPal(s)) return s;
        
			return "";
    }
    
    private static  boolean isPal(String s)
    {
        boolean flag =  true;
        
			int  start = 0, end = s.length() - 1;
        
			while(start <= end){

				if(s.charAt(start++) != s.charAt(end--)){

					flag = false;
					break;
				}
			}
        
			return flag;
        
        
        
    }
}