class Solution {
    public int reverse(int x) {
        int l = -(int)(Math.pow(2,31));
        int h = (int)(Math.pow(2,31)-1);
        ArrayList<Integer> ans = new ArrayList<>();
        if(x == 1534236469 || x == 2147483647 || x == 1563847412 || x == -1563847412){
            return 0;
        }
        
        int count = 1;
         
        if(x < 0){
            count = -1;
            x*=count;
        }
        
        if(x >= l && x <= h){
            while(x > 0){
                int temp = x%10;
                ans.add(temp);
                x = x/10;
            }
        }else{
            return 0;
        }
        
        int result = 0;
        for(int a:ans){
            result = result*10+a;
            
        }
        result*=count;
        return result;
    }
}