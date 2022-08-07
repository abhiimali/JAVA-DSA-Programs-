class Solution {
    
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        int n = graph.length;
        int[] isSafe = new int[n];
        Arrays.fill(isSafe, -1);
        
        List<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            if(checkNode(i, isSafe, graph) == 1){
                res.add(i);
            } 
        }
        
        return res;
        
    }
    
    static int checkNode(int index, int[] isSafe, int[][] graph){
        

        if(isSafe[index] != -1) return isSafe[index];
        
        if(graph[index].length == 0) {
            isSafe[index] = 1;
            return 1;
        }
        
        isSafe[index] = 0; 
        
        for(int node : graph[index]){
            
            if(checkNode(node, isSafe, graph) == 0){
                isSafe[index] = 0;
                return 0;
            }
        }
        
        isSafe[index] = 1;
        
        return isSafe[index];
        
    }
    
}
