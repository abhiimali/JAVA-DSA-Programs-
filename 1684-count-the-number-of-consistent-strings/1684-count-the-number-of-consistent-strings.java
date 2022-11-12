class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;

        for(String st:words)
        {
            int flag=0;

            //traversing each caharacter of the string
            for(char c:st.toCharArray())
            {
                if(allowed.indexOf(c)==-1)
                {
                    flag=1;
                }

            }
            if(flag==0)
            {
                count++;
            }
        }
        return count;
        
    }
}