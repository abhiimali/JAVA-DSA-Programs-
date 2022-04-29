class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int[] colors = new int[graph.length]; // 0 not colored, color 1, color 2
        Queue<Integer> queue = new LinkedList();
        short status = 0; 
        
        for (int i = 0; i < graph.length; i++) {
            if (colors[i] != 0 || graph[i].length == 0) { //Already colored or not connected node
                continue;
            }
            
            colors[i] = 1; //Color with 1
            queue.add(i);
            
            while(!queue.isEmpty()) {
                int node = queue.poll();
                int nodeColor = colors[node];
                int oppositeColor = nodeColor == 1 ? 2 : 1;
                
                for (int oppositeNode : graph[node]) {
                    if (colors[oppositeNode] == 0) {
                        colors[oppositeNode] = oppositeColor;
                        queue.add(oppositeNode);
                    } else if (colors[oppositeNode] != oppositeColor) {
                        return false;
                    }
                }
            }
        }
        return true;
        
    }
}