class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        // node k should have outgoing node 
        
        
        Map<Integer, Map<Integer, Integer>> cost = new HashMap<>();

    for (int[] t : times) {
        int u = t[0], v = t[1], w = t[2];
        cost.putIfAbsent(u, new HashMap<>());
        cost.putIfAbsent(v, new HashMap<>());
        cost.get(u).put(v, w);
    }

    // store [node, cost between start node and this node]
    PriorityQueue<int[]> reachable = new PriorityQueue<>((a, b) -> {
        return a[1] - b[1];
    });
    reachable.add(new int[]{k, 0});

    Set<Integer> visited = new HashSet<>();
    int res = 0;
    while (!reachable.isEmpty() && visited.size() != n) {
        int[] node = reachable.remove();
        int i = node[0], wi = node[1];
        if (visited.contains(i)) continue;

        res = wi;
        visited.add(i);
        for (int j : cost.get(i).keySet()) {
             int wj = cost.get(i).get(j);
            reachable.add(new int[]{j, wj + wi});
        }
    }

    return visited.size() == n ? res : -1;
        
    }
}