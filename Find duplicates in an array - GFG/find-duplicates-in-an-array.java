// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int a:arr){
            map.put(a,map.getOrDefault(a , 0)+1);
        }
       // System.out.println(map.toString());
        for(int a:arr){
            if(map.containsKey(a)){
                if(map.get(a) > 1){
                    ans.add(a);
                    map.remove(a);
                }
            }
        }
        if(ans.size() == 0){
            ans.add(-1);
            return ans;
        }
        Collections.sort(ans);
        return ans;
    }
}
