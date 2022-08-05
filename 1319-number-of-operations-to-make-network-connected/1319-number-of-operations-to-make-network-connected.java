class Solution {
    
    ArrayList<ArrayList<Integer>> graph ;
    
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n - 1)
        {
            return -1 ;
        }
     
         ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0 ; i < n+1 ; i++)
              graph.add(new ArrayList<>());
        
        
        for(int[] dis : connections)
        {
            graph.get(dis[0]).add(dis[1]);
            graph.get(dis[1]).add(dis[0]);
            
        }
        int count = 0 ;
        boolean[] visited = new boolean[n+1];
        for(int i=0;i<n; i++)
        {
             
            if(visited[i]== false)
            {    
                dfs(graph, visited , i);
                count ++ ;
            }
        
        }
        return count - 1 ;
        
        
    }
    
    public void dfs(ArrayList<ArrayList<Integer>> graph , boolean[] visited , int i)
    {
        if(visited[i])
           return;
        visited[i] = true ;
        
        for(Integer it : graph.get(i))
        {
            if(!visited[it])
            {
                dfs(graph,visited,it);
            }
            
        }
        
    }
}