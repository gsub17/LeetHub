// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}// } Driver Code Ends




class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String p)
    {
        // add your code here
        Stack<Character> s = new Stack<>();
        char[] arr = p.toCharArray();
        int count = 0;
        
        for(int i = 0 ; i < arr.length ;i++){
            char x = arr[i];
            if(x == '(' || x == '{' || x == '['){
                s.push(x);
                count++;
            }else if(!s.isEmpty()){
                if(s.peek() == '{' && x == '}'){
                    s.pop();
                    count--;
                }else if(s.peek() == '(' && x == ')'){
                    s.pop();
                    count--;
                }else if(s.peek() == '[' && x == ']'){
                    s.pop();
                    count--;
                }else{
                    count--;
                }
            }else{
                return false;
            }
        }
        if(s.isEmpty() && count == 0){
            return true;
        }
        return false;
    }
}
