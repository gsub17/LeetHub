class Solution {
    public boolean isBipartite(int[][] graph) {
        // 1 - blue , -1 - red , 0 - uncolored
        int len = graph.length;
        int[] colors = new int[len];
        
        for(int i = 0 ; i < len ;i++){
            if(colors[i] == 1 || colors[i] == -1){
                continue;
            }else{
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                colors[i] = 1;
                
                while(!q.isEmpty()){
                    int curr = q.poll();
                    for(int neighbour:graph[curr]){
                        if(colors[neighbour] == 0){
                            colors[neighbour] = -colors[curr];
                            q.add(neighbour);
                        }
                        
                        if(colors[neighbour] == colors[curr]) return false;
                    }
                    
                    
                }
            }
            
        }
        
        return true;
    }
}