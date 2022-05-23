class MedianFinder {
    
    PriorityQueue<Integer> max_heap ;
    PriorityQueue<Integer> min_heap;

    public MedianFinder() {
        max_heap = new PriorityQueue<>(Collections.reverseOrder());
        min_heap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(max_heap.isEmpty() || max_heap.peek() > num){
            max_heap.add(num);
        }else{
            min_heap.add(num);
        }
        // balancing condition
        if(max_heap.size() - min_heap.size() == 2){
            min_heap.add(max_heap.poll());
        }else if(min_heap.size() - max_heap.size() == 2){
            max_heap.add(min_heap.poll());
        }
        findMedian();
    }
    
    public double findMedian() {
        if(max_heap.size() == min_heap.size() ){
            return (double)(max_heap.peek()+min_heap.peek())/2;
        }else if(max_heap.size() > min_heap.size()){
            return max_heap.peek();
        }
        
        return min_heap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */