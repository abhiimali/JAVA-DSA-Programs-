class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int N = rooms.size();
        boolean[] visited = new boolean[N];
        visited[0] = true;
        dfs(rooms, visited, 0);
        for(boolean flag: visited)
            if(!flag) return false;
        return true;
    }
     public void dfs(List<List<Integer>> rooms,boolean[] visited, int index){
        for(int num: rooms.get(index)){
            if(visited[num]) continue;
            visited[num] = true;
            dfs(rooms, visited, num);
        }
     }
}