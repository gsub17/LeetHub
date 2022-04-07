class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        if(len(stones) == 1):
            return stones[0]
        
       
        while(len(stones) > 1):
            stones.sort()
            print(stones)
            x = stones[len(stones)-1]
            y = stones[len(stones)-2]
            if x==y:
                stones.pop(len(stones)-1)
                stones.pop(len(stones)-1)
                print(stones)
            else:
                z = x-y
                stones.pop(len(stones)-1)
                stones[len(stones)-1] = z
                print(stones)
        
        if(len(stones) == 1):
            return stones[0]
        
        return 0
        