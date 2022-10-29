class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        
        
        StringBuilder prefix = new StringBuilder("");

        int n = strs.length;

        Arrays.sort(strs);

        String shortest = strs[0];
        String longest = strs[n - 1];

        for (int i = 0; i < shortest.length(); i++) {
            if (shortest.charAt(i) != longest.charAt(i))
                break;
            prefix.append(shortest.charAt(i));
        }
        
        return prefix.toString();
        
        
    }
}