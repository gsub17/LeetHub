class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < matrix.length ;i++){
            for(int j = 0 ; j < matrix[0].length ;j++){
                ans.add(matrix[i][j]);
            }
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0 ; i < k ;i++){
            pq.add(ans.get(i));
        }
        
        for(int i = k ; i < ans.size() ; i++){
            if(ans.get(i) < pq.peek()){
                pq.poll();
                pq.add(ans.get(i));
            }
        }
        
        return pq.peek();
    }
}