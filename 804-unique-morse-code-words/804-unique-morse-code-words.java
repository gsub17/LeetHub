class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character , String> map = new HashMap<>();
        
        map.put('a' , ".-");
        map.put('b', "-...");
        map.put('c',"-.-.");
        map.put('d' , "-..");
        map.put('e', ".");
        
        map.put('f',"..-.");
        map.put('g' , "--.");
        map.put('h' , "....");
        map.put('i',"..");
        map.put('j' , ".---");
        
        map.put('k',"-.-");
        map.put('l' , ".-..");
        map.put('m' , "--");
        map.put('n' , "-.");
        map.put('o' , "---");
        
        map.put('p' , ".--.");
        map.put('q' , "--.-");
        map.put('r' , ".-.");
        map.put('s' , "...");
        map.put('t' , "-");
        
        map.put('u' , "..-");
        map.put('v' , "...-");
        map.put('w' , ".--");
        map.put('x' , "-..-");
        map.put('y' , "-.--");
        
        map.put('z' , "--..");
        
        HashSet<String> set = new HashSet<>();
        
        for(String i : words){
            char[] arr = i.toCharArray();
            String temp = "";
            for(char j : arr){
                temp+=map.get(j);
            }
            set.add(temp);
        }
        System.out.print(set.toString());
        return set.size();
        
    }
}