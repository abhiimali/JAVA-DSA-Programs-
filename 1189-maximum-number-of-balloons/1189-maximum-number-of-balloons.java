class Solution {
    public int maxNumberOfBalloons(String text) {
        
        HashMap<Character,Integer> hm= new HashMap<>();
	    hm.put('b',0);hm.put('a',0);hm.put('l',0);hm.put('o',0);hm.put('n',0);
	    for(char i:text.toCharArray()) {
		    if(hm.containsKey(i)) hm.put(i, hm.get(i)+1);}
	return(Math.min(hm.get('b'), Math.min(hm.get('a'), Math.min(hm.get('l')/2, Math.min(hm.get('o')/2,hm.get('n'))))));
        
        
    }
}