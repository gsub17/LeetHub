// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] visited = new boolean[V];
        boolean[] recursive_stack = new boolean[V];
        
        for(int i = 0 ; i < V ;i++){
            if(dfs(i , adj , visited , recursive_stack)){
                return true;
            }
        }
        return false;
    }
    
    public boolean dfs(int v, ArrayList<ArrayList<Integer>> adj , boolean[] visited , boolean[] recursive_stack){
        visited[v] = true;
        recursive_stack[v] = true;
        
        for(int neighbour:adj.get(v)){
            if(!visited[neighbour]){
                if(dfs(neighbour , adj , visited , recursive_stack)){
                    return true;
                }
            }else if(recursive_stack[neighbour]){
                return true;
            }
        }
        recursive_stack[v] = false;
        return false;
    }
}