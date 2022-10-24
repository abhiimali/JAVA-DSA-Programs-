class Solution {
    public int findShortestSubArray(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new  ArrayList<>();
        
        int n = nums.length ;
        int max = 0 ;
       // int maxNumber=0;
        for(int i=0 ; i < n ; i++)
        {
            list.add(nums[i]);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
            if(map.get(nums[i]) > max)
            {
                max = map.get(nums[i]);
                //maxNumber = nums[i] ;
                
            }
        }
        
        
        int min = Integer.MAX_VALUE ;
        
        for(Map.Entry m : map.entrySet())
        {
            
            if((int ) m.getValue()==max)
            {
                
                
               int num = (int) m.getKey();
               int n1 =  list.indexOf(num);
                int n2 = list.lastIndexOf(num);
                
                if((n2-n1)+1 < min)
                {
                    min = (n2-n1) + 1 ;
                }
                
                
            }
           
            
            
            
        }
        
        return min ; 
        //System.out.println(max);
      
        
    }
}