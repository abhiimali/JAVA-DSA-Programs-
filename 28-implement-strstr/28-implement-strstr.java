class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
    if (haystack.isEmpty()) return -1;
    if(!needle.isEmpty() && !haystack.isEmpty() && haystack.length()>=needle.length()){
        return haystack.indexOf(needle);
    }
    
    
    return -1;
}
    
}