class Solution {
    
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());  // change order to ascending order
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    
    public int minSetSize(int[] arr) {
        int n = arr.length;
        
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i , map.getOrDefault(i , 0)+1);
        }
        
        
        System.out.println(map.toString());
        
        Map<Integer, Integer> hm1 = sortByValue(map);
        System.out.println(hm1.toString());
        
        int ans = 0;
        int sum = 0;
        
        for (Map.Entry<Integer,Integer> mapElement : hm1.entrySet()) {

            sum = (mapElement.getValue() + sum);
            ans++;
            if(sum >= n/2)return ans;
            
        }
        
        return ans;
        
    }
}