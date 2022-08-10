class Solution {
    
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<Integer> path = new ArrayList<>();
        
        //path.add(0);
        
        dfs(graph,0,path);
        return result ;
        
    }
    
    private void dfs(int[][] graph , int u ,List<Integer> path )
    {
        path.add(u);  // added U 
        
        if(u==graph.length-1)
        {
            result.add( new ArrayList(path));
            
        }
        
        else
            
        {
            for(int v : graph[u] )
            {
                dfs(graph,v,path);
                path.remove(path.size()-1);
            }
            
            
        }
        
        
        
    }
}