class Solution {
    public int fib(int n) {
        int ans = f(n);
        return ans;
    }
    
    public int f(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        int x = f(n-1)+f(n-2);
        return x;
    }
}