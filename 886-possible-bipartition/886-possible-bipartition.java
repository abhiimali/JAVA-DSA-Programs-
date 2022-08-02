class Solution {
    
        static int[] color ;
      public boolean possibleBipartition(int n, int[][] dislikes) {
        
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0 ; i < n+1 ; i++)
              graph.add(new ArrayList<>());
        
        
        for(int[] dis : dislikes)
        {
            graph.get(dis[0]).add(dis[1]);
            graph.get(dis[1]).add(dis[0]);
            
        }
        
          
          int[] color = new int[n+1];
          
          
          
          for(int i = 0 ; i < n + 1 ; i++ )
          {
              if(color[i]==0)
              {   Queue<Integer> q = new ArrayDeque<>();
                  q.add(i);
                  color[i] = 1 ;
                  while( !q.isEmpty())
                  {
                     int rm = q.remove();
                      
                    for(int it : graph.get(rm))
                  {
                        
                        if(color[it]==0)
                        {
                          
                          color[it] = -color[rm]  ;
                             q.add(it);
                         // if prev node is 1 mark this as -1
                          // 1 and -1 are used as colors 
                        }
                        else if(color[it] == color[rm])
                        {
                            return false ;
                        }
                      
         
                  } 
                     
                  }
              }
                  
          }  
          
          return true ; 
           
        
    }   
}