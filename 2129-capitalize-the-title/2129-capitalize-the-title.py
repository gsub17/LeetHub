class Solution:
    def capitalizeTitle(self, title: str) -> str:
        x = title.split()
        s = ''
        for i in x:
            if len(i) <= 2:
                s = s + i.lower() + ' '
            else:
                s = s + i.title() + ' '
                
        s = s.rstrip()
        return s
        
        