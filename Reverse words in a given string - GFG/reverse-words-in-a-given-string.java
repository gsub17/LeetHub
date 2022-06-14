// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        Stack<String> s = new Stack<>();
        char[] arr = S.toCharArray();
        String temp = "";
        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i] != '.'){
                temp+=arr[i];
            }else{
                s.push(temp);
                temp = "";
            }
        }
        s.push(temp);
        
        String ans2 = "";
        while(!s.isEmpty()){
            ans2 = ans2 + s.pop() + '.';
        }
        String ans3 = ans2.substring(0,ans2.length() - 1);
        return ans3;
    }
}