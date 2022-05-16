class MedianFinder {
    
     PriorityQueue<Integer> max_heap ;
        PriorityQueue<Integer> min_heap;
   
     public MedianFinder() {
        max_heap = new PriorityQueue<>(Collections.reverseOrder());
         min_heap = new PriorityQueue<>();
    }
    
    public void addNum(int x) {
         if(max_heap.isEmpty() || max_heap.peek() >= x){
            max_heap.add(x);
        }else{
            min_heap.add(x);
        }
        
         if(max_heap.size() - min_heap.size() == 2){
           min_heap.add(max_heap.poll());
       }else if(min_heap.size() - max_heap.size() == 2){
           max_heap.add(min_heap.poll());
       }
    }
    
    
    
    public double findMedian() {
         if(max_heap.size() == min_heap.size()){
            return (double)(max_heap.peek() + min_heap.peek())/2;
        
        } else if(min_heap.size()<max_heap.size())
          return (double)(max_heap.peek());
      else
          return (double)(min_heap.peek());
      
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */