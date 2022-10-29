class Solution {
    public String oddString(String[] words) {
        
        Map<String,List<String>> map = new HashMap();        
        
        for(String w : words){
            String s = "";
            for(int i=0; i<w.length()-1; i++){
                char c = w.charAt(i), n = w.charAt(i+1);
                s+=(n-c)+" ";
            }
                if(!map.containsKey(s))
                    map.put(s,new ArrayList());
                map.get(s).add(w);
        }
        
        String ans = "";
        
        for(String key: map.keySet()){
            if(map.get(key).size() == 1)
                ans = map.get(key).get(0);
            // System.out.println(map.get(key));
        }
            
        
        return ans;
    }
}