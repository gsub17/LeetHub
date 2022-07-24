class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
      //  System.out.println(Arrays.toString(arr));
        for(int i = 0 ; i < arr.length ; i++){
            
            if(map.containsKey(arr[i])){
                
                map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
                
                if(map.get(arr[i]) >= 2){
                    return arr[i];
                }
                
            }else{
                map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
            }
            
        }
      //  System.out.println(map.toString());
        
        return arr[0];
    }
}