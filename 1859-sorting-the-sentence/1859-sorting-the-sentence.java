class Solution {
    public String sortSentence(String s) {
        
        
        String[] str = s.split(" ");
        String[] ans  = new String[str.length];

        for (int i = 0; i < ans.length; i++) {
            int index = Character.getNumericValue(str[i].charAt( str[i].length()-1 ));
            ans[index-1] = str[i].replace(Character.toString(str[i].charAt( str[i].length()-1 )), "");
            
        }
        StringBuffer sb = new StringBuffer();
            for(int i = 0; i < ans.length; i++) {
            sb.append(ans[i]);
            if(i <= ans.length-2) sb.append(" ");
        }
        return sb.toString();
    }
}

/*

The solution might be a little bit intimidaing at first but if you try to understand

we split the string and store it in a String array str
then create new string ans
int index is nothing but the int value at the end of every sentence in string
ans[index-1] = removing the number in the string replacing it with ""(i.e blank string)
then in string buffer sb we append the stings with all the spaces and indentation
then finally convert stringbuffer to string and then return the value.

*/