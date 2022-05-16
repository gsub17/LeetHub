// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;


class GFG
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        int n;
        while(t-- > 0){
            n = sc.nextInt();
    
            Solution obj = new Solution();
            for(int i = 1; i <= n; i++)
            {
                int x =sc.nextInt();
                obj.insertHeap(x);
                System.out.println((int)Math.floor(obj.getMedian()));
            }
        }
        
        
    }
}

// } Driver Code Ends


class Solution
{
    //Function to insert heap.
    static PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> min_heap = new PriorityQueue<>();
    public static void insertHeap(int x)
    {
        // add your code here
        // if(!max_heap.isEmpty() && max_heap.peek() > x){
        //     max_heap.add(x);
        //      balanceHeaps();
        // }else{
        //     min_heap.add(x);
        //      balanceHeaps();
        // }
         if(max_heap.isEmpty() || max_heap.peek() >= x){
            max_heap.add(x);
        }else{
            min_heap.add(x);
        }
        balanceHeaps();
       
    }
    
    //Function to balance heaps.
    public static void balanceHeaps()
    {
       // add your code here
       if(max_heap.size() - min_heap.size() == 2){
           min_heap.add(max_heap.poll());
       }else if(min_heap.size() - max_heap.size() == 2){
           max_heap.add(min_heap.poll());
       }
    }
    
    //Function to return Median.
    public static double getMedian()
    {
        // add your code here
        if(max_heap.size() == min_heap.size()){
            return (double)(max_heap.peek() + min_heap.peek())/2;
        
        } else if(min_heap.size()<max_heap.size())
          return (double)(max_heap.peek());
      else
          return (double)(min_heap.peek());
      
    }
    
}