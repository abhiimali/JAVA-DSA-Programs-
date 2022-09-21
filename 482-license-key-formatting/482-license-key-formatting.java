class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
        
        String str = s.replaceAll("-","").toUpperCase();
         // System.out.println(str);
     int n = str.length();
     int count=0;
        StringBuilder sb = new StringBuilder();
        for(int i= n - 1; i >= 0 ;i -- )
        {
            char c = str.charAt(i);
            
            sb.append(c);
            count++;
            if(count==k)
            
            {
                sb.append('-');
                count=0;
            }
        
            
        }
        
        sb.reverse();
        if(sb.length() > 0 && sb.charAt(0)=='-') sb.deleteCharAt(0);
        
        return sb.toString();
        
        
    }
}