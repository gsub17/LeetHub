class Solution {
    public int halveArray(int[] nums) {
        int count = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;
        for(int i:nums){
            pq.add((double)i);
            sum+=i;
        }
        double temp = sum/2;
        while(sum > temp){
            double x = pq.poll();
            pq.add(x/2);
            count++;
            sum -=x/2;
        }
        return count;
    }
}