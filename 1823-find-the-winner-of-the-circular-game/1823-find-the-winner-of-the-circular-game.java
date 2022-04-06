class Solution {
    public int findTheWinner(int n, int k) {
        int x = check(n,k);
        return x+1;
    }
    
    public int check(int n , int k){
        if(n==1){
            return 0;
        }
        return (check(n-1,k)+k)%n;
    }
}