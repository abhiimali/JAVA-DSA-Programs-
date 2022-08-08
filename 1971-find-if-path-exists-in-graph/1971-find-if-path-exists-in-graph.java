class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean visited[] = new boolean[n];
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[]:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
       
        dfs(source,destination,visited,adj);    
        return visited[destination];
    }
    
    private void dfs(int start,int dest,boolean visited[], ArrayList<ArrayList<Integer>> adj){
        
        visited[start]=true;
        if(start==dest){
            return ;
        }
        
        for(int adjacent : adj.get(start)){
            if(!visited[adjacent]){
                dfs(adjacent,dest,visited,adj);
            }
        }        
    }
}