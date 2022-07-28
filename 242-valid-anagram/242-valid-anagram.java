class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character , Integer> map1 = new HashMap<>();
    
        
        if(s.length() != t.length()){
            return false;
        }
        
        for(int i = 0 ; i < s.length() ; i++){
            map1.put(s.charAt(i) , map1.getOrDefault(s.charAt(i) , 0)+1);
        }
        
        for(int i = 0 ; i < s.length() ; i++){
           if(!map1.containsKey(t.charAt(i))) return false;
            
            map1.put(t.charAt(i) , map1.get(t.charAt(i))-1);
            if(map1.get(t.charAt(i)) == 0) map1.remove(t.charAt(i));
        }
        
        return true;
    
    }
}