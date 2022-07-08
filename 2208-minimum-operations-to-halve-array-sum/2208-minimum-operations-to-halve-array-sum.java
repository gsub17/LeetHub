class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> max_heap = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;
        for(int i:nums){
            sum+=i;
            max_heap.add((double)i);
        }
        double half = sum/2;
        int count = 0;
        while(sum > half){
            double x = max_heap.poll();
            sum-=x;
            x = x/2;
            sum+=x;
            count++;
            max_heap.add(x);
        }
        return count;
    }
}